public class valor_ejercicio5 {
 
    
public static void modificarcadena(String texto){

    texto = "Lu";
    System.out.println("dentro del metodo es : "+ texto);


}


public static void main(String[] args) {
    
String texto = "Daniel";
System.out.println("En el original : " + texto);
modificarcadena(texto);
System.out.println("Despues de pasarla por valor : "+texto);

}
// conclusion las cadenas de texto son inmutables
}
