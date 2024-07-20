package com.jnascimento.cafeIntelectual.services;

import com.jnascimento.cafeIntelectual.Dtos.CafeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Service
@FeignClient(name = "cafe-client", url = "https://coffee.alexflipnote.dev/")
public interface CafeService {
    @RequestMapping(method = RequestMethod.GET, value = "random.json")
    CafeDto obterCafe();

}
