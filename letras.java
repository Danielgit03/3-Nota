


public class letras {

    public static void main(String[] args) {
       
System.out.println(remplazar_letras("Hola pa"));
System.out.println(remplazar_letras("ABC"));
System.out.println(remplazar_letras("RNG"));
System.out.println(remplazar_letras("AZ"));

    }




    public static String remplazar_letras(String input){


         String resultado=" ";

         for(int i=0; i<input.length();i++){

              char c = input.charAt(i);

              if(c>='A'&& c<= 'Z'){

                   c = (char) (c + ('a' - 'A')); // casting
              
              
              }

              if(c==' '){
                   continue;
              }

              if(c < 'a' || c >'z'){

              continue;

              }

              c -= 'a'+1;



         }


         return resultado.isEmpty() ? " ": resultado.trim();
    }
    
}
