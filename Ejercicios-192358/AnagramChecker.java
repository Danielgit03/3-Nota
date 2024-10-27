

public class AnagramChecker {
    public static void main(String[] args) {


        char[] palabra1 ={'A','M','O','R'};
        char[] palabra2 ={'M','O','R','I'};

       

        int contador=0;
        int long_palabra1 = palabra1.length;
        int long_palabra2= palabra2.length;

         if (long_palabra1!= long_palabra2) {
            System.out.println("No es anagrama");
            return;
        }

        for(int i=0;i<long_palabra1;i++){
            for(int j=0;j<long_palabra2;j++){
                if (palabra1[i]==palabra2[j]) {
                    palabra2[j]=' ';
                    contador++;
                   
                    break;
                   

                }

            }


        }
        
        if (contador==long_palabra1) {
            System.out.println("Es anagrama");
            
        }else{
            System.out.println("No es Anagrama");
        }


        
    }
   
    }


