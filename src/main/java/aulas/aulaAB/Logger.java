package aulas.aulaAB;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {
    private static Logger instancia;
    private PrintWriter escritor;

    private Logger() {
        try {
            FileWriter fw = new FileWriter("aplicacao.log", true);
            escritor = new PrintWriter(fw, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void log(String mensagem) {
        String dataHora = LocalDateTime.now().toString();
        escritor.println("[" + dataHora + "] " + mensagem);
    }
}

