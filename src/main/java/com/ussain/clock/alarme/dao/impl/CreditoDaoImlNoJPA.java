package com.ussain.clock.alarme.dao.impl;

import com.ussain.clock.alarme.dao.CreditoDAO;
import com.ussain.clock.alarme.model.Credito;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.List;

@Profile("noJPA")
@Component
public class CreditoDaoImlNoJPA implements CreditoDAO {

    @Override
    public List<Credito> getAllCredit() {
        return null;
    }

    @Override
    public Credito createCredito(Credito credito) {
        credito=new Credito();
        credito.setAprovadoPOr("Arsenio gerente");
        credito.setCreatedBy("Arsenio cliente");
        credito.setJurus(30);
        credito.setDoDate(Calendar.getInstance().getTime());
        credito.setValor(500);
        credito.setUpdateDate(Calendar.getInstance().getTime());
        credito.setCreatedDate(Calendar.getInstance().getTime());
        return credito;
    }
}
