//Controla os dados da view
package com.example.SistemaHotel.Controller;

import java.util.List;

import com.example.SistemaHotel.Model.DAO.IDAO;
import com.example.SistemaHotel.Model.entity.Reserva;


public class ReservaController {

    private final IDAO<Reserva> reservaDAO;

    public ReservaController(IDAO<Reserva> reservaDAO) {
        this.reservaDAO = reservaDAO;
    }
   
    
    // Cadastradar Reserva
    public String cadastrar(Reserva reserva){
        reservaDAO.cadastrar(reserva);
        return "Cadastrado com sucesso!";
    }
  
    // Atualizar Reserva
    public String atualizar(Reserva reserva){
        reservaDAO.atualizar(reserva);
        return "Atualizado com sucesso!";
    };
   
    // Excluir Reserva
    public String excluir(int id){
        reservaDAO.excluir(id);
        return "Excluído com sucesso!";
    };
    
    
    public List<Reserva> listar() {
        return reservaDAO.listar();
    }

}
