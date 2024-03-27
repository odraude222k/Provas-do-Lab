package org.example;

public class Arena {
    // variaveis da arena
    String nome;
    String lugar;
    // instancia de rappers
    Rapper[] rappers = new Rapper[10];
    int maior = 0;
    int menor = 0;

    //construtor da arena
    public Arena(String nome, String lugar) {
        this.nome = nome;
        this.lugar = lugar;
    }

    //adiciona rapper
    void addRapper(Rapper rapper){
        for(int i = 0; i < rappers.length; i++){
            if(rappers[i] == null){
                rappers[i] = rapper;
                break;
            }
        }
    }
    //mostra as informacoes dos rappers e da arena
    void mostraInfo(){
        System.out.println("Nome da arena: " + this.nome);
        System.out.println("Nome do lugar: " + this.lugar);
        System.out.println("Informacoes dos rappers: ");
        System.out.println("-------------------------");
        for (int i =0; i < rappers.length; i++){
            if(rappers[i] != null){
                rappers[i].mostraInfo();
                System.out.println("-------------------------");
            }
        }
    }
    // quais tem microfone dourado
    void microfoneDou(){

        for (int i = 0; i < rappers.length; i++){
            if(rappers[i] != null){
                if(rappers[i].microfone.material.equals("dourado")){
                    System.out.println(rappers[i].nome);
                }
            }
        }
    }
    // ganhador e perdedor
    void ranking(){
        float ganhador = -99999;
        float perdedor = 99999;



        for (int i = 0; i < rappers.length; i++){
            if (rappers[i] != null){
                if (rappers[i].nota > ganhador){
                    ganhador = rappers[i].nota;
                    maior = i;
                }
            }
        }

        for (int i = 0; i < rappers.length; i++){
            if (rappers[i] != null){
                if (rappers[i].nota < perdedor){
                    perdedor = rappers[i].nota;
                    menor = i;
                }
            }
        }

        System.out.println("Primeiro lugar: " + rappers[maior].nome);
        System.out.println("Ultimo lugar: " + rappers[menor].nome);
    }
}
