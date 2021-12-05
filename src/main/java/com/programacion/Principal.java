package com.programacion;

public class Principal {

    public static void main(String[] args) {
        //En este caso el main se constituye como el tercer actor que entrega la referencia correspondiente
        //Primero creamos la instancia y luego se la entregamos en el constructor
        ManejadorPersistencia mp = new ManejadorPersistenciaImpl();

        //La mejor opcion es hacer uso del constructor
        //ya que es mas estricto, no permite avanzar a menos que se ponga el parametro
        //en cambio usando el SET podriamos olvidarnos
        //Esto se denomina inyeccion de dependecias, porque esto pasando la dependencia que necesita para funcionar
        TransaccionBancaria tr = new TransaccionBancariaImpl(mp);

        //tr.setManejadorPersistencia(mp);
        tr.realizarTranferencia("0930146", "314600",100.00f);

        TransaccionBancaria tr1 = new TransaccionBancariaImpl(mp);
        tr1.setManejadorPersistencia(mp);
        tr1.realizarTranferencia("0930146", "315300",50.00f);

        //Realizando esto TransaccionBancaria ya no crea las dependencias que necesita para funcionar
        //Sino que ahora el MAIN le entrega las dependencias que necesita
        //Ademas al hacer uso de interfaces, ya no permito que se propaguen los errores y solo se quedan
        //en el modulo o clase que estamos cambiando




    }

}
