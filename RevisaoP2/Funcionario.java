// Exercício 6: Implemente o conjunto de classe usando heranças, conforme modelo. Codifique um programa que leia os dados
// de 5 funcionários, armazene em vetor e exiba seus dados usando polimorfismo.

public class Funcionario {
    protected String nome, mail;
    protected int idade;

    public Funcionario(String nome, String mail) {
        this.nome = nome;
        this.mail = mail;
    }

    public Funcionario(String nome, String mail, int idade) {
        this.nome = nome;
        this.mail = mail;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void exibeDados() {
        System.out.printf("Nome: %s\nE-mail: %s\n", nome, mail);
    }
}