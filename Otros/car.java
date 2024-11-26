import java.util.Scanner;

class vehiculos {
String marca;
String modelo;
float precio;

//constructor
vehiculos (String marca,String modelo,float precio){

    this.marca=marca;
    this.modelo=modelo;
    this.precio=precio;


}

public float getprecio(){

    return precio;
}

public void mostrardatos(){

    System.out.println(" La marca del carro es : "+marca);
    System.out.println(" El modelo del carro es : "+modelo);
    System.out.println("El precio del carro es : "+precio);
}




    
}




public class car {

public static int indCocheMBarato(vehiculos coches[]){
    float precio;
    int indice=0;
    precio=coches[0].getprecio();


        for(int i=1;i<coches.length;i++){

            if(coches[i].getprecio()<precio){

                precio =coches[i].getprecio();
                indice=i;
            }


        }
    return indice ;
}


    public static void main(String[] args) {
        

        Scanner scan =new Scanner(System.in);

        String marca,modelo;
        float precio;
        int indiceBarato;
        System.out.println("Cuantos vehiculos quiere");
        int num_vehiculos = scan.nextInt();
        //creamos los objetos

        vehiculos coches[]=new vehiculos[num_vehiculos];

        for(int i=0;i<coches.length;i++){
            scan.nextLine();
            System.out.println("\n Digite las caracteisticas del coche"+(i+1)+" : ");
            System.out.println("Ingrese la marca");
            marca=scan.nextLine();
            System.out.println("Ingrese el modelo ");
            modelo=scan.nextLine();
            System.out.println("Ingrese el precio del vehiculo");
            precio=scan.nextFloat();

            coches[i]=new vehiculos(marca,modelo,precio);
        }

        indiceBarato= indCocheMBarato(coches);
        System.out.println("El coche mas barato es : "+coches[indiceBarato]);
        coches[indiceBarato].mostrardatos();

        
        scan.close();
        
    }
    
}
