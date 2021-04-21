import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Circulo extends JApplet {
  int x=50;
  int y=100;

  public void paint (Graphics g) {
    while(x<=100 && y<=150){
      x=x+1;
      y=y+3;
      g.drawString (".", x, y);      

    }
       while(x<=100 && y<=150){
      x=x+1;
      y=y+3;
      g.drawString (".", x, y);   
       }
    /*g.drawString ("MIZQ", 50, 100);
    g.drawString ("MITAD", 100, 100);
    g.drawString ("arriba", 100, 50);
    g.drawString ("ABAJO", 100, 150);
    g.drawString ("MDER", 150, 100);*/
  }

  public static void main (String[] args){
    JFrame frame = new JFrame ("Circulo");
    Circulo circuloApplet = new Circulo();
    circuloApplet.init();
    frame.getContentPane().add(circuloApplet);
    frame.setSize(200,200);
    frame.setVisible(true);

  }
}