package com.example.SistemaHotel.Controller;

public class TipoQuartoController {
    
    private final IDAO<TipoQuarto> TipoQuartoDAO;

    public TipoQuartoController(IDAO<TipoQuarto> TipoQuartoDAO) {
        this.TipoQuartoDAO = TipoQuartoDAO;
    }
   
    
    // Cadastradar TipoQuarto
    public String cadastrar(TipoQuarto TipoQuarto){
        TipoQuartoDAO.cadastrar(TipoQuarto);
        return "Cadastrado com sucesso!";
    }
  
    // Atualizar TipoQuarto
    public String atualizar(TipoQuarto TipoQuarto){
        TipoQuartoDAO.atualizar(TipoQuarto);
        return "Atualizado com sucesso!";
    };
   
    // Excluir TipoQuarto
    public String excluir(int id){
        TipoQuartoDAO.excluir(id);
        return "Excluído com sucesso!";
    };
    
    
    public List<TipoQuarto> listar() {
        return TipoQuartoDAO.listar();
    }
}
