/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva1_12_copia_objetos;

public class EVA1_12_COPIA_OBJETOS {

    public static void main(String[] args) {
        int valor, copiaValor;
        valor = 100;
        copiaValor = valor;
        System.out.println("Valor =  " + valor);
        System.out.println("Copia =  " + copiaValor);
        valor++;
        System.out.println("Valor =  " + valor);
        System.out.println("Copia =  " + copiaValor);
        //Ahora con obj
        Pruebavalor prueba = new Pruebavalor();
        prueba.x = 1000;
        Pruebavalor pruebaCopia = new Pruebavalor();
        pruebaCopia = prueba;

        System.out.println("AHORA CON OBJ");
        System.out.println("Prueba " + prueba.x);
        System.out.println("Prueba copia " + pruebaCopia.x);

        prueba.x++;
        System.out.println("Prueba " + prueba.x);
        System.out.println("Prueba copia " + pruebaCopia.x);
    }

}

class Pruebavalor {

    int x;
}
