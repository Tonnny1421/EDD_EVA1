/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva1_11_ejemplo_arreglos;

import java.util.Scanner;

public class EVA1_11_EJEMPLO_ARREGLOS {

    public static void main(String[] args) {
        int arregloCali[][];
        Scanner spect = new Scanner(System.in);
        System.out.println("Introduce el numero de grupos");
        int Gpos = spect.nextInt();

        arregloCali = new int[Gpos][];

        for (int i = 0; i < arregloCali.length; i++)
        {
            System.out.println("Cuantos estudiantes en el grupo " + (i + 1));
            int estu = spect.nextInt();
            System.out.println(arregloCali[i].length);
        }

    }

}
