package com.example.myappcontactosvo;

public class DatosContactoVO {
    private String nombreContacto;
    private String numeroContacto;
    private Integer imagenContacto;

    public DatosContactoVO() {
    }

    public DatosContactoVO(String nombreContacto, String numeroContacto, Integer imagenContacto) {
        this.nombreContacto = nombreContacto;
        this.numeroContacto = numeroContacto;
        this.imagenContacto = imagenContacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public Integer getImagenContacto() {
        return imagenContacto;
    }

    public void setImagenContacto(Integer imagenContacto) {
        this.imagenContacto = imagenContacto;
    }



}
