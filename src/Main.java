import java.awt.*;
 
import java.io.*;
 
 
import javax.swing.*;

import java.awt.event.*;
 
import javax.swing.undo.*;
import javax.swing.text.*;
import javax.swing.event.*;
public class Main{
	JComboBox combo;
	JFrame frame=new JFrame("Manish");
	static JTextArea area;
	
	
	public class MyAction15 implements ActionListener{ 
	   	  public void actionPerformed(ActionEvent e){
	   		JTabbedPane jtp = new JTabbedPane();
	        frame.getContentPane().add(jtp);
	        JPanel jp1 = new JPanel();
	         
	        area.setEditable(true);
	        jp1.add(area);
	      
	        jtp.addTab("New Tab", jp1);
	         
	   	  }
	   	  }
	
	public class MyAction45 implements ActionListener{ 
	   	  public void actionPerformed(ActionEvent e){
	   	       SimpleAudioPlayer s=new SimpleAudioPlayer();
	   	  }
	   	  }
	
	public class MyAction44 implements ActionListener{
	   	  public void actionPerformed(ActionEvent e){
	   	      Browser b=new Browser();
	   	  }
	   	  }	
	
	public class MyAction33 implements ActionListener{          
	   	  public void actionPerformed(ActionEvent e){
	   	     SimpleBarChart sc=new SimpleBarChart();
	   	  }
	   	  }	 
	public class MyAction31 implements ActionListener{
	   	  public void actionPerformed(ActionEvent e){
	   	    UploadImage img=new UploadImage();
	   	  }
	   	  }	
	
	 public class MyAction34 implements ActionListener{
	   	  public void actionPerformed(ActionEvent e){
	   	    tb t=new tb();
	   	  }
	   	  }	
	
	public class MyAction42 implements ActionListener{
	  	  public void actionPerformed(ActionEvent e){
	        ImageColorEffect s=new ImageColorEffect();
	    
	  	    
	  	  }
	  	  }	
	
	
	 public class MyAction41 implements ActionListener{
	   	  public void actionPerformed(ActionEvent e){
	   	   
	   	   
	   		 
	   	   ScientificCalculator sa=new  ScientificCalculator();
	   	  }
	   	  }	
	
	public class MyAction24 implements ActionListener{
	  	  public void actionPerformed(ActionEvent e){
	  		frame.addWindowListener(
	  		         new WindowAdapter() {
	  		           }
	  		      );
	  		    final UndoManager undo=new UndoManager();
	  		    Document d=area.getDocument();
	  		  d.addUndoableEditListener(new UndoableEditListener() {
	  			  public void undoableEditHappened(UndoableEditEvent evt){
	  			  undo.addEdit(evt.getEdit());
	  			  }
	  			  });
	  		  
	  		try {
	  		  if (undo.canUndo()) {
	  		  undo.undo();
	  		  }
	  		  }
	  		  catch (CannotUndoException ae) {
	  		  }
	  	  }
	  	  }	
	
	
	public class MyAction23 implements ActionListener{
	  	  public void actionPerformed(ActionEvent e){
	  		    String s=area.getSelectedText();
	  		    area.append(s);
	  		     
	  	  }
	  	  }	
	
	public class MyAction13 implements ActionListener{
	  	  public void actionPerformed(ActionEvent e){
	  		    area.setText("");
	  		    
	  	  }
	  	  }	
	public class MyAction14 implements ActionListener{
	  	  public void actionPerformed(ActionEvent e){
	  		   System.exit(0);
	  	  }
	  	  }	
	public class MyAction51 implements ActionListener{
	  	  public void actionPerformed(ActionEvent e){
	  		    abtsoft s=new abtsoft();
	  	  }
	  	  }	
	public class MyAction52 implements ActionListener{
	  	  public void actionPerformed(ActionEvent e){
	  		    how_to_use u=new how_to_use();
	  	  }
	  	  }	
	
	
	public class MyAction12 implements ActionListener{
	   	  public void actionPerformed(ActionEvent e){
	   		{
	   			try
	   			{
	   			String s=area.getText();
	   			if(s.length()>0)
	   			{
	   			FileDialog fd= new FileDialog(frame,"Save File As",FileDialog.SAVE);
	   			fd.setFile("temp.txt");
	   			fd.setDirectory("c:\\Users\\temp");
	   			fd.setVisible(true);
	   			String path=fd.getDirectory()+fd.getFile();

	   			FileOutputStream fos=new FileOutputStream(path);
	   			System.out.println(s);
	   			byte[] b=s.getBytes();
	   			fos.write(b);
	   			fos.close();
	   			}
	   			}catch(Exception ae){System.out.println(ae);}
	   			}
	   	     
	   	  }
	   	  }	
	
	
	public class MyAction11 implements ActionListener{
		     
	public void actionPerformed( ActionEvent event )    
    {  
		JFileChooser chooser ;  
        FileInputStream fis ;  
        BufferedReader br ;  
        FileOutputStream fos ;
		Object obj = event.getSource() ;  
        chooser = new JFileChooser() ;  
        if ( chooser.showOpenDialog( frame ) ==   
            JFileChooser.APPROVE_OPTION ) 
          
            try  
            {  
                fis = new FileInputStream(   
                      chooser.getSelectedFile() ) ;  
                br  = new BufferedReader(   
                      new InputStreamReader( fis ) ) ;  
                String read ;  
                StringBuffer text = new StringBuffer() ;  
                while( ( read = br.readLine() ) != null )   
                {  
                   text.append( read ).append( "\n" ) ; 
                   
                }  
                 
                area.setText( text.toString() ) ;  
            }  
            catch( IOException e )   
            {  
                  
        }  
    }  }
	 
	public class MyAction7 implements ActionListener{
	  	  public void actionPerformed(ActionEvent e){
	        Font f = area.getFont(); 
	  	  Font f2 = new Font(f.getFontName(), f.getStyle(), f.getSize()+3); 
	  	  area.setFont(f2);
	  	    
	  	  }
	  	  }	
	public class MyAction8 implements ActionListener{
	  	  public void actionPerformed(ActionEvent e){
	        Font f = area.getFont(); 
	  	  Font f2 = new Font(f.getFontName(), f.getStyle(), f.getSize()-3); 
	  	  area.setFont(f2);
	  	    
	  	  }
	  	  }	
	  
	
  

	public class MyAction5 implements ActionListener{
  	  public void actionPerformed(ActionEvent e){
  		JComboBox combo = (JComboBox)e.getSource();

         
        Object newItem = combo.getSelectedItem();
        String s= newItem.toString();
        if(s.equals( "red"))
        	area.setForeground(Color.RED);
        else  if(s.equals( "blue"))
        	area.setForeground(Color.BLUE);
        else  if(s.equals( "orange"))
        	area.setForeground(Color.ORANGE);
        else  if(s.equals( "pink"))
        	area.setForeground(Color.PINK);
        else  if(s.equals( "green"))
        	area.setForeground(Color.GREEN);
        else  if(s.equals( "yellow"))
        	area.setForeground(Color.YELLOW);
        else  if(s.equals( "black"))
        	area.setForeground(Color.BLACK);
        else   
        	area.setForeground(Color.MAGENTA);
  		   
  	  
  	    
  	  }
  	  }	
		  
	 public class MyAction1 implements ActionListener{
    	  public void actionPerformed(ActionEvent e){
    	    
    	   Font curr=area.getFont();
    	   Font bold=null;
    	   int style=curr.getStyle();
    	   if(style==Font.PLAIN||style==Font.ITALIC)
    		   bold=curr.deriveFont(Font.BOLD);
    	   if(bold!=null)
    		   area.setFont(bold);
    	  }
    	  }	   
		  
		  
	 public class MyAction2 implements ActionListener{
   	  public void actionPerformed(ActionEvent e){
   	   String s=area.getSelectedText();
   	   Font curr=area.getFont();
   	   Font bold=null;
   	   int style=curr.getStyle();
   	    
   		   bold=curr.deriveFont(Font.LAYOUT_NO_LIMIT_CONTEXT);
   	   if(bold!=null)
   		   
   		 area.setFont(bold);
   	  }
   	  }	  
	 
	 
	 public class MyAction3 implements ActionListener{
   	  public void actionPerformed(ActionEvent e){
   	   String s=area.getSelectedText();
   	   Font curr=area.getFont();
   	   Font italic=null;
   	   int style=curr.getStyle();
   	   if(style==Font.PLAIN||style==Font.BOLD)
   		   italic=curr.deriveFont(Font.ITALIC);
   	   if(italic!=null)
   		   area.setFont(italic);
   	  }
   	  
   	  }
	 
	 public class MyAction4 implements ActionListener{
   	  public void actionPerformed(ActionEvent e){
   	   String s=area.getSelectedText();
   	    area.cut();
   	     
   	  }
   	  }	
	 
	 
	public class MyAction implements ActionListener{
		  public void actionPerformed(ActionEvent ae){
		  Object EventSource = ae.getSource();
		  String lookAndFeelClassName = null;


		  UIManager.LookAndFeelInfo looks[] = UIManager.getInstalledLookAndFeels();
		  for(int i = 0; i < looks.length; i++){
		  if(ae.getActionCommand().equals(looks[i].getName())){
		  lookAndFeelClassName = looks[i].getClassName();
		  break;
		  }
		  }
		  try{
		  UIManager.setLookAndFeel(lookAndFeelClassName);
		   
		  SwingUtilities.updateComponentTreeUI(frame);
		  }
		  catch(Exception e){
		  JOptionPane.showMessageDialog(frame, "Can't change look and feel:" 
		+ lookAndFeelClassName, "Invalid PLAF", 
		JOptionPane.ERROR_MESSAGE);
		  }
		  }
		  }
	public static void main(String args[])throws Exception{
		Main m=new Main();
        }
	
	Main(){
		JFrame frame=new JFrame("Manish");
		
		frame.setIconImage(Toolkit.getDefaultToolkit() 
				  .getImage("F:/TxEdi/io.jpg"));

		
		
		
		JMenuBar menubar=new JMenuBar();
		JMenu filemenu=new JMenu("File   ");
		filemenu.add(new JSeparator());
		
		JMenu editmenu=new JMenu("Edit   ");
		editmenu.add(new JSeparator());
		
		JMenu insertmenu=new JMenu("Insert  ");
		insertmenu.add(new JSeparator());
		
		JMenu viewmenu=new JMenu("Media   ");
		viewmenu.add(new JSeparator());
		
		JMenu calmenu=new JMenu("Calculate  ");
		calmenu.add(new JSeparator());
		
		JMenu webmenu=new JMenu("Web  ");
		webmenu.add(new JSeparator());
		
		JMenu helpmenu=new JMenu("Help   ");
		helpmenu.add(new JSeparator());
		
	    JMenuItem fileItem1=new JMenuItem("New");
	            fileItem1.addActionListener(new MyAction13());
	    JMenuItem fileItem5=new JMenuItem("New Tab");
	            fileItem5.addActionListener(new MyAction15());
	    JMenuItem fileItem2=new JMenuItem("Open");
	     	    fileItem2.addActionListener(new MyAction11());
	    
	    JMenuItem fileItem3=new JMenuItem("Save");
	            fileItem3.addActionListener(new MyAction12());
	    JMenuItem fileItem4=new JMenuItem("Exit");
	             fileItem4.addActionListener(new MyAction14());
	
	    JMenuItem editItem1=new JMenuItem("Cut");
	              editItem1.addActionListener(new MyAction4());
	    JMenuItem editItem2=new JMenuItem("Copy");
	 
	    JMenuItem editItem3=new JMenuItem("Paste");
	              editItem3.addActionListener(new MyAction23());
	    JMenuItem editItem4=new JMenuItem("Undo");
	              editItem4.addActionListener(new MyAction24());
	    
	    JMenuItem insertItem1=new JMenuItem("Picture");
	              insertItem1.addActionListener(new MyAction31());
	    JMenuItem insertItem2=new JMenuItem("Shape");
	   
	    JMenuItem insertItem3=new JMenuItem("Chart");
	              insertItem3.addActionListener(new MyAction33());
	    JMenuItem insertItem4=new JMenuItem("Table");
	              insertItem4.addActionListener(new MyAction34());
	    
	    //JMenuItem viewItem1=new JMenuItem("Calculate");
	      //        viewItem1.addActionListener(new MyAction41());
	    JMenuItem viewItem2=new JMenuItem("Image Options");
	              viewItem2.addActionListener(new MyAction42()); 
	     
	   
	   // JMenuItem viewItem4=new JMenuItem("Browser");
	    //		  viewItem4.addActionListener(new MyAction44()); 
	    JMenuItem viewItem5=new JMenuItem("Audio");
	    		  viewItem5.addActionListener(new MyAction45()); 
	    		  
	    JMenuItem calItem1=new JMenuItem("Calculate");
	              calItem1.addActionListener(new MyAction41()); 
	              
	    JMenuItem webItem1=new JMenuItem("Browser");
	              webItem1.addActionListener(new MyAction44()); 
	                       
	    		  
	    JMenuItem helpItem1=new JMenuItem("About Software");
	    		  helpItem1.addActionListener(new MyAction51());
	    JMenuItem helpItem2=new JMenuItem("How To Use");
	              helpItem2.addActionListener(new MyAction52());
	
	    filemenu.add(fileItem1);
	    //filemenu.add(fileItem5);
	    filemenu.add(fileItem2);
	    
	    filemenu.add(fileItem3);
	    filemenu.add(fileItem4);
	    
	    editmenu.add(editItem1);
	    editmenu.add(editItem2);
	    editmenu.add(editItem3);
	    editmenu.add(editItem4);
	                                                           
	    insertmenu.add(insertItem1);                          
	    //insertmenu.add(insertItem2);
	    insertmenu.add(insertItem3);
	    insertmenu.add(insertItem4);
	    
	     
	    viewmenu.add(viewItem2);
	   // viewmenu.add(viewItem4);
	    viewmenu.add(viewItem5);
	    
	    calmenu.add(calItem1);
	    
	    webmenu.add(webItem1);
	    
	    helpmenu.add(helpItem1);
	    helpmenu.add(helpItem2);
	    
	    menubar.add(filemenu);
	    menubar.add(editmenu);
	    menubar.add(insertmenu);
	    menubar.add(viewmenu);
	    menubar.add(calmenu);
	    menubar.add(webmenu);
	    menubar.add(helpmenu);
 	    frame.setJMenuBar(menubar);
 	    JToolBar toolbar = new JToolBar("Toolbar", JToolBar.HORIZONTAL);
 	    JButton cutbutton = new JButton(new ImageIcon("cut.jpg"));
 	   cutbutton.addActionListener(new MyAction4());
 	    toolbar.add(cutbutton);
 	    JButton copybutton = new JButton(new ImageIcon("copy.jpg"));
 	    toolbar.add(copybutton);
 	    JButton pastebutton = new JButton(new ImageIcon("paste.jpg"));
 	   pastebutton.addActionListener(new MyAction23());
 	    toolbar.add(pastebutton);
 	   String course[] = {"red","blue","orange","pink","green","yellow","black","magenta"};
 	 	  JComboBox combo = new JComboBox(course);
 	 	  
 	 	 combo.addActionListener(new MyAction5());
 	 	  combo.setBackground(Color.GREEN);
 	 	  combo.setForeground(Color.black);
 	      toolbar.add(combo);
 	      
 	      
 	      
 	      
 	     String co[] = {"","5","10","50","d","d","d","d","d","d"};
	 	  JComboBox combo1 = new JComboBox(co);
	 	   combo.setBackground(Color.yellow);
	 	  combo1.setForeground(Color.green);
	      
 	      
 	      
 	     JButton boldbutton = new JButton(new ImageIcon("bold.jpg"));
 	     boldbutton.addActionListener(new MyAction1());
 	   

  	    toolbar.add(boldbutton);
  	    
  	  JButton underlinebutton = new JButton(new ImageIcon("underline.jpg"));
  	   underlinebutton.addActionListener(new MyAction2());
	    toolbar.add(underlinebutton);
	    
	    JButton italicbutton = new JButton(new ImageIcon("italic.jpg"));
	    italicbutton.addActionListener(new MyAction3());
 	    toolbar.add(italicbutton);
 	    
 	    
 	   JButton sizep = new JButton(new ImageIcon("+.jpg"));
 	  	sizep.addActionListener(new MyAction7());
 		    toolbar.add(sizep);
 		    
 		   JButton sizem = new JButton(new ImageIcon("-.jpg"));
 	 	  	sizem.addActionListener(new MyAction8());
 	 		    toolbar.add(sizem);    
 	     
 	    frame.getContentPane().add(toolbar,BorderLayout.NORTH);
 	    
 	   
 	   UIManager.LookAndFeelInfo lookAndFeels[]= UIManager.getInstalledLookAndFeels();

 	                                         
 	                                          JPanel panel2 = new JPanel();
 	                                          JPanel panel = new JPanel();
 	                                          area = new JTextArea(22,56);
 	                                          area.setBackground(Color.green);
 	                                          JScrollPane sr = new JScrollPane(area);
 	                                          panel.add(sr);
 	                                          for(int i = 0; i < lookAndFeels.length; i++){
 	                                          JButton button = new JButton(lookAndFeels[i].getName());
 	                                          button.addActionListener(new MyAction());
 	                                          panel2.add(button);
 	                                          }
 	                                          frame.add(panel);
 	                                          frame.add(panel2, BorderLayout.SOUTH);
 	                                          frame.setVisible(true);
		frame.pack();
 	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	
}