package com.ussain.clock.alarme.dao.impl;

import com.ussain.clock.alarme.dao.CreditoDAO;
import com.ussain.clock.alarme.model.Credito;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.Calendar;
import java.util.List;

@Profile("JPA")
@Component
public class CreditoDAOImpl implements CreditoDAO {

    @PersistenceUnit
    private EntityManagerFactory emgFactory;

    public CreditoDAOImpl(){
    }
    @Override
    public List<Credito> getAllCredit() {
        return null;
    }

    @Override
    public Credito createCredito(Credito credito) {
        EntityManager maneger=emgFactory.createEntityManager();
        maneger.getTransaction().begin();

        credito.setUpdateDate(Calendar.getInstance().getTime());
        credito.setCreatedDate(Calendar.getInstance().getTime());

        Credito c1=maneger.merge(credito);
        maneger.getTransaction().commit();
        maneger.close();
        return c1;
    }
}
