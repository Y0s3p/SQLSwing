/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasql;

/**
 *
 * @author Yosep
 */
public class Alumnos {
    
    private int id;
    private String nombre;
    private String apellido;
    private String instituto;
    private String poblacion;
    
    public Alumnos(int id, String nombre, String apellido, String instituto, String poblacion){

        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.instituto = instituto;
        this.poblacion = poblacion;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @return the instituto
     */
    public String getInstituto() {
        return instituto;
    }

    /**
     * @return the poblacion
     */
    public String getPoblacion() {
        return poblacion;
    }
    
}

