/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva1_10_arreglo_cubo;

public class EVA1_10_ARREGLO_CUBO {

    public static void main(String[] args) {
        int[][][] cuboDatos = new int[3][4][5];
        for (int i = 0; i < cuboDatos.length; i++)
        {
            for (int j = 0; j < cuboDatos[i].length; j++)
            {
                for (int k = 0; k < cuboDatos[i][j].length; k++)
                {
                    cuboDatos[i][j][k] = 50;
                }
            }
        }
        System.out.println(" [ " + cuboDatos.length + " ] ");
    }
}
