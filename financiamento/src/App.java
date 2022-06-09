import java.util.Scanner;

import entidades.Emprestimo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite os dados para solicitar o empréstimo: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Renda mensal: ");
        double rendaMensal = sc.nextDouble();
        System.out.print("Valor do empréstimo que deseja: ");
        double valorTotal = sc.nextDouble();
        System.out.print("Número de parcelas: ");
        int numDePrestacoes = sc.nextInt();

        Emprestimo emp = new Emprestimo(nome, rendaMensal, valorTotal, numDePrestacoes);

        System.out.println();
        emp.regras();


        sc.close();
    }
}
