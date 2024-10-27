


public class paso_ejercicios4{

    
public static int  incrementar(int x){
 x+=1;
System.out.println("Dentro del metodo = "+x);
return  x;

}


    public static void main(String[] args) {
        
        int x =1;
System.out.println("Valor antes de retornar = "+x);
x=incrementar(x);
System.out.println("Valor despues de retornar = "+x);


        
    }








}