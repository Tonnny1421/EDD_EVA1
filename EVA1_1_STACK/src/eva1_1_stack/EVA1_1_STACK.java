/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva1_1_stack;

public class EVA1_1_STACK {

    public static void main(String[] args) {
        System.out.println("Inicia Main");
        A();
        System.out.println("Retoma Main");
        System.out.println("Termina Main");
    }

    public static void A() {
        System.out.println("Inicia A");
        B();
        System.out.println("Retoma A");
        System.out.println("Termina A");

    }

    public static void B() {
        System.out.println("Inicia B");
        int i = 1;
        double d = 10.0;
        System.out.println("Termina B");
    }

}
