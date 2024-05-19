public class Instrutor extends Funcionario {
    private String disciplina;

    public Instrutor(String nome, String mail, String disciplina) {
        super(nome, mail);
        this.disciplina = disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.printf("Cargo: Instrutor\nDisciplina: %s\n", disciplina);
    }
}