package com.pjs.app;

	class User {
    //Atributos de la clase
    String nombre;
    String apellidos;
    int edad;
    String direccion;
    String telefono;

    // constructor de la clase 
    public User(String nombre, String apellidos, int edad, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //Método para mostrar la información del objeto
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }
}

public class Clase3C {
    public static void main(String[] args) {
        //Instancias de Usuario
        User usuario1 = new User("Juan", "Pérez García", 32, "Av. del Pacífico, 23", "+34-91-000-0000");
        User usuario2 = new User("María", "Rodríguez Martínez", 28, "C/ del Sol, 5", "+34-91-000-0000");
        User usuario3 = new User("Miguel", "Gonzalez", 18, "Corrientes 1400", "+34-91-4445555");

        //Llamada al método de información del objeto
        usuario1.mostrarDatos();
        usuario2.mostrarDatos();
        usuario3.mostrarDatos();
    }
}