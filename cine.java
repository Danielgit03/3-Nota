
class tikets{
    
    private static  int contador;
    private int numero;
    private String fechaCompra;
    private String  DNI;

    //cosntructor
    public tikets(String fechaCompra, String DNI){

        contador++; //contador cuente
        this.numero=contador;
        this.fechaCompra=fechaCompra;
        this.DNI=DNI;

    }

    //get
    @Override
    public String toString(){

        return "Tiket { "+ "numero" +numero
        +", fecha de compra= "+fechaCompra
        + "DNI PERSONA = "+DNI + "}";
    }

}








public class cine {

    public static void main(String[] args) {
        
        tikets t1 =new tikets( "12/05/24 ", "3464575");
        tikets t2 =new tikets( "08/05/24", "2308534");
        tikets t3 =new tikets( "31/11/24", "0894221");
        tikets t4 =new tikets( "03/05/24 ", "73259045");

        

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);


    }
    
}
