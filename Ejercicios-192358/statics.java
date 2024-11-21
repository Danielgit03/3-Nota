
class auto{

private String marca;
private String autor;
private int hp;
private int torque;
private static double discount;


public auto(String marca,String autor,int hp ,int torque){
    this.marca=marca;
    this.autor=autor;   
    this.hp=hp;
    this.torque=torque;
    auto.discount=10;

}

@Override
public String toString(){

    return "Auto :  "+marca+"  Autor :  "+autor+"  potencia  HP : "+hp+" torque "+torque;
}


}






public class statics {

    public static void main(String[] args) {
        auto ferrari=new auto(" ferrari", "enzoferrari", 42, 110);

        System.out.println(ferrari);
      


    }
    
}
