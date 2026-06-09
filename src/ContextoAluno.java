package escolainterpreter;

public class ContextoAluno {

    private double nota;
    private double frequencia;

    public ContextoAluno(double nota, double frequencia) {
        this.nota = nota;
        this.frequencia = frequencia;
    }

    public double getNota() {
        return nota;
    }

    public double getFrequencia() {
        return frequencia;
    }
}