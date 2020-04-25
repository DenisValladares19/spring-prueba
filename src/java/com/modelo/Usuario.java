
package com.modelo;

/**
 * Nombre de la Clase: Usuario
 * Fecha: 21/04/2020
 * Version: 1.0
 * Copyrigth: I-Strategies
 * @author Edgard Palacios
 */

public class Usuario {
    
    //Atributos de la Clase
    private int idUsuario;
    private String User;
    private String Pass;
    
    //Metodo Constructor Vacio
    public Usuario() {
    }
    
    //Metodo Constructor Parametrizado
    public Usuario(int idUsuario, String User, String Pass) {
        this.idUsuario = idUsuario;
        this.User = User;
        this.Pass = Pass;
    }

    //Metodos Getter and Setter
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    
    
    
    
}
