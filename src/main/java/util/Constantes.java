package util;

import cucumber.api.DataTable;

import java.util.List;

public class Constantes {

   public static String nombre;
   public static String apellido;
   public static String telefono;
   public static String tipo;
   public static String cedula;

    List<List<String>> listas;
   private Constantes(List<List<String>> lista){

       listas=lista;
       nombre=listas.get(1).get(0).trim();
       apellido=listas.get(1).get(2).trim();
       telefono=listas.get(1).get(3).trim();
       tipo=listas.get(1).get(4).trim();
       cedula=listas.get(1).get(5).trim();

   }



    public void llenar(List<List<String>>  datos){


        new Constantes(datos);

    }
}
