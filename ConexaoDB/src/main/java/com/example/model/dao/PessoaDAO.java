package com.example.model.dao;
import com.example.model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PessoaDAO {
    private Connection con;

    public PessoaDAO(Connection con) {
        this.con = con;
    }

    //INSERT
    public void inserir(Pessoa pessoa){
        String sql = "INSERT INTO pessoas(nome, email) VALUES (?, ?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
                                     //^-- aqui fica a posição da interrogação (?)
            stmt.setString(2, pessoa.getEmail());
                                            //^-- aqui fica o valor que será inserido
            stmt.execute();//<-- onde executou a QUERY

            System.out.println("Pessoa: " + pessoa.getNome() + " salvo com sucesso!");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Pessoa> listar(){
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        String sql = "SELECT * FROM pessoas";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Pessoa p = new Pessoa();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setEmail(rs.getString("email"));
                pessoas.add(p);
            }

            return pessoas;
        }catch(SQLException e){
            System.out.println("Erro ao listar pessoas! " +  e.getMessage());
        }
            return pessoas;
    }
}
