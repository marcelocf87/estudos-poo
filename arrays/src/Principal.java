public class Principal {

    public static void main(String[] args) {
        Turma turmaB = new Turma();
        turmaB.idetificacao = "Maternal B";
        turmaB.nomeProfessora = "Tia Maria";
        turmaB.alunos = new Aluno[3];

        turmaB.alunos[0] = new Aluno();
        turmaB.alunos[0].nome = "Cecília";
        turmaB.alunos[0].idade = 2;

        //Outra forma de fazer
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Artur";
        aluno1.idade = 4;

        turmaB.alunos[1] = aluno1;


    }
}
