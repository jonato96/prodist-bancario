package com.programacion;

public class Principal {

    public static void main(String[] args) {

        TransaccionBancaria tr = new TransaccionBancariaImpl();
        tr.realizarTranferencia("0930146", "314600",100.00f);

        TransaccionBancaria tr1 = new TransaccionBancariaImpl();
        tr1.realizarTranferencia("0930146", "315300",200.00f);

    }

}
