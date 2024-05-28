// model, ficarao as regras de negócio.

package com.example.SistemaHotel.Model.entity;

import java.sql.Date;

public class Reserva extends Abstrata {

    
    private int responsavel;
    private Date checkinDate;
    private Date checkoutDate;
    private int qtdPessoas;
    
    public Reserva() {
        //TODO Auto-generated constructor stub
    }


    public int getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(int responsavel) {
        this.responsavel = responsavel;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }



}

