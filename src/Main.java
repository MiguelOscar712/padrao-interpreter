package escolainterpreter;

public class Main {

    public static void main(String[] args) {

        ContextoAluno aluno =
                new ContextoAluno(80, 90);

        Expressao regra =
                new ExpressaoAnd(
                        new ExpressaoNota(),
                        new ExpressaoFrequencia()
                );

        if (regra.interpretar(aluno)) {

            System.out.println("Aluno aprovado!");

        } else {

            System.out.println("Aluno reprovado!");
        }
    }
}