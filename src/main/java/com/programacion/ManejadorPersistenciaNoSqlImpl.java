package com.programacion;

public class ManejadorPersistenciaNoSqlImpl implements ManejadorPersistencia {
    //Podemos usar mas de una implementacion con una sola interface

    public CuentaBancaria buscarCuenta(String cuenta){
        System.out.println("NO SQL Buscar cuenta: "+cuenta);
        return new CuentaBancaria();
    }

}
