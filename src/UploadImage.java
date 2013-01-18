  
import java.sql.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.image.*;
import java.awt.event.*;

public class UploadImage extends JFrame {
Image img;
JTextField text=new JTextField(20);
JButton browse ;
JPanel p=new JPanel(new GridLayout(1,2));
JLabel label=new JLabel();
File file = null;
String path="";
public UploadImage() {

browse = new JButton("Upload");  
text.setBounds(20,20,140,20);
browse.setBounds(160,20,100,20);
label.setBounds(20,40,260,20);
 
add(p);
setSize(600,500);
add(text);
add(browse);
 
add(label);
setVisible(true);

browse.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
JFileChooser chooser = new JFileChooser();
chooser.addChoosableFileFilter(new ImageFileFilter());
int returnVal = chooser.showOpenDialog(null);

if(returnVal == JFileChooser.APPROVE_OPTION) {
file = chooser.getSelectedFile();
 path=file.getPath();
ImageIcon icon=new ImageIcon(path);
label.setIcon(icon);
text.setText(path);

repaint();
}
}
});
 
}

public static void main(String[] args) {
 new UploadImage();
}

}
class ImageFileFilter extends javax.swing.filechooser.FileFilter {
public boolean accept(File file) {
if (file.isDirectory()) return false;
String name = file.getName().toLowerCase();
return (name.endsWith(".jpg") || name.endsWith(".png")|| name.endsWith(".gif"));
}
public String getDescription() { return "Images (*.gif,*.bmp, *.jpg, *.png )"; }
}

