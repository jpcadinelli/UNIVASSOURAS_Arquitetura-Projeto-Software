package materiais.padroescomportamentais.memento;

public class AlunoEstadoTrancado implements AlunoEstado {

    private AlunoEstadoTrancado() {};
    private static AlunoEstadoTrancado instance = new AlunoEstadoTrancado();
    public static AlunoEstadoTrancado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Trancado";
    }

}
