package org.example;

import java.sql.SQLOutput;

public class Serie {
    String nome;
    double nota;
    int temporadas;
    boolean finalizada;
    Diretor diretor;

    public Serie(String nome, double nota, int temporadas, boolean finalizada,String nomediretor) {
        this.nome = nome;
        this.nota = nota;
        this.temporadas = temporadas;
        this.finalizada = finalizada;
        diretor = new Diretor(nomediretor);
    }

    void mostraInfo (){
        System.out.println("Nome da serie: " + this.nome);
        System.out.println("Nota da serie: " + this.nota);
        System.out.println("Numero de temporadas: " + this.temporadas);
        if(finalizada){
            System.out.println("Serie finalizada");
        }else {
            System.out.println("Serie em andamento");
        }
    }
}
