
package Clases;

import java.io.Serializable;
import java.util.ArrayList;



public class Cliente implements Serializable {
    private String dni;
    private String email;
    private String nombreCliente;
    private int codPostal;
   private String usuario;
   private String contraseña;
    
    
    public Cliente(String dni, String email, String nombreCliente, int codPostal){
        this.dni=dni;
        this.email=email;
        this.nombreCliente=nombreCliente;
        this.codPostal=codPostal;
        
    }

   
    
    
    public void realizarCompra(ArrayList<Venta> ventasCarrito ){       
        Carrito c = new Carrito();
        
    
        c.setDniCliente(this.getDni());
        c.setVentasCarrito(new ArrayList<Venta>(ventasCarrito));
        c.calcularPrecioFinalCarrito();
        c.confirmarVenta();
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the codPostal
     */
    public int getCodPostal() {
        return codPostal;
    }

    /**
     * @param codPostal the codPostal to set
     */
    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

   
}
