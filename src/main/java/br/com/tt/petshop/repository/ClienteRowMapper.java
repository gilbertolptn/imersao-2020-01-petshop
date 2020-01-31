package br.com.tt.petshop.repository;

import br.com.tt.petshop.model.Cliente;
import br.com.tt.petshop.model.Unidade;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteRowMapper implements RowMapper<Cliente> {
    @Override
    public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setNascimento(rs.getDate("nascimento").toLocalDate());

        return cliente;
    }
}
