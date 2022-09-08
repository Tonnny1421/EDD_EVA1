/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva1_8_areglos_objetos;

public class EVA1_8_AREGLOS_OBJETOS {

    public static void main(String[] args) {
        Prueba[] arregloPrueba = new Prueba[20];
        //LEER OBJ ES MEJOR FOREACH
        //CREAR LOS OBJ
        for (int i = 0; i < arregloPrueba.length; i++)
        {
            //Clase identificador = new Clase();
            arregloPrueba[i] = new Prueba();
        }
        //LEER X
        for (Prueba prueba : arregloPrueba)
        {
            System.out.println(prueba.x);
        }
    }

}

class Prueba {

    int x = 100;
}
