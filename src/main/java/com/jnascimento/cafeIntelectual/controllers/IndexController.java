package com.jnascimento.cafeIntelectual.controllers;

import com.jnascimento.cafeIntelectual.services.CafeService;
import com.jnascimento.cafeIntelectual.services.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
    CafeService service;
    @Autowired
    FraseService fraseService;
    @GetMapping
    public ModelAndView index(){
        var imagemUrl = service.obterCafe();
        var frase = fraseService.obterFrase();
        var model = Map.of(
                "imagemUrl",imagemUrl.file(),
                "frase",frase.quote());
        return new ModelAndView("index",model);
    }
}
