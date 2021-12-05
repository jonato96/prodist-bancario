package com.programacion;

public class TransaccionBancariaImpl implements TransaccionBancaria {
    //Transaccion Bancaria ahora conoce y depende de la interface
    //La interface es el QUE
    private ManejadorPersistencia mp = null;

    public TransaccionBancariaImpl(){
        //Al colocar la instancia dentro del contructor vamos a crear una nueva instancia por cada
        //instancia de transaccion bancaria
        //Las buenas practicas dictar que debe la variable de instancia debe inicializarse en el contructor
        mp = new ManejadorPersistenciaImpl();
        // y la instancia debe ser la implementacion
        //La implementacion es el COMO
    }

    public void realizarTranferencia(String c1, String c2, float valor){
        //Si realizamos la instancia aqui, entonces tendremos una nueva instancia por cada
        //llamada al metodo
        //mp = new ManejadorPersistenciaImpl();
        System.out.println("Iniciando transaccion bancaria");
        CuentaBancaria cuenta1  = mp.buscarCuenta(c1);
        CuentaBancaria cuenta2  = mp.buscarCuenta(c2);
        cuenta1.deposito(valor);
        cuenta2.retiro(valor);
        System.out.println("Transferencia realizada");

    }

}
