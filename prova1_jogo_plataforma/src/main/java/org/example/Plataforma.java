package org.example;

public class Plataforma {
        String nome;
        String criador;
        Jogo[] jogos = new Jogo[5];

    public Plataforma(String nome, String criador) {
        this.nome = nome;
        this.criador = criador;
    }

    void mostrainfo(){
        System.out.println("Informacoes gerais: ");
        System.out.println("Nome da plataforma: ");
        System.out.println(this.nome);
        System.out.println("Nome do criador: ");
        System.out.println(this.criador);
        System.out.println("Jogos criados e informacoes: ");
        for (int i = 0;i < jogos.length;i++){
            if(jogos[i] != null){
                jogos[i].mostraInfo();
            }
        }

    }

    void addJogo(Jogo novoJogo){
        for(int i = 0; i < jogos.length; i++){
            if(jogos[i] == null){
                jogos[i] = novoJogo;
                break;
            }
        }
    }

    void mostraMaisCaroBarato(){
        int caro = -999999;
        int barato = 999999;
        int c;
        int b;

        for (int i = 0; i < jogos.length; i++){
            if(jogos[i] != null){
               if(jogos[i].preco > caro) {
                   c = i;
               }
               if(jogos[i].preco < barato){
                   b = i;
               }
            }
        }


    }

    void calculaDlc(){

    }
}
