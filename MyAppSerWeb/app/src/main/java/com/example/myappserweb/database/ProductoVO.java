package com.example.myappserweb.database;

public class ProductoVO {

    private int codigoProducto;
    private String nombreProducto;
    private String nombreProveedor;
    private int cantidaProducto;
    private String fechaCaducidadProducto;
    private boolean precioProducto;

    public ProductoVO() {
    }

    public ProductoVO(int codigoProducto, String nombreProducto, String nombreProveedor, int cantidaProducto, String fechaCaducidadProducto, boolean precioProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.nombreProveedor = nombreProveedor;
        this.cantidaProducto = cantidaProducto;
        this.fechaCaducidadProducto = fechaCaducidadProducto;
        this.precioProducto = precioProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public int getCantidaProducto() {
        return cantidaProducto;
    }

    public void setCantidaProducto(int cantidaProducto) {
        this.cantidaProducto = cantidaProducto;
    }

    public String getFechaCaducidadProducto() {
        return fechaCaducidadProducto;
    }

    public void setFechaCaducidadProducto(String fechaCaducidadProducto) {
        this.fechaCaducidadProducto = fechaCaducidadProducto;
    }

    public boolean isPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(boolean precioProducto) {
        this.precioProducto = precioProducto;
    }
}
