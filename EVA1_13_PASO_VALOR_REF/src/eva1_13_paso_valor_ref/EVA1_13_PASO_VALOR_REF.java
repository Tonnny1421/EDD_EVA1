/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva1_13_paso_valor_ref;

public class EVA1_13_PASO_VALOR_REF {

    public static void main(String[] args) {
        int valorPrueba = 100;
        System.out.println("Valor = " + valorPrueba);
        incVal(valorPrueba);
        System.out.println("Valor incrementado =" + valorPrueba);
        //-----------------
        Pruebavalor prueba = new Pruebavalor();
        prueba.x = 100;
        System.out.println("valor " + prueba.x);
        incVal(prueba);
        System.out.println("Valor inccrementando obj " + prueba.x);
    }

    public static void incVal(int valor) {
        valor++;
    }

    public static void incVal(Pruebavalor pruebaVal) {
        pruebaVal.x++;
    }
}

class Pruebavalor {

    int x;
}
