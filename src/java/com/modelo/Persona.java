
package com.modelo;

/**
 * Nombre de la Clase: Persona
 * Fecha: 21/04/2020
 * Version: 1.0
 * Copyrigth: I-Strategies
 * @author Edgard Palacios
 */

public class Persona {
    
  //Atributos de la Clase  
  private int idPersona;
  private String primerNombre;
  private String segundoNombre;
  private String primerApellido;
  private String segundoApellido;
  private String fecha;
  private int sexo;
  private String info;
  
  //Metodo Constructor vacio
  public Persona() {
  
  }
  
  //Metodo Constructor Parametrizado
  public Persona(int idPersona, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String fecha, int sexo, String info) {
    this.idPersona = idPersona;
    this.primerNombre = primerNombre;
    this.segundoNombre = segundoNombre;
    this.primerApellido = primerApellido;
    this.segundoApellido = segundoApellido;
    this.fecha = fecha;
    this.sexo = sexo;
    this.info = info;
  }
  
  
    //Metodos Getter and Setter
    public int getIdPersona() {
      return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
      this.idPersona = idPersona;
    }

    public String getPrimerNombre() {
      return this.primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
      this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
      return this.segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
      this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
      return this.primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
      this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
      return this.segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
      this.segundoApellido = segundoApellido;
    }

    public String getFecha() {
      return this.fecha;
    }

    public void setFecha(String fecha) {
      this.fecha = fecha;
    }

    public int getSexo() {
      return this.sexo;
    }

    public void setSexo(int sexo) {
      this.sexo = sexo;
    }

    public String getInfo() {
      return this.info;
    }

    public void setInfo(String info) {
      this.info = info;
    }

  
}
