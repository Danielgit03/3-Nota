public class numerosPrimos {
    
    public static void main(String[] args) {
        

for (int i=2;i<=100;i++){
    boolean esprimo=true;
for(int j=2;j<i;j++){

    if(i%j==0){

esprimo=false;
        break;
    }

}
if(esprimo){
    System.out.println(i);
}

}




    }
}
