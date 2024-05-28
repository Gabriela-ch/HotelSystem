package com.example.SistemaHotel.Controller;

import java.util.ArrayList;
import java.util.List;

import com.example.SistemaHotel.Model.DAO.IDAO;
import com.example.SistemaHotel.Model.entity.Hospede;


public class HospedeController {

    private final IDAO<Hospede> hospedeDAO;

    public HospedeController(IDAO<Hospede> hospedeDAO) {
        this.hospedeDAO = hospedeDAO;
    }
    
    // Cadastradar hospede
    public String cadastrarHospede(Hospede hospede){
        hospedeDAO.cadastrar(hospede);
        return "Cadastrado com sucesso!";
    }
  
    // Atualizar Hospede
    public String atualizarHospede(Hospede hospede){
        hospedeDAO.atualizar(hospede);
        return "Atualizado com sucesso!";
    };
   
    // Excluir Hospede
    public String excluirHospede(int id){
        hospedeDAO.excluir(id);
        return "Excluído com sucesso!";
    };
    
    
    public List<Hospede> listarHospede() {
        return hospedeDAO.listar();
    }

    //buscar hospede


}
