  import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;

public class abtsoft {
	
	public abtsoft(){
		JFrame f=new JFrame("About Software");
		
		JPanel panel = new JPanel(); 
		JTextArea ta=new JTextArea();
		ta.setBackground(Color.PINK);
		JScrollPane sr = new JScrollPane(ta);
         panel.add(sr); 
		 
        FileInputStream fis ;  
        BufferedReader br ;  
        FileOutputStream fos ;
		 
            try  
            {  
                fis = new FileInputStream("abtsoft.txt") ;  
                br  = new BufferedReader(   
                      new InputStreamReader( fis ) ) ;  
                String read ;  
                StringBuffer text = new StringBuffer() ;  
                while( ( read = br.readLine() ) != null )   
                {  
                   text.append( read ).append( "\n" ) ; 
                   
                }  
                 
                ta.setText( text.toString() ) ;  
            }  
            catch( IOException e )   
            {  
                  
        }    
   panel.add(ta);
            f.add(panel);
		 
		 
		
		WindowListener winListener = new WindowAdapter() {
			  public void windowClosing(WindowEvent event) {    
				  											     
			  }
			  };
			  f.addWindowListener(winListener);
			  f.setVisible(true);
			  f.pack();
				 
		
	}
	
	public static void main(String args[]){
		abtsoft a=new abtsoft();
	}

}
