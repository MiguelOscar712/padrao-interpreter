package escolainterpreter;

public class ExpressaoNota implements Expressao {

    @Override
    public boolean interpretar(ContextoAluno contexto) {

        return contexto.getNota() >= 60;
    }
}