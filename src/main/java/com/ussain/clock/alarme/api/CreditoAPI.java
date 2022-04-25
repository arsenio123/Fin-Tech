package com.ussain.clock.alarme.api;

import com.ussain.clock.alarme.model.Credito;
import com.ussain.clock.alarme.servico.CreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditoAPI {
    private CreditoService creditoService;

    @Autowired
    public CreditoAPI(CreditoService creditoService){
        this.creditoService=creditoService;
    }

    @PostMapping("credito/creat")
    public Credito createCredito(@RequestBody Credito credito)
    {
        return creditoService.creatCredito(credito);
    }

    @GetMapping("hello")
    public String hello()
    {
        return "Hello";
    }
}
