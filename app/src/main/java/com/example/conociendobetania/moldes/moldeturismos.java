package com.example.conociendobetania.moldes;

public class moldeturismos {
    private String nombre;
    private String nombreContacto;
    private String telefono;
    private Integer foto;

    public moldeturismos() {
    }

    public moldeturismos(String nombre, String nombreContacto, String telefono, Integer foto) {
        this.nombre = nombre;
        this.nombreContacto = nombreContacto;
        this.telefono = telefono;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }
}

