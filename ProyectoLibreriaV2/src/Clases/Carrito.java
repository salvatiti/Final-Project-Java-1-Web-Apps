
package Clases;

import java.io.Serializable;
import java.util.ArrayList;


public class Carrito implements Serializable{
    private ArrayList<Venta> ventasCarrito;
    private String dniCliente;
    private double precioFinalCarrito;


    
    public Carrito(){
        this.ventasCarrito = new ArrayList<Venta>();
        this.precioFinalCarrito = 0;
    }
    
    public Carrito(String dniCliente){
        this.ventasCarrito = new ArrayList<Venta>();
       
      
        this.dniCliente = dniCliente;
        this.precioFinalCarrito = 0;
    }
    
    public void agregarLineaVenta(Venta lineaVenta){
        this.getVentasCarrito().add(lineaVenta);
    }
    
    public void eliminarLineaVenta(Venta lineaVenta){
        this.getVentasCarrito().remove(lineaVenta);
    }
    
    public double calcularPrecioFinalCarrito(){             
        for (int i = 0; i < this.ventasCarrito.size(); i++) {
            setPrecioFinalCarrito(getPrecioFinalCarrito() + this.ventasCarrito.get(i).getPrecioLineaVenta());
        }
       return this.getPrecioFinalCarrito();
    }

 
    
    public void confirmarVenta(){
        //TODO
    }
    /**
     * @return the ventasCarrito
     */
    public ArrayList<Venta> getVentasCarrito() {
        return this.ventasCarrito;
    }

    /**
     * @param ventasCarrito the ventasCarrito to set
     */
    public void setVentasCarrito(ArrayList<Venta> ventasCarrito) {
        this.ventasCarrito = ventasCarrito;
    }


    
    public String getDniCliente() {
        return dniCliente;
    }

    /**
     * @param dniCliente the dniCliente to set
     */
    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    /**
     * @return the precioFinalCarrito
     */
    public double getPrecioFinalCarrito() {
        return precioFinalCarrito;
    }

    /**
     * @param precioFinalCarrito the precioFinalCarrito to set
     */
    public void setPrecioFinalCarrito(double precioFinalCarrito) {
        this.precioFinalCarrito = precioFinalCarrito;
    }
}
