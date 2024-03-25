package org.example;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Equipe equipe = new Equipe("dudu");
        Heroi[] h1 = new Heroi[5];

        boolean flag = true;

        while (flag){
            System.out.println("Bem vindo ao menu de heroi: ");
            System.out.println("1 - adicionar novo heroi");
            System.out.println("2 - mostrar informacoes da equipe e dos herois");
            System.out.println("3 - mostrar o heroi mais forte");
            System.out.println("4 - calcular a porcentagem de herois que podem voar");

            int op = cin.nextInt();
            switch (op){
                case 1:
                    cin.nextLine();
                    System.out.println("Qual o nome do novo heroi: ");
                    String novoheroi = cin.nextLine();
                    System.out.println("Qual o poder desse heroi: ");
                    float poder = cin.nextFloat();
                    System.out.println("Esse heroi pode voar? (1 - sim) (2 - nao)");
                    int aux = cin.nextInt();
                    boolean podevoar;
                    if(aux == 1){
                        podevoar = true;
                    }else {
                        podevoar = false;
                    }
                    Heroi h = new Heroi(novoheroi,poder,podevoar);
                    equipe.addHeroi(h);
                    break;

                case 2:
                    equipe.mostraInfo();
                    break;

                case 3:
                    equipe.mostraMaisForte();
                    break;
                case 4:
                    System.out.println(equipe.calculaVoadores());
                    break;
            }
        }
    }
}