/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author personal1
 */
public class Usuarios {

    private int id;
    private String nombres;
    private String apellidos;
    private String username;
    private String contrasenia;

    private int responsable; // 1:si; 2:normal

    public Usuarios() {
    }

    public Usuarios(int id, String nombres, String apellidos, String username, String contrasenia, int responsable) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.username = username;
        this.contrasenia = contrasenia;
        this.responsable = responsable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getResponsable() {
        return responsable;
    }

    public void setResponsable(int responsable) {
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", username=" + username + ", contrasenia=" + contrasenia + ", responsable=" + responsable + '}';
    }

}
