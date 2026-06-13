public class SistemaDeRH {
   public static void main(String[] args) {
        String [] nomes = {"Roberto", "Fernanda", "Lucas", "Antonio"};
        double [] salario = {2000, 3000, 4000, 5000};
        String [] cargos = {"Analista", "Gerente", "Supervisor", "Coordenador"};
            for (int i = 0; i < nomes.length; i++) {
                System.out.println(nomes[i]);
                System.out.println(salario[i]);
                System.out.println(cargos[i]);
            }
        double soma = 0;
        for (int i = 0; i < salario.length; i++) {
          soma = soma + salario[i];
        }
        System.out.println(soma);
          double media = soma / salario.length;
          System.out.println("Total de salario : " + soma);
          System.out.println("Média dos salários : " + media);
          double maiorSalario = salario[0];
          String nomeMaiorSalario = nomes[0];
           for (int i = 0; i < nomes.length; i++) {
               if (salario[i] > maiorSalario) {
                    maiorSalario = salario[i];
                    nomeMaiorSalario = nomes[i];
               }
           }
                System.out.println("Funcionário com maior salário: " + nomeMaiorSalario);
                System.out.println("Maior salário: " + maiorSalario);
           double menorSalario = salario[0];
           String nomeMenorSalario = nomes[0];
            for (int i = 0; i < nomes.length; i++) {
                if (salario[i] < menorSalario) {
                    menorSalario = salario[i];
                    nomeMenorSalario = nomes[i];
                }
            }
              System.out.println("Menor salário: " + menorSalario);
              System.out.println("Nome do funcionário com menor salário: " + nomeMenorSalario);
              for (int i = 0; i < 4; i++) {
                    System.out.println(i);
                }
               int QuantidadeCargos = 1;
               int QuantidadeAnalistas = 1;
               int QuantidadeGerentes = 1;
               int QuantidadeSupervisores = 1;
               int QuantidadeCoordenadores = 1;
            for (int i = 0; i < cargos.length; i++) {
                if(cargos[i].equals("Analistas")) {
                    QuantidadeAnalistas++;
                }else if(cargos[i].equals("Gerentes")) {
                    QuantidadeSupervisores++;
                }else if(cargos[i].equals("Supervisores")) {
                    QuantidadeSupervisores++;
                }else if(cargos[i].equals("Coordenadores")){
                    QuantidadeCoordenadores++;
                }
          }
          System.out.println("Quantidade de Analista: " + QuantidadeAnalistas);
          System.out.println("Quantidade de Gerentes: " + QuantidadeGerentes);
          System.out.println("Quantidade de Supervisores: " + QuantidadeSupervisores);
          System.out.println("Quantidade de Coordenadores: " + QuantidadeCoordenadores);
  }
}