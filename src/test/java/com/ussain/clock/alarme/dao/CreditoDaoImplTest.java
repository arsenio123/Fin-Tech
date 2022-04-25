package com.ussain.clock.alarme.dao;

import com.ussain.clock.alarme.api.CreditoAPI;
import com.ussain.clock.alarme.model.Credito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Calendar;

@SpringBootApplication
public class CreditoDaoImplTest {

   private CreditoDAO creditoDAO;

    @Autowired
   public CreditoDaoImplTest(CreditoDAO creditoDAO){
        this.creditoDAO=creditoDAO;
   }

   private void testCreateCredito(){
       Credito credito=new Credito();
       credito.setAprovadoPOr("Arsenio gerente");
       credito.setCreatedBy("Arsenio cliente");
       credito.setJurus(30);
       credito.setDoDate(Calendar.getInstance().getTime());
       credito.setValor(500);
       credito.setCreatedDate(Calendar.getInstance().getTime());
       creditoDAO.createCredito(credito);
   }
    public static void main(String[] args) {

        ApplicationContext cx= SpringApplication.run(CreditoDaoImplTest.class,args);
        //testCreateCredito();
        //CreditoAPI apitest=new CreditoAPI();
        //apitest.createCredito();
    }
}
