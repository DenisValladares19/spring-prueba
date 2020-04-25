
package com.conexion;

import java.util.Properties;
import java.util.ResourceBundle;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Nombre de la Clase: Conexion
 * Fecha: 21/04/2020
 * Version: 1.0
 * Copyrigth: I-Strategies
 * @author Edgard Palacios
 */
public class Conexion {
    
    //Instancia a Propiertie
    Properties p = new Properties();
  
    //Metodo para Conectar
    public DriverManagerDataSource conectar() {
    String urlPro = "com.conexion.Parametros";
    ResourceBundle rs = ResourceBundle.getBundle(urlPro);
    DriverManagerDataSource dataS = new DriverManagerDataSource();
    dataS.setDriverClassName("com.mysql.jdbc.Driver");
    dataS.setUrl(rs.getString("BASE") + rs.getString("DB"));
    dataS.setUsername(rs.getString("USER"));
    dataS.setPassword(rs.getString("PASS"));
    return dataS;
  }
    
}
