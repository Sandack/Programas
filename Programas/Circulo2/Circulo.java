import java.awt.*;
import java.awt.Font;
import javax.swing.JApplet;
import javax.swing.JFrame;
 

public class Circulo extends JApplet {

  public void paint (Graphics g) {

    g.setFont(new Font("TimesRoman", 0, 500)); 
    g.drawString ("°*", 60, 430);
  }

  public static void main (String[] args){

    JFrame frame = new JFrame ("Cargando JApplet");
    Circulo circuloApplet = new Circulo();
    circuloApplet.init();
    frame.getContentPane().add(circuloApplet);
    frame.setSize(300,300);
    frame.setVisible(true);
  }
}