class Person{

    String name;
    int vida;


    public  Person (String name,int vida){  
        this.name=name;
        this.vida=vida;


    }

    public void mostrar_estado(){
        System.out.println(name+" - vida "+vida);


    }



}


public class paso_referencia {
    

    public static void main(String[] args) {
        
        Person goku = new Person("goku ",100);
        goku.mostrar_estado();
        modificarObjeto(goku);
        goku.mostrar_estado();
    }



    public static void modificarObjeto(Person personaje){
        personaje.vida=50;

    }



}
