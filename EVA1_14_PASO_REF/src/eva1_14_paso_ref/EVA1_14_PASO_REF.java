/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva1_14_paso_ref;

public class EVA1_14_PASO_REF {

    public static void main(String[] args) {
        int[] arregloDatos = new int[100];
    }

    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++)
        {
            arreglo[i] = 100;
        }
    }

    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++)
        {
            System.out.println("[" + arreglo);
        }
    }
}
