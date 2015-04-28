package edu.ues.issseq.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


/**
 * Created by akino on 04-23-15.
 */

@Controller
@RequestMapping("/")
public class IsssEQController {





    @RequestMapping(method = RequestMethod.GET)
    public String registro(ModelMap model){
        model.addAttribute("att", "Registro Operaciones");
        return "registro";
    }




}