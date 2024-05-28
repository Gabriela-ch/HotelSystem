package com.example.SistemaHotel.Controller;

import java.util.ArrayList;
import java.util.List;

import com.example.SistemaHotel.Model.DAO.IDAO;

import com.example.SistemaHotel.Model.DAO.FuncionarioDAO;
import com.example.SistemaHotel.Model.DAO.HospedeDAO;
import com.example.SistemaHotel.Model.entity.Funcionario;
import com.example.SistemaHotel.Model.entity.Hospede;

public class FuncionarioController {

        private final IDAO<Funcionario> funcionarioDAO;

        public FuncionarioController(IDAO<Funcionario> funcionarioDAO) {
        this.funcionarioDAO = funcionarioDAO;
        }

        // Cadastrar Funcionario
        public String cadastrar(Funcionario funcionario) {
                funcionarioDAO.cadastrar(funcionario);
                return "Cadastrado com sucesso!";
        };

        // Atualizar Funcionario
        public String atualizar(Funcionario funcionario) {
                funcionarioDAO.atualizar(funcionario);
                return "Atualizado com sucesso!";
        };

        // Excluir Funcionario
        public String excluir(int id) {
                funcionarioDAO.excluir(id);
                return "Excluido com sucesso!";
        };
        
        // Buscar Funcionario
        public Funcionario buscar(int id) {
                return (Funcionario) funcionarioDAO.buscar(id);
        }

        public List<Funcionario> listar() {
                return funcionarioDAO.listar();
        }
}
