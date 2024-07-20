package com.jnascimento.cafeIntelectual.services;

import com.jnascimento.cafeIntelectual.Dtos.FraseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient(name = "frase-client", url = "https://api.kanye.rest/")
public interface FraseService {
    @RequestMapping(method = RequestMethod.GET)
    FraseDto obterFrase();
}
