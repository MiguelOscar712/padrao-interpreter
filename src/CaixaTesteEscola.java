package escolainterpreter;

public class CaixaTesteEscola {

    public static void main(String[] args) {

        System.out.println(" CAIXA DE TESTE - INTERPRETER");

        Expressao regra =
                new ExpressaoAnd(
                        new ExpressaoNota(),
                        new ExpressaoFrequencia()
                );

        ContextoAluno aluno1 =
                new ContextoAluno(80, 90);

        ContextoAluno aluno2 =
                new ContextoAluno(50, 90);

        ContextoAluno aluno3 =
                new ContextoAluno(80, 60);

        System.out.println(
                "Aluno 1: "
                        + regra.interpretar(aluno1));

        System.out.println(
                "Aluno 2: "
                        + regra.interpretar(aluno2));

        System.out.println(
                "Aluno 3: "
                        + regra.interpretar(aluno3));

        System.out.println(" TESTES FINALIZADOS");
    }
}