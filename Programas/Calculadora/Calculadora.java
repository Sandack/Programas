
  public class Calculadora{
  //Atributos de la clase
      private static float n1;
      private static float n2;
      private static float resul;
      private static String op;
    
    public static void operacion(String op,float n1,float n2,float resul){  
      switch(op){
        case "suma": resul= n1+n2;
              System.out.print(resul);
              break;
        case "resta": resul= n1-n2;
              System.out.print(resul);
              break;
      case "multiplicacion": resul= n1*n2;
              System.out.print(resul);
              break;
        case "division": 
              if (n2==0){
        System.out.print("No se puede dividir por 0");}
        else{
          resul= n1/n2;
              System.out.print(resul);
              break;
        }
      break;
        } 
    }
    public static void main(String[] args){
          //n1,n2//
      float n1=3;
      float n2=0;
          //op=suma,resta,multiplicacion,division;//
      op="division";
      operacion(op,n1,n2,resul);
  }    

