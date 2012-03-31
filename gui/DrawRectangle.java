/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gis.gui;

/**
 *
 * @author User
 */
import java.awt.*;
import javax.swing.*;

/* Create <strong class="highlight">a</strong> new graphics component that draws two rectangles 
*/
public class DrawRectangle extends JPanel
{
private int width;
private int length;
private int y;
private int x;
   // overrides javax.swing.JComponent.paintComponent
   public void paintComponent(Graphics g)
   {
      //Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
		
      
      Rectangle box = new Rectangle(x, y, width, length);
      g2.draw(box);
   }
   public DrawRectangle(int x, int y, int Width, int Length)
   {	   
	   this.x = x;
	   this.y = y;
	   this.width = Width;
	   this.length = Length;	   
   }

//public static void main(String[] args)
//{
//   JFrame frame = new JFrame();
//   final int FRAME_WIDTH = 300;
//   final int FRAME_HEIGHT = 400;
//	
//   frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
//   frame.setTitle("Test Picture");
//   frame.setDefaultCloseOperation(
//         JFrame.EXIT_ON_CLOSE);
//		
//   DrawRectangle component1 = new 
//         DrawRectangle(10, 10 , 10 , 10);
//   DrawRectangle component2 = new 
//         DrawRectangle(15, 15 , 50 , 50);
//   frame.add(component1);  //is not displayed!
//   frame.add(component2);  //component2 overwrites component1!!!
//   frame.setVisible(true);
//}
}
