


public class paso_ejercicio1{


    public static void intercambiar(int a,int b){

        a=a+b;
        b=a-b;
        a-=b;
        
        }
  public static void main(String[] args) {
    
    int a = 5;
    int b=10;
    System.out.println("Antes de cambiar el metodo  A = "+ a+" y el B = "+b );
    intercambiar(a, b);
    System.out.println(" despues de cambiar , Variable A = "+a+" Variable B = "+b);

  }

  
}