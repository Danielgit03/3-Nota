class Rectangulo{ // es el objeto
    int ancho;
    int altura;  // estas variables son los atributos 


}




public class referencia_ejercicio2 {
   
    
    public static void modificarRectangulo(Rectangulo rectangulo){  // declaro un metodo dentro de la clase principal
        rectangulo.ancho=8;
        rectangulo.altura=10;
        System.out.println("Valores dentro del metodo  Ancho :"+rectangulo.ancho +" La altura : "+rectangulo.altura);
    }
    public static void main(String[] args) {
        
        Rectangulo rectangulo = new Rectangulo(); //Declaar el objeto ---- rectangulo es variable 
        // es la variable ( . ) lo que hace es acceder los atributos de lss variables  aca en main 
        
        System.out.println(" Antes de modificar : Rectangulo Ancho = "+rectangulo.ancho+" Rectangulo altura =  "+rectangulo.altura);
        modificarRectangulo( rectangulo); // rectangulo es la variable del objeto y modificar rectangulo es el metodo y dentro pongo la variable por paso 
        
        System.out.println("Después de modificar: ancho = " + rectangulo.ancho + ", alto = " + rectangulo.altura);
     

    }
}
