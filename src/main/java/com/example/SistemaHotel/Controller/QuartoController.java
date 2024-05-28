package com.example.SistemaHotel.Controller;

import java.util.List;

import com.example.SistemaHotel.Model.DAO.IDAO;
import com.example.SistemaHotel.Model.entity.Quarto;

public class QuartoController {
    
   private final IDAO<Quarto> quartoDAO;

    public QuartoController(IDAO<Quarto> quartoDAO) {
        this.quartoDAO = quartoDAO;
    }
    
    // Cadastradar Quarto
    public String cadastrar(Quarto quarto){
        quartoDAO.cadastrar(quarto);
        return "Cadastrado com sucesso!";
    }
  
    // Atualizar Quarto
    public String atualizar(Quarto quarto){
        quartoDAO.atualizar(quarto);
        return "Atualizado com sucesso!";
    };
   
    // Excluir Quarto
    public String excluir(int id){
        quartoDAO.excluir(id);
        return "Excluído com sucesso!";
    };
    
    
    public List<Quarto> listar() {
        return quartoDAO.listar();
    }
}
