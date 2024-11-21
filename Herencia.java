class Carro{


    double peso;
    double altura;
    double ancho;
    double largo;
boolean encendido;
int num_puertas;
String marca;
String modelo;


public Carro(double peso,double altura,double ancho,double largo,boolean encendido,int num_puertas,String marca,String modelo){

this.peso=1900;
this.altura=1.90;
this.ancho=3.2;


}

public double  obtenerpeso(){
   
    return this.peso;
}


}















public class Herencia {

    public static void main(String[] args) {
        
        Carro c=new Carro(180, 180, 4, 2, false, 4, "XD", "1993");

        c.obtenerpeso();
        

    }
    
}