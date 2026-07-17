import java.util.Scanner;
public class Empresa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[4];
        for(int i = 0; i < funcionarios.length; i++) {
            System.out.println("Digite o nome:");
            String nome = scanner.nextLine();
            System.out.println("Digite o cargo:");
            String cargo = scanner.nextLine();
            System.out.println("Digite o salário");
            double salario = scanner.nextDouble();
            scanner.nextLine();
            funcionarios[i] = new Funcionario(nome, cargo, salario);
        }
        for(int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].exibirDados();
        }
        Funcionario maiorFuncionario = funcionarios[0];
        for(int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i].salario > maiorFuncionario.salario) {
                maiorFuncionario = funcionarios[i];
            }
        }
        double totalsalario = 0;
        for(int i = 0; i < funcionarios.length; i++) {
            totalsalario = totalsalario + funcionarios[i].salario;
        }
        System.out.println("Total de Salario: " + totalsalario);
        
        double media = totalsalario / funcionarios.length;
        System.out.println("Média dos Salários: " + media);

        System.out.println("Nome do funcionario com maior salario: " + maiorFuncionario.nome);
        System.out.println("Maior salario: " + maiorFuncionario.salario);


        System.out.println("CHEGUEI NO WHILE");
        int numero = 1;
        while(numero != 0) {

        // ===== Menu =====
        System.out.println("===== Menu =====");
        System.out.println("1 - Mostrar os funcionarios: ");
        System.out.println("2 - Buscar funcionario: ");
        System.out.println("3 - Atualizar salario: ");
        System.out.println("4 - Remover funcionario: ");
        System.out.println("0 - Sair: ");

        numero = scanner.nextInt();
        scanner.nextLine(); 
        switch(numero) {

        case 1:
            for(int i = 0; i <funcionarios.length; i++) {
                if(funcionarios[i] != null) {
                   funcionarios[i].exibirDados();
                }
        }
        break;

        case 2: 
           System.out.println("Digite o nome do funcionario:");
           String nomeBusca = scanner.nextLine();
           for(int i = 0; i <funcionarios.length; i++) {
            if(funcionarios[i] != null && funcionarios[i].nome.equals(nomeBusca)) {
               funcionarios[i].exibirDados();
            }
           }
        break;

        case 3: 
        System.out.println("Digite o nome do funcionario:");
        String nomeAtualizar = scanner.nextLine();
        System.out.println("Digite o novo salario:");
        double novoSalario = scanner.nextDouble();

          for(int i = 0; i <funcionarios.length; i++) {
            if(funcionarios[i] != null && funcionarios[i].nome.equals(nomeAtualizar)){
               funcionarios[i].salario = novoSalario;
            }
          }
        break;

        case 4:
        System.out.println("Digite o nome:");
        String nomeRemover = scanner.nextLine();
        for(int i = 0; i<funcionarios.length; i++) {
            if(funcionarios[i] != null && funcionarios[i].nome.equals(nomeRemover)) {
        System.out.println("Funcionario removido: " + nomeRemover);
        funcionarios[i] = null;
          }
        }
        break;

         case 0: 
         System.out.println("Encerrando o programa: ");
         break;
        }
    }
    }
}