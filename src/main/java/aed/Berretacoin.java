package aed;

import java.util.*;

public class Berretacoin implements IBerretacoin {

    private int cantUsuarios;
    private int cantTransaccionesEnBloque;


    public Berretacoin Berretacoin(int cantUsuarios, int cantTransaccionesEnBloque) {
        /*
            temporal, actualizar a su respectivo !
         */
        this.cantUsuarios = cantUsuarios;
        this.cantTransaccionesEnBloque = cantTransaccionesEnBloque;
        return this;
    };


    @Override
    public void agregarBloque(ArrayList<Transaccion> transacciones) {
        return;
    }

    @Override
    public Transaccion txMayorValorUltimoBloque() {
        return null;
    }

    @Override
    public ArrayList<Transaccion> txUltimoBloque() {
        return null;
    }

    @Override
    public int maximoTenedor() {
        return 0;
    }

    @Override
    public int montoMedioUltimoBloque() {
        return 0;
    }

    @Override
    public void hackearTx() {
        return;
    }
}
