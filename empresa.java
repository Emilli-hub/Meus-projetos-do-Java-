public class Empresa { 
    public static void main(String[] args) {
    Funcionario funcionario1 = new Funcionario("Ana", "Analista", 2500.00);
    Funcionario funcionario2 = new Funcionario("João", "Gerente", 3500.00);
    Funcionario funcionario3 = new Funcionario("Maria", "Supervisora", 5000.00);
    Funcionario funcionario4 = new Funcionario("Jose", "Programador", 4000.00);
    funcionario1.exibirDados();
    funcionario2.exibirDados();
    funcionario3.exibirDados();
    funcionario4.exibirDados();
    double totalsalario = funcionario1.salario + funcionario2.salario + funcionario3.salario + funcionario4.salario;
    System.out.println("Total de Salario: " + totalsalario);

    double media = totalsalario / 4;
    System.out.println("Média dos salario: " + media);

    double MaiorSalario = funcionario1.salario;
    String NomeMaiorSalario = funcionario1.nome;
    if(funcionario1.salario > MaiorSalario) {
        MaiorSalario = funcionario1.salario;
        NomeMaiorSalario = funcionario1.nome;
    }
    MaiorSalario = funcionario2.salario;
    NomeMaiorSalario = funcionario2.nome;
    if(funcionario2.salario > MaiorSalario) {
        MaiorSalario = funcionario2.salario;
        NomeMaiorSalario = funcionario2.nome;
    }
    MaiorSalario = funcionario3.salario;
    NomeMaiorSalario = funcionario3.nome;
    if(funcionario3.salario > MaiorSalario) {
        MaiorSalario = funcionario3.salario;
        NomeMaiorSalario = funcionario3.nome;
    }
    MaiorSalario = funcionario4.salario;
    NomeMaiorSalario = funcionario4.nome;
    if(funcionario4.salario > MaiorSalario) {
        MaiorSalario = funcionario4.salario;
        NomeMaiorSalario = funcionario4.nome;
    }
    System.out.println("Nome do funcionario com maior salario: " + NomeMaiorSalario);
    System.out.println("Maior salario: " + MaiorSalario);
    }
}