/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gis.gui;

/**
 *
 * @author User
 */
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class ImageLoader extends JFrame {
  public ImageLoader() {
    super("JScrollPane Demo");
    ImageIcon ii = new ImageIcon("largeJava2sLogo.jpg");
    JScrollPane jsp = new JScrollPane(new JLabel(ii));
    getContentPane().add(jsp);
    setSize(300, 250);
    setVisible(true);
  }

//  public static void main(String[] args) {
//    new ImageLoader();
//  }
}
           
         
  
