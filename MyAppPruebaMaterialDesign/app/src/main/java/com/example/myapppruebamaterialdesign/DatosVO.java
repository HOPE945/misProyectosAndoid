package com.example.myapppruebamaterialdesign;

public class DatosVO {
    private String nombreAuto;
    private String descripcionAuto;
    private Integer imagenAuto;

    public DatosVO() {
    }

    public DatosVO(String nombreAuto, String descripcionAuto, Integer imagenAuto) {
        this.nombreAuto = nombreAuto;
        this.descripcionAuto = descripcionAuto;
        this.imagenAuto = imagenAuto;
    }

    public String getNombreAuto() {
        return nombreAuto;
    }

    public void setNombreAuto(String nombreAuto) {
        this.nombreAuto = nombreAuto;
    }

    public String getDescripcionAuto() {
        return descripcionAuto;
    }

    public void setDescripcionAuto(String descripcionAuto) {
        this.descripcionAuto = descripcionAuto;
    }

    public Integer getImagenAuto() {
        return imagenAuto;
    }

    public void setImagenAuto(Integer imagenAuto) {
        this.imagenAuto = imagenAuto;
    }
}
