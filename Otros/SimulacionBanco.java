

// Excepción personalizada para fondos insuficientes
class FondosInsuficientesException extends Exception {
    public FondosInsuficientesException(String mensaje) {
        super(mensaje);
    }
}

//clase cuenta Bancaria
class CuentaBancaria{
private String titular;
private double saldo;




public CuentaBancaria(String titular,double saldo){
this.titular=titular;
this.saldo=saldo;

}

//metodo para obtener el saldo
public double getSaldo(){

return saldo;

}

public void depositar(double monto){
if(monto>0){
saldo+=monto;
System.out.println("Deposito Exitoso,  Nuevo Saldo $    :"+  saldo);


}else{
    System.out.println("El monto a depositar debe ser mayor a 0.");
}


}

// Método para retirar dinero
    public void retirar(double monto) throws FondosInsuficientesException {
        if (monto > saldo) {
            throw new FondosInsuficientesException("Fondos insuficientes. Saldo disponible: $" + saldo);
        }
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser mayor a 0.");
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
    }
}




public class SimulacionBanco {
    
    public static void main(String[] args) {
        
           // Crear una cuenta bancaria con un saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000);

        System.out.println("Saldo inicial: $" + cuenta.getSaldo());


        
        // Probar un retiro exitoso
        try {
            cuenta.retirar(500);
        } catch (FondosInsuficientesException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Probar un retiro con monto mayor al saldo
        try {
            cuenta.retirar(600);
        } catch (FondosInsuficientesException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Probar un depósito
        cuenta.depositar(300);

        // Probar un retiro inválido (monto negativo)
        try {
            cuenta.retirar(-50);
        } catch (FondosInsuficientesException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }




    }
}
