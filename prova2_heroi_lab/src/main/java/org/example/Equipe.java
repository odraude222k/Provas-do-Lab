package org.example;

public class Equipe {
    String capitao;
    Heroi[] heroi = new Heroi[10];
    int c;

    public Equipe(String capitao) {
        this.capitao = capitao;
    }

    void addHeroi(Heroi novoheroi){
        for (int i = 0; i < heroi.length; i++){
            if(heroi[i] == null){
                heroi[i] = novoheroi;
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("Capitao da equipe: " + this.capitao);
        System.out.println("Herois da equipe: ");
        for (int i = 0; i < heroi.length; i++){
            if(heroi[i] != null){
                System.out.println("Nome: " + heroi[i].nome);
                System.out.println("Poder: " + heroi[i].poder);
                if(heroi[i].podevoar){
                    System.out.println("Esse heroi pode voar");
                }else {
                    System.out.println("Esse heroi nao pode voar");
                }

            }
        }
    }

    void mostraMaisForte(){
        float heroimaisforte = -99999;


        for (int i = 0; i < heroi.length; i++){
            if(heroi[i] != null){
                if(heroi[i].poder > heroimaisforte){
                    heroimaisforte = heroi[i].poder;
                    c = i;
                }
            }
        }
        System.out.println("Heroi mais forte é: " + heroi[c].nome);
    }

    float calculaVoadores(){
         float voadores = 0;
         float total = 0;
         float x;


        for(int i = 0; i < heroi.length; i++){
            if(heroi[i] != null){
                if(heroi[i].podevoar){
                    voadores++;
                }
                total++;
            }

        }
        x = voadores*100f/ total;

        return x;
    }
}
