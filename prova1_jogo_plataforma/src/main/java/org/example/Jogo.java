package org.example;

public class Jogo {
    String nome;
    String genero;
    double preco;
    boolean dlc;

    public Jogo(String nome, String genero, double preco, boolean dlc) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.dlc = dlc;
    }

    void mostraInfo(){
        System.out.println("Nome do jogo " + this.nome);
        System.out.println("Genero do jogo " + this.genero);
        System.out.println("Preco do jogo " + this.preco);
        if(dlc){
            System.out.println("Possui dlc");
        }else {
            System.out.println("Nao possui dlc");
        }
    }
}
