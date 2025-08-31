package materiais.padroescomportamentais.memento;

public class AlunoEstadoJubilado implements AlunoEstado {

    private AlunoEstadoJubilado() {};
    private static AlunoEstadoJubilado instance = new AlunoEstadoJubilado();
    public static AlunoEstadoJubilado getInstance() {
        return instance;
    }
    
    public String getNomeEstado() {
        return "Jubilado";
    }

}
