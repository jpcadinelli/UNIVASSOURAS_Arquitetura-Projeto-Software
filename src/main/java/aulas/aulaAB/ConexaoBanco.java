package aulas.aulaAB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Aplicação do metodo de criação Singleton
public class ConexaoBanco {
    private static ConexaoBanco instancia;
    private Connection conexao;

    private ConexaoBanco() {
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/meu_banco", "usuario", "senha");
        } catch (SQLException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public static ConexaoBanco getInstancia() {
        if (instancia == null) {
            instancia = new ConexaoBanco();
        }
        return instancia;
    }

    public Connection getConexao() {
        return this.conexao;
    }
}
