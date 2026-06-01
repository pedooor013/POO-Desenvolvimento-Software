package com.example.model.dao;
import com.example.model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaDAO {
    private Connection con;

    public PessoaDAO(Connection con) {
        this.con = con;
    }

    //INSERT
    public void inserir(Pessoa pessoa){
        String sql = "INSERT INTO pessoa(nome, email) VALUES (?, ?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
                                     //^-- aqui fica a posição da interrogação (?)
            stmt.setString(2, pessoa.getEmail());
                                            //^-- aqui fica o valor que será inserido
            stmt.execute();//<-- onde executou a QUERY

            System.out.println("Pessoa: " + pessoa.getNome() + " salvo com sucesso!");

        }catch(SQLException e){

        }
    }
}
