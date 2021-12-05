package com.programacion;

public class ManejadorPersistenciaImpl implements ManejadorPersistencia {
    //Usando interfaces nos ayuda a que no se propaguen los errores
    //Ejm: si le cambio el nombre al metodo buscarCuenta, se genera un erro al
    //no respetar la firma del metodo, pero el error solo queda en esta clase,
    //no se propaga a las demas
    public CuentaBancaria buscarCuenta(String cuenta){
        System.out.println("Buscar cuenta: "+cuenta);
        return new CuentaBancaria();
    }

}
