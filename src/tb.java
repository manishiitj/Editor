

import java.util.*;
    
// Main application class that computes and prints edit distances between two strings
class EditDistanceApp {

  // Dynamic programming matrix
  private AEditOp [][] dpMatrix;

  // Initial string
  private String fromString;

  // Final string
  private String toString;

  // Constructor to build an edit disance calulator between "from" string and "to" string
  public EditDistanceApp (String from, String to) {
    fromString = " " + from;
    toString = " " + to;
    dpMatrix = new AEditOp[fromString.length ()][toString.length ()];
  }
  
  // Factory to create a list of possible edit operations
  private ArrayList <AEditOp> opFactory (int i, int j) {
    char fromChar = fromString.charAt(i);
    char toChar = toString.charAt(j);
    ArrayList <AEditOp> myFactory = new ArrayList <AEditOp> ();
    myFactory.add (new InsertOp (dpMatrix, i, j, fromChar, toChar));
    myFactory.add (new DeleteOp (dpMatrix, i, j, fromChar, toChar));
    myFactory.add (new XformOp (dpMatrix, i, j, fromChar, toChar));
    myFactory.add (new NoOp (dpMatrix, i, j, fromChar, toChar));
    myFactory.add (new RepeatOp (dpMatrix, i, j, fromChar, toChar));
    return myFactory;
  }

  // Method to compute and print the edit distance between two strings
  public void printEdits () {
    for (int i = 0; i < fromString.length (); i++) {
      for (int j = 0; j < toString.length (); j++) {     
        dpMatrix[i][j] = null;
        ArrayList <AEditOp> editOpList = opFactory (i, j);
        for (AEditOp current : editOpList) {
          if (dpMatrix[i][j] == null || current.getCostToHere () < dpMatrix[i][j].getCostToHere ()) {
            dpMatrix[i][j] = current;
          }
        }
      }
    }
    
    dpMatrix[fromString.length () - 1][toString.length () - 1].printEdits ();
  }

  public static void main(String[] args) {
    // Compute the distance between two test strings
    EditDistanceApp app = new EditDistanceApp ("asxaaxdsfaayyahhhhzzzjj", "asaadsfaaaahhhzzzjjj");
    app.printEdits ();
  }
}

// an edit operation transfroms one character into another
abstract class AEditOp {
 
  // this is the previous edit operation in the optimal transform of a into b
  private AEditOp parent = null;
  
  // this is the total cost to get to this particular edit operation
  private int costToHere = 999999999;

  // print yourself nicely to the screen
  public abstract void printSelf ();
  
  // set up the internal stuff--parent and cost
  protected void setup (AEditOp myParent, int cost) {
    parent = myParent;
    costToHere = cost;
  }
  
  // get the total cost 
  public int getCostToHere () {
    return costToHere;  
  }
  
  // print all of the edits needed to get from string a to string b
  public void printEdits () {
    
    if (parent != null) {
      parent.printEdits ();
    }
    
    printSelf ();
  }
  
}

class InsertOp extends AEditOp {
  
  // this is the char we are inserting
  private char insertedChar;
  
  // this is where we do the insert
  private int atWhichPos;
  
  public InsertOp (AEditOp [][] matrix, int i, int j, char fromChar, char toChar) {

    // make sure string b is not empty (if it is, can't insert to get to it)
    if (j != 0) {
      setup (matrix[i][j - 1], matrix[i][j - 1].getCostToHere () + 1);
      insertedChar = toChar;
      atWhichPos = i;
    }
  }
  
  public void printSelf () {
    System.out.format ("Insert %c at pos %d.\n", insertedChar, atWhichPos);  
  }
}

class DeleteOp extends AEditOp {
  
  // this is the char we are deleting
  private char deletedChar;
  
  // this is where we do the delete
  private int atWhichPos;
  
  public DeleteOp (AEditOp [][] matrix, int i, int j, char fromChar, char toChar) {
    
    // if string a is empty, we can't delete to get to it!
    if (i != 0) {
      setup (matrix[i - 1][j], matrix[i - 1][j].getCostToHere () + 1);
      deletedChar = fromChar;
      atWhichPos = i;
    }
  }
  
  public void printSelf () {
    System.out.format ("Deleted %c from pos %d.\n", deletedChar, atWhichPos);  
  }
}

class XformOp extends AEditOp {
  
  // these are the characters we are transforming
  private char charFrom;
  private char charTo;

  // this is where we do the transform
  private int atWhichPos;
  
  public XformOp (AEditOp [][] matrix, int i, int j, char fromChar, char toChar) {
    
    // if either string has no characters, can't do a xform
    if (i != 0 && j != 0) {
      setup (matrix[i - 1][j - 1], matrix[i - 1][j - 1].getCostToHere () + 1);
      charFrom = fromChar;
      charTo = toChar;
      atWhichPos = i;
    }
  }
  
  public void printSelf () {
    System.out.format ("Transformed %c at pos %d to %c.\n", charFrom, atWhichPos, charTo);
  }
}

class NoOp extends AEditOp {
  
  public NoOp (AEditOp [][] matrix, int i, int j, char fromChar, char toChar) {
    
    // if we have no chars, a no-op is fine
    if (i == 0 && j == 0) {
      setup (null, 0);
    
    // this is the classic case
    } else if (i != 0 && j != 0 && fromChar == toChar) {
      setup (matrix[i - 1][j - 1], matrix[i - 1][j - 1].getCostToHere ());
    }
  }
  
  public void printSelf () {
    // don't print anything... it is no-op!
  }
}

class RepeatOp extends AEditOp {
  
  // this is the char we are repeating
  private char repeatedChar;
  
  // this is where we do the repeat
  private int atWhichPos;
  
  public RepeatOp (AEditOp [][] matrix, int i, int j, char fromChar, char toChar) {
    
    // if string b is empty, we can't repeat to get to it
    if (j != 0 && fromChar == toChar) {
      setup (matrix[i][j - 1], matrix[i][j - 1].getCostToHere ());
      repeatedChar = toChar;
      atWhichPos = i;
    }
  }
  
  public void printSelf () {
    System.out.format ("Repeated %c at pos %d.\n", repeatedChar, atWhichPos);  
  }
}

