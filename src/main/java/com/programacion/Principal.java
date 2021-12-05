package com.programacion;

public class Principal {

    public static void main(String[] args) {
        //En este caso el main se constituye como el tercer actor que entrega la referencia correspondiente
        //haciendo uso del metodo set de TransaccionBancaria
        ManejadorPersistencia mp = new ManejadorPersistenciaImpl();
        //Tambien podemos hacer implementaciones en linea, se hacen para pruebas unitarias
//        ManejadorPersistencia mp = new ManejadorPersistencia() {
//            @Override
//            public CuentaBancaria buscarCuenta(String cuenta) {
//                System.out.println("Buscar cuenta: test "+cuenta);
//                return new CuentaBancaria();
//            }
//        };
        //Version Lambda
//        ManejadorPersistencia mp = s -> new CuentaBancaria();

        TransaccionBancaria tr = new TransaccionBancariaImpl();

        tr.setManejadorPersistencia(mp);
        tr.realizarTranferencia("0930146", "314600",100.00f);

        //En este caso puedo tener N instancias de Transaccion bancaria, pero una copia de ManejadorPersistencia
        //Es decir, estoy liminando a solo UNA instancia de ManejadorPersistencia
        TransaccionBancaria tr1 = new TransaccionBancariaImpl();
        tr1.setManejadorPersistencia(mp);
        tr1.realizarTranferencia("0930146", "315300",200.00f);




    }

}
