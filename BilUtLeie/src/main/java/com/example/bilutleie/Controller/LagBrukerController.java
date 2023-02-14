package com.example.bilutleie.Controller;


import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("${app.url.lagbruker}")
public class LagBrukerController {

    @GetMapping
    public String LagBRuker(Model model){
        model.addAttribute("kunde", new Kunde());
        return "lagbruker"
    }

    @PostMapping
    public String postLagBruker(@ModelAttribute("kunde") Kunde kunde,
                                BindingResult bs,
                                HttpSession session, RedirectAttributes ra){
        if(bs.hasErrors()){
            System.err.println("Error" +bs.getAllErrors());
            return "lagbruker";
        }

        if(service.)


    }

}
