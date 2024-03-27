package org.example;

public class Rapper {
    // variaveis para rappers
    String nome;
    float nota;
    int idade;
    // instancia microfone
    Microfone microfone;
    // construtor para rappers
    public Rapper(String nome, float nota, int idade, Microfone microfone) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
        this.microfone = microfone;
    }
    // mostra info dos rappers
    void mostraInfo(){
        System.out.println("Rapper: " + this.nome);
        System.out.println("Nota: " + this.nota);
        System.out.println("Cor do microfone: " + microfone.material);
    }
}
