/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva1_9_arreglos_multidim;

public class EVA1_9_ARREGLOS_MULTIDIM {

    public static void main(String[] args) {

        int[][] matrizDatos = new int[3][5];
        // matrizDatos.length va a imprimir el primer nùmero del arreglo, es decir, la primer direcciòn

        System.out.println("Filas: " + matrizDatos.length);
        for (int i = 0; i < matrizDatos.length; i++)
        {  //Primer dimensiòn (3 filas)
            System.out.println("Columnas: " + matrizDatos[i].length);
            for (int j = 0; j < matrizDatos[i].length; j++)
            {  // Segunda imensiòn (5 columnas)
                matrizDatos[i][j] = 100;
            }
        }
        for (int i = 0; i < matrizDatos.length; i++)
        {
            System.out.println("Columnas: " + matrizDatos[i].length);
            for (int j = 0; j < matrizDatos[i].length; j++)
            {
                System.out.println(" [ " + matrizDatos[i][j] + " ] ");
            }
            System.out.println("");
        }
    }

}
