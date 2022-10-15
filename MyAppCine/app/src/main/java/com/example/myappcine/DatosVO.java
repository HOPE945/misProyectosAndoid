package com.example.myappcine;

public class DatosVO {
    private Integer imagen;
    private Integer nombre;
    private Integer duracion;
    private int precio;
    private Integer sinopsis;
    private Integer directores;
    private Integer puntuacion;

    public DatosVO() {
    }

    public DatosVO(Integer imagen, Integer nombre, Integer duracion, int precio) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
    }

    public DatosVO(Integer sinopsis, Integer directores, Integer puntuacion) {
        this.sinopsis = sinopsis;
        this.directores = directores;
        this.puntuacion = puntuacion;
    }

    public DatosVO(int precio) {
        this.precio = precio;
    }

    public DatosVO(Integer imagen) {
        this.imagen = imagen;
    }

    public DatosVO(Integer imagen, Integer nombre, Integer duracion, int precio, Integer sinopsis, Integer directores, Integer puntuacion) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
        this.sinopsis = sinopsis;
        this.directores = directores;
        this.puntuacion = puntuacion;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Integer getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(Integer sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Integer getDirectores() {
        return directores;
    }

    public void setDirectores(Integer directores) {
        this.directores = directores;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }
}