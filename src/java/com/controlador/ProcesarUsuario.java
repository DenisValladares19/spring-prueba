
package com.controlador;

import com.modelo.DaoUsuario;
import com.modelo.Usuario;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Nombre de la Clase: ProcesarUsuario
 * Fecha: 21/04/2020
 * Version: 1.0
 * Copyrigth: I-Strategies
 * @author Edgard Palacios
 */

public class ProcesarUsuario {
    
    DaoUsuario dao = new DaoUsuario();
    
    @RequestMapping("login.htm")
    public String login(Model m, HttpServletRequest request) {
        HttpSession ses = (HttpSession)request.getSession();
        if(ses.getAttribute("user")!=null){
            return "redirect:/persona.htm";
        }else {
            m.addAttribute(new Usuario());
            return "login";
        } 
    }
    
    
    
        
    @RequestMapping(value = "cerrar.htm", method = RequestMethod.GET)
    public String salir(HttpServletRequest request) {
         HttpSession ses = (HttpSession)request.getSession();
        ses.invalidate();
        return "redirect:/usuario.htm";
    }
    
}
