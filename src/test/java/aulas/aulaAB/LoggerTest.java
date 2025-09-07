package aulas.aulaAB;

import org.junit.jupiter.api.*;
import java.io.*;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class LoggerTest {

    private static final String LOG_FILE = "aplicacao.log";

    @Test
    void testInstanciaNaoEhNula() {
        Logger logger = Logger.getInstancia();
        assertNotNull(logger, "A instância do logger não deveria ser nula.");
    }

    @Test
    void testInstanciaEhSempreAMesma() {
        Logger logger1 = Logger.getInstancia();
        Logger logger2 = Logger.getInstancia();
        assertSame(logger1, logger2, "As duas instâncias devem ser a mesma ().");
    }

    @Test
    void testLogEscreveNoArquivo() throws IOException {
        Logger logger = Logger.getInstancia();
        String mensagem = "Teste de log unitário";

        logger.log(mensagem);

        BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE));
        String linha = reader.readLine();
        reader.close();

        assertNotNull(linha, "A linha do log não deveria ser nula.");
        assertTrue(linha.contains(mensagem), "A linha do log deveria conter a mensagem de teste.");
    }
}

