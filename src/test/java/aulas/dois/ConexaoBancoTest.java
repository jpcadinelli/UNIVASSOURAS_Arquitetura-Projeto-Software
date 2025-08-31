package aulas.dois;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConexaoBancoTest {

    @Test
    public void testInstanciaSingletonNaoEhNula() {
        ConexaoBanco instancia = ConexaoBanco.getInstancia();
        assertNotNull(instancia, "A instância do Singleton não deveria ser nula.");
    }

    @Test
    public void testConexaoNaoEhNula() {
        Connection conexao = ConexaoBanco.getInstancia().getConexao();
        assertNotNull(conexao, "A conexão não deveria ser nula.");
    }

    @Test
    public void testConexaoEstaAberta() throws SQLException {
        Connection conexao = ConexaoBanco.getInstancia().getConexao();
        assertFalse(conexao.isClosed(), "A conexão deveria estar aberta.");
    }
}
