package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Serie[] series = new Serie[10];
        Plataforma plat = new Plataforma("netflix");

        boolean flag = true;
        while (flag){
            System.out.println("Bem vindo ao menu");
            System.out.println("1 - adicionar uma serie a plataforma");
            System.out.println("2 - mostrar as informacoes da plataforma e suas series");
            System.out.println("3 - mostrar o nome da serie com maior numero de temporadas que ja foi finalizada");
            System.out.println("4 - mostrar a porcentagem e a media aritmetica das notas das que possuem 3 ou mais temporadas");

            int op;
            op = sc.nextInt();
            switch (op){
                case 1:
                    sc.nextLine();
                    System.out.println("Nome da serie: ");
                    String nomenovo = sc.nextLine();
                    System.out.println("Nota da serie: ");
                    double nota = sc.nextDouble();
                    System.out.println("Quantas temporadas: ");
                    int temporadas = sc.nextInt();
                    System.out.println("Ja foi finalizada? (1-sim 2 - nao)");
                    int fim = sc.nextInt();
                    boolean finalizada;
                    if(fim == 1){
                        finalizada = true;
                    }else {
                        finalizada = false;
                    }
                    sc.nextLine();
                    System.out.println("Nome do diretor: ");
                    String nomediretor = sc.nextLine();

                    Serie s1 = new Serie(nomenovo,nota,temporadas,finalizada,nomediretor);
                    plat.addSerie(s1);
                    break;
                case 2:
                    plat.mostrainfo();
                    break;
                case 3:
                    plat.serieMaisLongaFinalizada();
                    break;
                case 4:
                    plat.mediaPorcentagem();
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
    }
}