package com.example.SistemaHotel.Model.DAO;
import com.example.SistemaHotel.Model.entity.Abstrata;

import java.util.List;

public interface IDAO<H extends Abstrata> {

    void cadastrar(H entidade);

    void atualizar(H entidade);

    void excluir(int id);

    H buscar(int id);

    List<H> listar();
}
