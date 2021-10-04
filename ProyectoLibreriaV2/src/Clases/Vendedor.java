
package Clases;

import java.io.Serializable;


public class Vendedor implements Serializable{
    private int codVendedor;
    private String nombreVendedor;
    
    
    public Vendedor(int codVendedor, String nombreVendedor){
        this.codVendedor = codVendedor;
        this.nombreVendedor = nombreVendedor;
    }

    /**
     * @return the codVendedor
     */
    public int getCodVendedor() {
        return codVendedor;
    }

    /**
     * @param codVendedor the codVendedor to set
     */
    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }

    /**
     * @return the nombreVendedor
     */
    public String getNombreVendedor() {
        return nombreVendedor;
    }

    /**
     * @param nombreVendedor the nombreVendedor to set
     */
    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    
}
