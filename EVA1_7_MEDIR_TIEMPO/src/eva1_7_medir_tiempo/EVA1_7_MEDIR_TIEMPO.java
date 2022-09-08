/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva1_7_medir_tiempo;

public class EVA1_7_MEDIR_TIEMPO {

    public static void main(String[] args) {
        int[] datos = new int[10000000];
        long ini = System.nanoTime();
        for (int i = 0; i < datos.length; i++)
        {
            datos[i] = 100;
        }
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println(tiempo);
    }

}
