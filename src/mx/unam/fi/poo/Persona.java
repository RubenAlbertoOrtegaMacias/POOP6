/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.unam.fi.poo;

/**
 * Es la clase que llame Persona y tiene 3 atributos
 * @author poo01alu08
 */
public class Persona {
    private String nombre;
    private int edad;
    private String colorOjos;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public Persona() {
    }
    /**
     * Constructor lleno
     * @param nombre Nombre de la persona
     * @param edad Edad de la persona
     * @param colorOjos Color de los ojos de la persona
     */
    public Persona(String nombre, int edad, String colorOjos) {
        this.nombre = nombre;
        this.edad = edad;
        this.colorOjos = colorOjos;
    }
    /**
     * Refresa el nombre de una persona
     * @return la variable nomrbe
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    /**
     * El metodo comer lo que la persona esta comiendo
     * @param comida la comida que la persona esta comiendo
     * @return la cadena con la comuida que la persona come
     */
    public String comer(String comida){
        return "Estoy comiendo "+comida;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", colorOjos=" + colorOjos + '}';
    }
    
    
}
