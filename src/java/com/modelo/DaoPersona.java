
package com.modelo;

import com.conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Nombre de la Clase: DaoPersona
 * Fecha: 21/04/2020
 * Version: 1.0
 * Copyrigth: I-Strategies
 * @author Edgard Palacios
 */

public class DaoPersona {
    
  //Instancia de Conexion  
  Conexion con = new Conexion();
  
  //Instancia de JdbcTemplate
  JdbcTemplate jdbc = new JdbcTemplate((DataSource)this.con.conectar());
  
  
        //Metodo para Mostrar Persona
        public List<Persona> mostrarPersona() {
          try {
            String sql = "select * from persona";
            return this.jdbc.query(sql, new RowMapper<Persona>() {
                  public Persona mapRow(ResultSet rs, int i) throws SQLException {
                    Persona p = new Persona();
                    p.setIdPersona(rs.getInt("idPersona"));
                    p.setPrimerNombre(rs.getString("PrimerNombre"));
                    p.setSegundoNombre(rs.getString("SegundoNombre"));
                    p.setPrimerApellido(rs.getString("PrimerApellido"));
                    p.setSegundoApellido(rs.getString("SegundoApellido"));
                    p.setFecha(rs.getString("fechaNacimiento"));
                    p.setSexo(rs.getInt("sexo"));
                    p.setInfo(rs.getString("InformacionAdicional"));
                    return p;
                  }
                });
          } catch (Exception e) {
            e.printStackTrace();
            return null;
          } 
        }

        //Metodo para Buscar Persona
        public Persona buscarPersona(int id) {
          try {
            String sql = "select * from persona where idPersona=?";
            Persona p = (Persona)this.jdbc.queryForObject(sql, new Object[] { Integer.valueOf(id) }, (rs, num)
                    -> new Persona(
                            rs.getInt("idPersona"),
                            rs.getString("PrimerNombre"),
                            rs.getString("SegundoNombre"),
                            rs.getString("PrimerApellido"),
                            rs.getString("SegundoApellido"),
                            rs.getString("fechaNacimiento"),
                            rs.getInt("sexo"),
                            rs.getString("InformacionAdicional")));
            return p;
          } catch (Exception e) {
            e.printStackTrace();
            return null;
          } 
        }

        //Metodo para Insertar Persona
        public boolean insertarPersona(Persona p) {
          try {
            String sql = "insert into persona values(0,?,?,?,?,?,?,?)";
            this.jdbc.update(sql, new Object[] { p
                  .getPrimerNombre(), p
                  .getSegundoNombre(), p
                  .getPrimerApellido(), p
                  .getSegundoApellido(), p
                  .getFecha(), 
                  Integer.valueOf(p.getSexo()), p
                  .getInfo() });
            return true;
          } catch (Exception e) {
            e.printStackTrace();
            return false;
          } 
        }


        //Metodo para Modificar Persona
        public boolean modificarPersona(Persona p) {
          try {
            String sql = "update persona set PrimerNombre=?,SegundoNombre=?,PrimerApellido=?,SegundoApellido=?,FechaNacimiento=?,Sexo=?,InformacionAdicional=? where idPersona=?";
            this.jdbc.update(sql, new Object[] { p
                  .getPrimerNombre(), p
                  .getSegundoNombre(), p
                  .getPrimerApellido(), p
                  .getSegundoApellido(), p
                  .getFecha(), 
                  Integer.valueOf(p.getSexo()), p
                  .getInfo(), 
                  Integer.valueOf(p.getIdPersona()) });
            return true;
          } catch (Exception e) {
            e.printStackTrace();
            return false;
          } 
        }

        //Metodo para Eliminar Persona
        public boolean eliminarPersona(Persona p) {
          try {
            String sql = "delete from persona where idPersona=?";
            this.jdbc.update(sql, new Object[] { Integer.valueOf(p.getIdPersona()) });
            return true;
          } catch (Exception e) {
            e.printStackTrace();
            return false;
          } 
        }
    
}
