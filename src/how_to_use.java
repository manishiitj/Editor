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

public class how_to_use {
	
	public how_to_use(){
		JFrame f=new JFrame("How To Use");
		
		JPanel panel = new JPanel(); 
		JTextArea ta=new JTextArea();
		ta.setBackground(Color.ORANGE);
		JScrollPane sr = new JScrollPane(ta);
        panel.add(sr); 
		FileInputStream fis ;  
        BufferedReader br ;  
        FileOutputStream fos ;
		 
            try  
            {  
                fis = new FileInputStream("how.txt") ;  
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
            ta.setEditable(true);
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
		how_to_use a=new how_to_use();
	}

}
