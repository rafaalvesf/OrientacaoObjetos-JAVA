package MuitosParaMuitos;

public class TesteCurso {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Rafael");
        Aluno aluno2 = new Aluno("Joao");
        Aluno aluno3 = new Aluno("Pedro");
        Aluno aluno4 = new Aluno("Carlos");
        Aluno aluno5 = new Aluno("Manu");

        Curso curso1 = new Curso("Analise de Sistemas");
        Curso curso2 = new Curso("Python Avançado");
        Curso curso3 = new Curso("C# na Pratica");
        Curso curso4 = new Curso("Java Avançado");

        aluno1.adicionarCurso(curso1);
        aluno1.adicionarCurso(curso2);
        aluno1.adicionarCurso(curso3);
        aluno1.adicionarCurso(curso4);

        aluno2.adicionarCurso(curso1);
        aluno2.adicionarCurso(curso3);

        aluno3.adicionarCurso(curso4);

        curso1.adicionarAluno(aluno5);
        curso1.adicionarAluno(aluno4);

        for (Aluno aluno: curso1.alunos){
            System.out.println("Curso: " + curso1.nome);
            System.out.println("Nome: " + aluno.nome);
        }
    }
}
