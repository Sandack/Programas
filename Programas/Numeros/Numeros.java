public class Numeros{

  public static int num_limite_inf=8;
  public static int num_limite_sup=32;

  public static void numeros_impares(int num_limite_inf,int num_limite_sup){
    System.out.println("Numeros impares: ");
      for(int i=num_limite_inf; i<=num_limite_sup;i=i+2){
        System.out.println(i); 
        
      }
    
  };
  
  public static void numeros_pares(int num_limite_inf,int num_limite_sup){
      int i=num_limite_inf;
       System.out.println("Numeros pares: ");
      do{
         System.out.println(i);
        i=i+2;
       } while(i<=num_limite_sup);   
       
    }

  public static void main (String[] args){    
    if (num_limite_inf%2==0){
  numeros_pares(num_limite_inf,num_limite_sup);
  numeros_impares(num_limite_inf+1, num_limite_sup);
  }else{
    numeros_pares(num_limite_inf+1,num_limite_sup);
    numeros_impares(num_limite_inf, num_limite_sup);
  }
}
}
