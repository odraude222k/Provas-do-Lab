package org.example;

public class Plataforma {

    String nome;
    Serie[] series = new Serie[10];
    int c;


    public Plataforma(String nome) {
        this.nome = nome;
    }

    void mostrainfo(){
        System.out.println("Nome da plataforma: ");
        System.out.println(this.nome);
        System.out.println("Informacoes das series: ");
        for (int i = 0; i < series.length; i++){
            if(series[i] != null){
                series[i].mostraInfo();
            }
        }
    }

    void addSerie(Serie novaserie){
        for(int i = 0; i < series.length; i++){
            if (series[i] == null){
                series[i] = novaserie;
            }
        }
    }

    String serieMaisLongaFinalizada(){

        int templonga = -99999;
        for(int i = 0; i < series.length; i++){
            if(series[i] != null){
                if(series[i].temporadas > templonga &&  series[i].finalizada){
                    templonga = series[i].temporadas;
                    c = i;
                }
            }
        }
        return series[c].nome;
    }

    void mediaPorcentagem(){
        double totalserie = 0;
        double totalserietemp3 = 0;
        double soma = 0;
        double media;
        double porcentagem;

        for (int i = 0; i < series.length; i++){
            if(series[i] != null){
                totalserie++;
                if(series[i].temporadas >= 3){
                    totalserietemp3++;
                    soma += series[i].nota;
                }
            }
        }

        media = soma/totalserie;
        porcentagem = totalserietemp3/totalserie*100;

        System.out.println("A media das notas 3 ou mais: " + media);
        System.out.println("Porcentagem 3 ou mais: " + porcentagem);
    }



}
