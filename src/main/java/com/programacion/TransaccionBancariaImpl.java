package com.programacion;
//Para que el contenedor sepa que compoentes debe gestionar
//se deben usar marcas o anotaciones
@MiComponente
public class TransaccionBancariaImpl implements TransaccionBancaria {

    //dependencia
    //para que el contenedor sepa que dependencia debe proporcionar
    //de igual forma se usan marcas o anotaciones
    @MiDependencia
    private ManejadorPersistencia mp = null;
    //variables que necesita para funcionar
    private float maximo = 100.0f;

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

        if(valor>maximo){
            throw new RuntimeException(String.format("ERROR: monto maximo superado %.2f>%.2f", valor, maximo));
        }else{
            cuenta1.deposito(valor);
            cuenta2.retiro(valor);
            System.out.println("Transferencia realizada");
        }


    }

}
