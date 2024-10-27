
public class exercise  {




    public static void main(String[] args) {
        
        double t_shirt = 25d;
       double  pants= 30d;
       double  discount = 0.85;
        
        double total_Tshirt = t_shirt*discount;
        double total_pants = pants*discount;
        double Total = total_Tshirt+total_pants;
        
        System.out.println("el valor total a pagar es =  "+Total);
        
        // el caso en que se pidan 2 camisas y un pantalon 
        
         double Total_Tshirt = t_shirt*discount;
         double Total_Tshirt_descount=Total_Tshirt*0.95;
        double Total_pants = pants*discount;
        double total = Total_Tshirt_descount+total_pants;
        
         System.out.println("el valor total a pagar es =  "+total);
     }
    }