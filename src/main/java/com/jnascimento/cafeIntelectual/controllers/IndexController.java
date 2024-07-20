package com.jnascimento.cafeIntelectual.controllers;

import com.jnascimento.cafeIntelectual.services.CafeService;
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
    @GetMapping
    public ModelAndView index(){
        var imagemUrl = service.obterCafe();
        var model = Map.of("imagemUrl",imagemUrl.file());
        return new ModelAndView("index",model);
    }
}
