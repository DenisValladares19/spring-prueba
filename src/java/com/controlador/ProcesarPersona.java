
package com.controlador;


import com.modelo.DaoPersona;
import com.modelo.Persona;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;


/**
 * Nombre de la Clase: ProcesarPersona
 * Fecha: 21/04/2020
 * Version: 1.0
 * Copyrigth: I-Strategies
 * @author Edgard Palacios
 */

@Controller
public class ProcesarPersona {
    
     @Autowired
  DaoPersona dao = new DaoPersona();
  
  @RequestMapping({"index.htm"})
  public String Persona(Model m, HttpServletRequest request) {
        HttpSession ses = (HttpSession)request.getSession();
        if (ses.getAttribute("user") != null) {
        List<Persona> List = this.dao.mostrarPersona();
        m.addAttribute("persona", new Persona());
        m.addAttribute("info", List);
        return "index";
        }else {
            return "redirect:/usuario.htm";
        }
  }
  
  @RequestMapping(value = {"buscar.htm"}, method = {RequestMethod.POST})
  public String buscar(@RequestParam("botton") String boton, @ModelAttribute("persona") Persona p, WebRequest web, Model m) {
    if (web.getParameter("txtIdPersona") != "") {
      int id = Integer.parseInt(web.getParameter("txtIdPersona"));
      Persona per = this.dao.buscarPersona(id);
      if (per != null) {
        m.addAttribute("persona", per);
        m.addAttribute("info", this.dao.mostrarPersona());
        return "buscar";
      } 
      return "redirect://buscar.htm";
    } 
    return "redirect://buscar.htm";
  }
  
  @RequestMapping(value = {"index.htm"}, method = {RequestMethod.POST})
  public String accion(@RequestParam("botton") String boton, @ModelAttribute("persona") Persona p, WebRequest web, Model m) {
    if (boton.equals("Insertar")) {
      this.dao.insertarPersona(p);
      m.addAttribute("persona", new Persona());
      m.addAttribute("info", this.dao.mostrarPersona());
      return "persona";
    } 
    return "redirect:/index.htm";
  }
    
}
