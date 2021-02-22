package aplicacion;

import clases.Gordito;

public class Menu {
    public static void main(String[] args) {
        Gordito gordito1 = null;

        int opcion;

        do{
            opcion = menu();

            switch(opcion){
                case 1:
                    gordito1 = generarPesos();

                    System.out.println(gordito1.getRut());
                    System.out.println(gordito1.getNombre());
                    System.out.println(gordito1.getEdad());
                    System.out.println(gordito1.getFonoContacto());

                    for(int i=0; i<gordito1.getPesoAnual().length;i++){
                        System.out.println("Mes " + (i+1) + " = "+gordito1.getPesoAnual()[i]);
                    }

                    break;
                case 2:
                    if(gordito1 != null){
                        System.out.println("Favor ingrese su peso");

                    }
            }
        }while(opcion !=3);
    }

    private static int menu() {
        System.out.println("Sistema de Clínica Queda Regio v1");
        System.out.println("1) Ingresar un peso");
        System.out.println("2) Ingresar estatura");
        System.out.println("3) Salir");
    }

    private static Gordito generarPesos() {
    }
}
