public class Main {
    public static void main(String[] args) {
        String nome = "Emilli";
        int idade = 20;
        double salario = 9500.00;
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Salário: " + salario);
    String cargo;
    if (salario < 3000) {
        cargo = "JUNIOR";
    } else if (salario < 5000) {
        cargo = "PLENO";
    } else {
        cargo = "SENIOR";
    }
    System.out.println(cargo);
System.out.println("Cargo: " + cargo);
 double bonus;
if (cargo.equals("JUNIOR")) {
    bonus = 0.05;
} else if (cargo.equals("PLENO")) {
    bonus = 0.10;
} else {
    bonus = 0.15;
}
    System.out.println(bonus);
System.out.println("Salário: " + salario);
double salarioFinal = salario + (salario * bonus);
System.out.println("Salário Final: " + salarioFinal);
}
}