
package modelo;

public class Factura {
    private int codigoFactura;
    private String fechaFactura;
    private int dpiCliente;
    private int codigoEmpleado;

    public Factura() {
    }

    public Factura(int codigoFactura, String fechaFactura, int dpiCliente, int codigoEmpleado) {
        this.codigoFactura = codigoFactura;
        this.fechaFactura = fechaFactura;
        this.dpiCliente = dpiCliente;
        this.codigoEmpleado = codigoEmpleado;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public int getDpiCliente() {
        return dpiCliente;
    }

    public void setDpiCliente(int dpiCliente) {
        this.dpiCliente = dpiCliente;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
    
    
    
}