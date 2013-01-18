  import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Browser {
	public static void main(String[] args) {
		Browser bs=new Browser();
	}
	
	public Browser(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		final JTextField url =new JTextField(20);
		JButton button = new JButton("Open Browser");
		button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		OpenBrowser.openURL(url.getText().trim()); }
		} );
		            
		panel.add(new JLabel("URL:"));
		panel.add(url);
		panel.add(button);
		frame.getContentPane().add(panel);
		frame.pack();
		WindowListener winListener = new WindowAdapter() {
			  public void windowClosing(WindowEvent event) {
			     
			  }
			  };
			  frame.addWindowListener(winListener);
			  frame.setVisible(true);
		}

}
