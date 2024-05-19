public class Programador extends Funcionario {
    private String linguagem, sistema_operacional;

    public Programador(String nome, String mail, String linguagem) {
        super(nome, mail);
        this.linguagem = linguagem;
    }

    public Programador(String nome, String mail, String linguagem, String sistema_operacional) {
        super(nome, mail);
        this.linguagem = linguagem;
        this.sistema_operacional = sistema_operacional;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setSistOper(String sistema_operacional) {
        this.sistema_operacional = sistema_operacional;
    }

    public String getSistOper() {
        return sistema_operacional;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.printf("Cargo: Programador\nLinguagem de programação: %s\n",linguagem);
    }
}