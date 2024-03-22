/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.unam.fi.poo;

/**
 *Programa que inicializa una persona e indica que es lo que esta comiendo
 * @author RUBENO
 */
public class POOP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        Persona persona = new Persona("Jose Perez Leon",19,"cafes");
        System.out.println(persona);
        System.out.println(persona.comer("pescado"));
    }
    
}