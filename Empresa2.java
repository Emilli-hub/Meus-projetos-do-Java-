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

        boolean encontrou = false;
        //Digite o nome do funcionarios que deseja buscar
        System.out.println("Digite o nome do funcionarios que deseja buscar:");
        String nomeBusca = scanner.nextLine();
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i].nome.equals(nomeBusca)) {
                encontrou = true;
            }
        }
        if (encontrou) {
            System.out.println("Funcionario encontrado: " + nomeBusca);
        } else {
            System.out.println("Funcionario não encontrado: " + nomeBusca);
        }

        //Atualizar o salario do funcionarios
        System.out.println("Digite o nome do funcionarios que deseja atualizar o salario: ");
        String nomeAtualizar = scanner.nextLine();
        for(int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i].nome.equals(nomeAtualizar)) {
                System.out.println("Digite o novo salario: ");
                String novoSalario = scanner.nextLine();
                funcionarios[i].salario = Double.parseDouble(novoSalario);
                funcionarios[i].exibirDados();
            }
        }
        //Remover o funcionarios 
        System.out.println("Digite o nome do funcionarios que deseja remover: ");
        String nomeRemover = scanner.nextLine();
        for(int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i] == null) {
                continue;
            }
            funcionarios[i].exibirDados();

            //Resto do codigo para remover o funcionario
            if(funcionarios[i].nome.equals(nomeRemover)) {
                System.out.println("Funcionario removido: " + nomeRemover);
                funcionarios[i] = null;
            }
        }
    }
    }