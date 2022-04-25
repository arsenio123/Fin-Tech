package com.ussain.clock.alarme.dao;

import com.ussain.clock.alarme.model.Credito;

import java.util.List;

public interface CreditoDAO {

    public List<Credito> getAllCredit();
    public Credito createCredito(Credito credito);
}
