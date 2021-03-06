package com.ussain.clock.alarme.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;


@Entity
public class Credito {
    //dados de auditoria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date createdDate;
    private Date updateDate;
    private String createdBy; // este campo no futoro vai conter o Objecto user
    private String aprovadoPOr; // este campo vai conter o user que aprovou o credito

    private long clienteId;// este capo no futuro vai conter o Cliente a quem está associado o Credito
    private long valor;
    private Date doDate;
    private double jurus;


    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getAprovadoPOr() {
        return aprovadoPOr;
    }

    public void setAprovadoPOr(String aprovadoPOr) {
        this.aprovadoPOr = aprovadoPOr;
    }

    public long getClienteId() {
        return clienteId;
    }

    public void setClienteId(long clienteId) {
        this.clienteId = clienteId;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }




    public Date getDoDate() {
        return doDate;
    }

    public void setDoDate(Date doDate) {
        this.doDate = doDate;
    }

    public double getJurus() {
        return jurus;
    }

    public void setJurus(double jurus) {
        this.jurus = jurus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
