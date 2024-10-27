class Personaje{

    String name;
    int vida;


    public  Personaje (String name,int vida){  
        this.name=name;
        this.vida=vida;


    }

    public void mostrar_estado(){
        System.out.println(name+" - vida "+vida);


    }



}


public class paso_referencia {
    

    public static void main(String[] args) {
        
        Personaje goku = new Personaje("goku ",100);
        modificarObjeto(goku);
        goku.mostrar_estado();
    }



    public static void modificarObjeto(Personaje personaje){
        personaje.vida=50;

    }



}
