/*
*Nombre: Luis Antonio García Colunga
*No. Control: 21550740
*Carrera: I.S.C
 */
package eva1_4_arreglos;

public class EVA1_4_ARREGLOS {

    public static void main(String[] args) {
        //TIPO DE DATO [] IDENTIFICADOR = new TIPO DE DATO (TAMAÑO)
        //ARREGLO ENTERO PARA CAPTURAR EDADES
        //TODOS LOS IDENTIFICADORES DECLARADOS SON ARREGLOS DE ENTEROS 
        int [] arregloEdades, arregloSalario,arrelgoClai;
        //SOLO ARREGLOPROMEDIO ES ARREGLO
        double arregloPromedio[], porcentaje;
        //LOS ARREGLOS SON OBJETOS
        arregloEdades= new int[50];
        System.out.println(arregloEdades);
        for(int i=0;i<arregloEdades.length;i++){
            arregloEdades[i] = (int)(Math.random()*100);
        }
        for(int i=0;i<arregloEdades.length;i++){
        System.out.println("["+i+"] = "+ arregloEdades[i]);
        }
    }
    
}
