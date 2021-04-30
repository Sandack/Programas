package objeto;
import java.awt.*;

public class Rectangulo{
  private int CoorX,CoorY,Ancho,Alto;

 public Rectangulo (int XInicial, int YInicial, int AnchoInicial, int AltoInicial ) {
   CoorX=XInicial;
   CoorY=YInicial;
   Ancho=AnchoInicial;
   Alto=AltoInicial;
 }
  public void mostrar2 (Graphics g) {
 g.setColor(Color.white);  
 g.fillRect (CoorX,CoorY,Ancho,Alto);
}
}