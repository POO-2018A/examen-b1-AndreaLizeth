/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author ESFOT
 */
public class Libro {
    private String titulo;
    private int anio;
    private boolean favorito;
    private Autor []autor ;
   

    public Libro(String titulo, int anio, boolean favorito, Autor []autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.favorito = favorito;
        this.autor = autor;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public Autor[] getAutor() {
        return autor;
    }

    public void setAutor(Autor[] autor) {
        this.autor = autor;
    }

    
    
    
     @Override
    public String toString() {
        String sAutor = "Nombre:" + autor ;
        
        for(int i = 0; i < this.autor.length ; i++){
            sAutor += "Nombre"+ (i+1)+ ": "+ this.autor[i] + "\n";
        }
        return sAutor;
    }  

    
    
  

    
    
    
}
