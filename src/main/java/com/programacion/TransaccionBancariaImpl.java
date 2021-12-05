package com.programacion;

public class TransaccionBancariaImpl implements TransaccionBancaria {

    private ManejadorPersistencia mp = null;

    public TransaccionBancariaImpl(ManejadorPersistencia mp){
        //Tambien podemos hacer que un tercero de la instancia con el constructor
        this.mp = mp;
    }

    //Para lograrlo podemos usar un SET
    public void setManejadorPersistencia(ManejadorPersistencia mp){
        this.mp = mp;
    }

    public void realizarTranferencia(String c1, String c2, float valor){

        System.out.println("Iniciando transaccion bancaria");
        CuentaBancaria cuenta1  = mp.buscarCuenta(c1);
        CuentaBancaria cuenta2  = mp.buscarCuenta(c2);
        cuenta1.deposito(valor);
        cuenta2.retiro(valor);
        System.out.println("Transferencia realizada");

    }

}
