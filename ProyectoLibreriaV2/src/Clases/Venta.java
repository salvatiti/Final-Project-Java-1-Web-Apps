package Clases;

import java.io.Serializable;
import java.util.Date;

public class Venta implements Serializable {

    private double precioLineaVenta;
    private Libro libroLineaVenta;
    private int cantidad;
    private Date fecha;

    public Venta(Libro libroLineaVenta, int cantidad) {
        this.precioLineaVenta = libroLineaVenta.getPrecio() * cantidad;
        this.cantidad = cantidad;
        this.libroLineaVenta = libroLineaVenta;
        this.fecha = new Date();
    }

    /**
     * @return the precioLineaVenta
     */
    public double getPrecioLineaVenta() {
        return precioLineaVenta;
    }

    /**
     * @return the libroLineaVenta
     */
    public Libro getLibroLineaVenta() {
        return libroLineaVenta;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
