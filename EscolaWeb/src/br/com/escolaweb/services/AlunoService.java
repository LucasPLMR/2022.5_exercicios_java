package br.com.escolaweb.services;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import br.com.escolaweb.model.Aluno;

public class AlunoService extends DAO {

    public void add(Aluno aluno) throws SQLException {
        String sql1 = "insert into pessoa (_id, nome, email, data_nasc, senha) values (?,?,?,?,?)";
        String sql2 = "insert into aluno (_id,_id_pessoa,matricula) values (?,?,?)";
        Date dt = new Date();
        String id = String.valueOf(dt.getTime());
        Conectar();
        PreparedStatement stman = conn.prepareStatement(sql1);
        stman.setString(1, id);
        stman.setString(2,aluno.getNome());
        stman.setString(3,aluno.getEmail());
        stman.setDate(4, null,aluno.getDataNasc());
        stman.setString(5,aluno.getSenha());
        stman.execute();
        stman = conn.prepareStatement(sql2);
        stman.setString(1,id + "A");
        stman.setString(2,id);
        stman.setString(3,"MA" + id);
        stman.execute();
        stman.close();
    }
}
