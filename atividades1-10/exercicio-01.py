//fiz o upload da primeira metade do codigo  e ate aqui por enquanto tudo rodou
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo = 1650;
        int opcao;
        int quantidadeSaques = 0;

        do {
            System.out.println("bem vindo ao sistema de banco 100% real");
            System.out.println("digite 1 pra ver o seu saldo");
            System.out.println("digite 2 pra depositar dinheiro aqui");
            System.out.println("Digite 3 pra sacar dinheiro aqui");
            System.out.println("digite 0 pra ir sair do nosso banco 100% real");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;
