public class Dados {
    public static void main(String[] args ) {
        int[] id = {1, 2, 3};
        String[] nome = {"Roberto", "Fernanda", "Lucas"};
        String[] cargo = {"Analista", "Gerente", "Supervisor"};
        double[] salario = {2000, 3000, 4000};
        for (int i = 0; i < id.length; i++) {
            System.out.println(id[i]);
            System.out.println(nome[i]);
            System.out.println(cargo[i]);
            System.out.println(salario[i]);
        }
    System.out.println("Dados carregado!");
    }
}