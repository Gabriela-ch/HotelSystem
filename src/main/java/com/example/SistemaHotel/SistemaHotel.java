package com.example.SistemaHotel;

import java.util.ArrayList;
import java.util.List;

import com.example.SistemaHotel.Model.DAO.FuncionarioDAO;
import com.example.SistemaHotel.Model.DAO.HospedeDAO;
import com.example.SistemaHotel.Model.DAO.QuartoDAO;
import com.example.SistemaHotel.Model.entity.Funcionario;
import com.example.SistemaHotel.Model.entity.Hospede;
import com.example.SistemaHotel.Model.entity.Quarto;
import com.example.SistemaHotel.View.MenuView;

public class SistemaHotel extends MenuView {

        public static void main(String[] args) {

               //iniciar();

                // FUNCIONARIO Cadastrar
                /*Funcionario funcionario = new Funcionario("Marcela", "Recepcionista", "marcela@com");
                FuncionarioDAO dao = new FuncionarioDAO();
                dao.cadastrar(funcionario);*/
                 

                // FUNCIONARIO Listar
                /*
                 * List<Funcionario> lista = new ArrayList<>();
                 * FuncionarioDAO dao = new FuncionarioDAO();
                 * lista = dao.listar();
                 * for (Funcionario funcionario : lista){
                 * System.out.println(funcionario.getNome());
                 * System.out.println(funcionario.getEmail());
                 * }
                 */

                // FUNCIONARIO Buscar
                /*
                 * FuncionarioDAO dao = new FuncionarioDAO();
                 * Funcionario funcionario = new Funcionario();
                 * funcionario.setId(1);
                 * funcionario = dao.buscar(funcionario);
                 * System.out.println(funcionario.getNome());
                 */

                // FUNCIONARIO Atualizar NOK
                /*
                 * FuncionarioDAO dao = new FuncionarioDAO();
                 * Funcionario funcionario = new Funcionario();
                 * funcionario.setId(2);
                 * dao.atualizar(funcionario);
                 * System.out.println(funcionario.getNome());
                 */

                // FUNCIONÁRIO Deletar
                /*
                 * FuncionarioDAO dao = new FuncionarioDAO();
                 * Funcionario funcionario = new Funcionario();
                 * funcionario.setId(1);
                 * dao.excluir(funcionario);
                 */

                // ------------------//

                // HOSPEDE Cadastrar
                
                Hospede hospede = new Hospede("Richard Moura", "1234");
                HospedeDAO dao = new HospedeDAO();
                dao.cadastrar(hospede);
                 

                // HOSPEDE Listar hospede
                /*
                 * List<Hospede> lista = new ArrayList<>();
                 * HospedeDAO dao = new HospedeDAO();
                 * lista = dao.listar();
                 * for (Hospede hospede : lista){
                 * System.out.println(hospede.getNome());
                 * System.out.println(hospede.getCpf());
                 * }
                 */

                // HOSPEDE Buscar
                /*
                 * HospedeDAO dao = new HospedeDAO();
                 * Hospede hospede = new Hospede();
                 * hospede.setId(1);
                 * hospede = dao.buscar(hospede);
                 * System.out.println(hospede.getNome());
                 */

                // HOSPEDE Deletar
                /*
                 * HospedeDAO dao = new HospedeDAO();
                 * Hospede hospede = new Hospede();
                 * hospede.setId(2);
                 * dao.excluir(hospede);
                 */

                // ------------------//

                // Quarto Criar 100 quartos (regra de negocio)
                /*
                 * int i = 25;
                 * //while ( i <= 50 ){
                 * Quarto quarto = new Quarto(i,true,3,2);
                 * QuartoDAO dao = new QuartoDAO();
                 * dao.cadastrar(quarto);
                 * //i ++;
                 * //}
                 */

                // Quarto Atualizar
                /*
                 * QuartoDAO dao = new QuartoDAO();
                 * Quarto quarto = new Quarto();
                 * 
                 * quarto.setId();
                 * quarto.setNumero();
                 * quarto.setDisponivel();
                 * quarto.setmaxPessoas();
                 * quarto.setAndar();
                 * dao.atualizar(quarto);
                 * System.out.println( quarto.getId() + " " + quarto.getNumero() + " " +
                 * quarto.isDisponivel() + " " + quarto.getmaxPessoas() + " " +
                 * quarto.getAndar());
                 */

                // QUARTO Listar hospede
                /*
                 * List<Quarto> lista = new ArrayList<>();
                 * QuartoDAO dao = new QuartoDAO();
                 * lista = dao.listar();
                 * for (Quarto quarto : lista){
                 * System.out.println(quarto.getId() + " " + quarto.isDisponivel() + " " +
                 * quarto.isDisponivel() + " " + quarto.getmaxPessoas() + " " +
                 * quarto.getAndar());
                 * }
                 */

                // QUARTO Buscar
                /*
                 * QuartoDAO dao = new QuartoDAO();
                 * Quarto quarto = new Quarto();
                 * quarto.setId(2);
                 * quarto = dao.buscar(quarto);
                 * System.out.println(quarto.isDisponivel());
                 */

                // QUARTO Deletar
                /*
                 * QuartoDAO dao = new QuartoDAO();
                 * Quarto quarto = new Quarto();
                 * quarto.setId();
                 * dao.excluir(quarto);
                 */

        }

}
