package com.pjs.app;

	class User {
    //Atributos
    String nombre = "Silvia";
    String apellidos =  "Blanes Alarcón";
    int edad = 27;
    String direccion = "Enrique Granados, 7";
    String telefono = "+34-91-000-000";
    
    //Método para mostrar la información del objeto
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }
}

public class Clase2 {
    public static void main(String[] args) {
        //Instancias de la clase Usuario
        User usuario1 = new User();
        User usuario2 = new User();
        User usuario3 = new User();

        //Reasignación de nuevos valores a usuario2
          usuario2.nombre = "Roberto";
          usuario2.apellidos = "Nieto Santamaría";
          usuario2.edad = 31;
          usuario2.direccion = "Av. Sarmiento 4567";
          usuario2.telefono = "+5493816340971";
          
          usuario3.nombre = "Jose";
          usuario3.apellidos = "Rodriguez";
          usuario3.edad = 40;
          usuario3.direccion = "Av. Belgrano 4567";
          usuario3.telefono = "+549345999071";
          
        //Valores del objeto usuario1
       // System.out.println("-->Atributos del objeto usuario1");
        //System.out.println(usuario1.nombre);
        //System.out.println(usuario1.apellidos);
        //System.out.println(usuario1.edad);
        //System.out.println(usuario1.direccion);
        //System.out.println(usuario1.telefono);

        //Valores del objeto usuario2
        //System.out.println("-->Atributos del objeto usuario2");
        //System.out.println(usuario2.nombre);
        //System.out.println(usuario2.apellidos);
        //System.out.println(usuario2.edad);
        //System.out.println(usuario2.direccion);
        //System.out.println(usuario2.telefono);
          
          //Valores del objeto usuario2
          //System.out.println("-->Atributos del objeto usuario2");
          //System.out.println(usuario2.nombre);
          //System.out.println(usuario2.apellidos);
          //System.out.println(usuario2.edad);
          //System.out.println(usuario2.direccion);
          //System.out.println(usuario2.telefono);
        
      //Llamada al método de información del objeto
        usuario1.mostrarDatos();
        usuario2.mostrarDatos();
        usuario3.mostrarDatos();
    }
}