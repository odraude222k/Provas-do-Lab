package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // instancia de rapper e arena
        Arena arena = new Arena("Inatel","Santa Rita Do Sapucai");
        Rapper[] rappers = new Rapper[10];
        // variavel auxiliar
        boolean flag = true;

        while(flag){
            //interacao com o usuario
            System.out.println("1 - Adicionar rapper");
            System.out.println("2 - Mostrar informacoes da arena e de seus rappers");
            System.out.println("3 - Mostrar quais rappers tem microfone dourado");
            System.out.println("4 - Mostrar qual rapper ficou em primeiro e qual ficou em ultimo");
            int op = sc.nextInt();

            switch (op){
                case 1:
                    // entrada de dados para adicionar rappers a lista
                    sc.nextLine();
                    System.out.println("Digite o nome do rapper:");
                    String nome = sc.nextLine();
                    System.out.println("Nota do rapper:");
                    float nota = sc.nextFloat();
                    System.out.println("Idade do rapper: ");
                    int idade = sc.nextInt();
                    System.out.println("Material do micrfone");
                    sc.nextLine();
                    String material = sc.nextLine();
                    // instancia para envio de informacoes
                    Microfone microfone = new Microfone(material);
                    Rapper rapper = new Rapper(nome,nota,idade,microfone);
                    arena.addRapper(rapper);
                    break;
                case 2:
                    arena.mostraInfo(); // chama o metodo que mostra as informacoes
                    break;
                case 3:
                    arena.microfoneDou(); // chama o metodo para quem tem microfone dourado
                    break;
                case 4:
                    arena.ranking(); // chama metodo para ganhador e perdedor
                    break;
            }
        }
    }
}