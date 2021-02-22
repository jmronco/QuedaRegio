package aplicacion;

import clases.Gordito;

public class Resultados {
    public static void main(String[] args) {
        Gordito gordito1 = new Gordito("17406542-K", "José Miguel Ronco", 30,
                "85488174");
        System.out.println(gordito1.getRut());
        System.out.println(gordito1.getNombre());
        System.out.println(gordito1.getEdad());
        System.out.println(gordito1.getFonoContacto());

        for(int i=0; i<gordito1.getPesoAnual().length;i++){
            System.out.println("Mes" + (i+1) + " = "+gordito1.getPesoAnual()[i]);
        }


    }
}
