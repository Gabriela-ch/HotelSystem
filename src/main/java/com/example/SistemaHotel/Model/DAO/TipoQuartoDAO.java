package com.example.SistemaHotel.Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.SistemaHotel.Model.entity.TipoQuarto;
import com.example.SistemaHotel.config.DB;

public class TipoQuartoDAO implements IDAO<TipoQuarto> {


public TipoQuartoDAO() {
    }

    private Connection conexao(){
        
        DB db = new DB();
        Connection conn = null;

        try {
            conn = db.getConnection();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


     @Override
    public void cadastrar(TipoQuarto entidade) {

        Connection conn = this.conexao();

        try {
            String sql = "INSERT INTO TipoQuarto (id, responsavel, checkinDate, checkoutdate, qtdpessoas) VALUES ( nextval('seq_reserva') , ?, ? , ? ,? )";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, entidade.getResponsavel());
            statement.setDate(2, entidade.getCheckinDate());
            statement.setDate(3, entidade.getCheckoutDate());
            statement.setInt(4, entidade.getQtdPessoas());
            statement.executeUpdate();
            System.out.println("Tipo do Quarto Criado!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(TipoQuarto entidade) {
        
        Connection conn = this.conexao();

        try {
            String sql = "UPDATE TipoQuarto SET responsavel = ?, checkinDate = ?, checkoutDate = ? qtdPessoas = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, entidade.getResponsavel());
            statement.setDate(2, entidade.getCheckinDate());
            statement.setDate(3, entidade.getCheckoutDate());
            statement.setInt(4, entidade.getQtdPessoas());
            statement.setInt(5, entidade.getId());
            statement.executeUpdate();
            System.out.println("Tipo do Quarto Alterado!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
         
    }

    @Override
    public void excluir(int id) {

        Connection conn = this.conexao();

        try {
            String sql = "DELETE FROM Reserva WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, entidade.getId());
            statement.executeUpdate();
            System.out.println("Reserva excluido!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public TipoQuarto buscar(int id) {

        Connection conn = this.conexao();

        TipoQuarto retorno = new TipoQuarto();
        try {
            String sql = "SELECT id, responsavel, checkinDate, checkoutDate, qtdPessoas FROM Reserva WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, entidade.getId());
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                System.out.println("Detalhes:");
                retorno.setId(result.getInt("id"));
                retorno.setResponsavel(result.getInt("responsavel"));
                retorno.setCheckinDate(result.getDate("checkinDate"));
                retorno.setCheckoutDate(result.getDate("checkoutDate"));
                retorno.setQtdPessoas(result.getInt("qtdPessoas"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return retorno;
    }

    @Override
    public List<TipoQuarto> listar() {

        Connection conn = this.conexao();
        
        List<TipoQuarto> retorno = new ArrayList();
        try {
            String sql = "SELECT id, responsavel, checkinDate, checkoutDate, qtdPessoas FROM Reserva";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                TipoQuarto tipoquarto = new TipoQuarto();

                tipoquarto.setId(result.getInt("id"));
                tipoquarto.setResponsavel(result.getInt("responsavel"));
                tipoquarto.setCheckinDate(result.getDate("checkinDate"));
                tipoquarto.setCheckoutDate(result.getDate("checkoutDate"));
                tipoquarto.setQtdPessoas(result.getInt("qtdPessoas"));
                //Listando todos os preenchimentos 
                retorno.add(tipoquarto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return retorno;
    }

    public void inserir(Reserva entidade) {
        
        Connection conn = this.conexao();

        try {
            String sql = "UPDATE Reserva SET responsavel = ?, checkinDate = ?, checkoutDate = ? qtdPessoas = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, entidade.getResponsavel());
            statement.setDate(2, entidade.getCheckinDate());
            statement.setDate(3, entidade.getCheckoutDate());
            statement.setInt(4, entidade.getQtdPessoas());
            statement.setInt(5, entidade.getId());
            statement.executeUpdate();
            System.out.println("Reserva Alterado!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

}

