package com.ussain.clock.alarme.servico;

import com.ussain.clock.alarme.dao.CreditoDAO;
import com.ussain.clock.alarme.model.Credito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditoService {
    private CreditoDAO creditoDAO;


    @Autowired
    public CreditoService(CreditoDAO creditoDAO){this.creditoDAO=creditoDAO;
    }
    public List<Credito> getCreditoDAO() {
        return creditoDAO.getAllCredit();
    }

    public Credito creatCredito(Credito credito) {
        return creditoDAO.createCredito(credito);
    }
}
