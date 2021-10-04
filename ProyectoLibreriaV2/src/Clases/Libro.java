
package Clases;

import java.io.Serializable;

public class Libro implements Serializable{
    private int isbn;
    private String autor;
    private GeneroTypes genero;
    private String titulo;
    private double precio;
    private String rutaFoto;
       
    public Libro(){};
    public Libro(int isbn, String autor, GeneroTypes genero,String titulo, double precio, String rutaFoto){
       this.isbn = isbn;
       this.autor = autor;
       this.genero = genero;
       this.titulo = titulo;
       this.precio = precio;
       this.rutaFoto=rutaFoto;
    }

    /**
     * @return the isbn
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the genero
     */
    public GeneroTypes getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(GeneroTypes genero) {
        this.genero = genero;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the rutaFichero
     */
    public String getRutaFoto() {
        return rutaFoto;
    }

    /**
     * @param rutaFichero the rutaFichero to set
     */
    public void setRutaFichero(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }
    
}
