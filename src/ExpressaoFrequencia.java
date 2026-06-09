package escolainterpreter;

public class ExpressaoFrequencia implements Expressao {

    @Override
    public boolean interpretar(ContextoAluno contexto) {

        return contexto.getFrequencia() >= 75;
    }
}