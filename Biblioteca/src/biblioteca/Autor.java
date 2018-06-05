/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Objects;

/**
 *
 * @author ESFOT
 */
public class Autor {
    private final String nombre;
    private String pais;

    public Autor(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "Nombre :" +nombre + ", Pais: " + pais + '}';
    }

    
    
    
  
    
    
    
    
    
}
