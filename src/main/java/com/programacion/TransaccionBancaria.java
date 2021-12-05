package com.programacion;

public class TransaccionBancaria {

    private ManejadorPersistencia mp = null;

    public TransaccionBancaria(){
        //Al colocar la instancia dentro del contructor vamos a crear una nueva instancia por cada
        //instancia de transaccion bancaria
        //Las buenas practicas dictar que debe la variable de instancia debe inicializarse en el contructor
        mp = new ManejadorPersistencia();
    }

    public void realizarTranferencia(String c1, String c2, float valor){
        //Si realizamos la instancia aqui, entonces tendremos una nueva instancia por cada
        //llamada al metodo
        //mp = new ManejadorPersistencia();
        System.out.println("Iniciando transaccion bancaria");
        CuentaBancaria cuenta1  = mp.buscarCuenta(c1);
        CuentaBancaria cuenta2  = mp.buscarCuenta(c2);
        cuenta1.deposito(valor);
        cuenta2.retiro(valor);
        System.out.println("Transferencia realizada");

    }

}
