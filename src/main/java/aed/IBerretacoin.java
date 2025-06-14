package aed;

/**
 *   Debe contener:
 *      P cantidad de usuarios
 *      n_b contador de cantidad de transacciones en el bloque
 */
public interface IBerretacoin {

    /**
     *  Complejidad O(n_b * log(P))
     *  Debe agregar un bloque a la secuencia de transacciones
     */
    void agregarBloque( Transaccion[] transaccions);

    /**
     * Complejidad O(1)
     * Devuelve la transacción mas grande del ultimo Bloque
     * @return Primera transaccion del Heap.
     */
    Transaccion txMayorValorUltimoBloque();

    /**
     * Complejidad O(n_b)
     * Devuelve una copia de la secuencia de transacciones del últmo bloque ordenadas por su ID
     * @return Copia de todas las transacciones del ultimo bloque.
     */
    Transaccion[] txUltimoBloque();

    /**
     * Complejidad O(1)
     * Devuelve al usuario qeu posee la mayor cantidad de $aed.Berretacoin. en caso de empate, el de menor ID
     * @return ID del maximo tenedor.
     */
    int maximoTenedor();

    /**
     * Complejidad O(1)
     * Devuelve el monto promedio de todas las transacciones del ultimo bloque. no se debe considerar las transacciones de creacion.
     * en caso de no haber transacciones $=0
     * @return Monto medio en el ultimo bloque.
     */
    int montoMedioUltimoBloque();

    /**
     * Complejidad O(log(n_b) + log(P))
     * Extrae del ultimo bloque de la cadena, la transaccion de mayor monto.
     * No debe importar si despues de la extraccion el usuario (comprador/vendedor) queda en saldo negativo.
     * Debe de actualizarse el sado de los usuarios !.
     */
    void hackearTx();
}
