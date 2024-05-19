import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[5];

        for (int i = 0; i < funcionarios.length; i++) {
            int opcao;
            do {
                System.out.print("Qual cargo você gostaria de incluir: 1- Programador ou 2- Instrutor? ");
                opcao = input.nextInt();
            } while (opcao != 1 && opcao != 2);

            input.nextLine(); 

            System.out.print("Digite o nome do funcionário: ");
            String nome_func = input.nextLine();
            System.out.print("Digite o e-mail do funcionário: ");
            String email = input.nextLine();

            if (opcao == 1) {
                System.out.print("Digite a linguagem de programação utilizada pelo programador: ");
                String ling_prog = input.nextLine();
                funcionarios[i] = new Programador(nome_func, email, ling_prog);
            } else {
                System.out.print("Digite a disciplina dada pelo instrutor: ");
                String discip = input.nextLine();
                funcionarios[i] = new Instrutor(nome_func, email, discip);
            }
        }

        System.out.println("\nDados dos funcionários:");
        for (Funcionario func : funcionarios) {
            func.exibeDados();
            System.out.println();
        }
        
        input.close();
    }
}