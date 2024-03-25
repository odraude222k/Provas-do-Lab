package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Plataforma plat1 = new Plataforma("ps4","ken kutaragi");
        Jogo[] jogos = new Jogo[5];

        boolean flag = true;

        while (flag){
            System.out.println("Bem vindo ao menu: ");
            System.out.println("1 - adicionar jogos ");
            System.out.println("2 - mostrar as informacoes da plataforma e seus jogos");
            System.out.println("3 - mostrar o nome do jogo mais caro e do mais barato");
            System.out.println("4 - calcular quantos jogos tem dlc");
            System.out.println("5 - para sair do programa");

            int op = cin.nextInt();

            switch (op){

                case 1:
                    String nomejogo;
                    String generojogo;
                    double preco;
                    boolean dlc;
                    int i;
                    cin.nextLine();
                    System.out.println("Qual o nome do jogo: ");
                    nomejogo = cin.nextLine();
                    System.out.println("QUal o genero do jogo: ");
                    generojogo = cin.nextLine();
                    System.out.println("Digite o preco do jogo: ");
                    preco = cin.nextDouble();
                    System.out.println("Digite 1 se possui dlc ou 2 se nao tiver dlc: ");
                    i = cin.nextInt();
                    if(i == 1){
                        dlc = true;
                    }else {
                        dlc = false;
                    }
                    Jogo jog = new Jogo(nomejogo,generojogo,preco,dlc);
                    plat1.addJogo(jog);
                    break;
                case 2:
                    plat1.mostrainfo();
                    break;
                case 3:
                    plat1.mostraMaisCaroBarato();
                    break;
                case 4:
                    plat1.calculaDlc();
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
    }
}