package com.example.model.dao;
import com.example.model.Pessoa;
import java.sql.Connection;

public class PessoaDAO {
    private Connection con;

    public PessoaDAO(Connection con) {
        this.con = con;
    }

    //INSERT
    public void inserir(Pessoa pessoa){
        String sql = "INSERT INTO pessoa VALUES (nome, email)";
    }
}
