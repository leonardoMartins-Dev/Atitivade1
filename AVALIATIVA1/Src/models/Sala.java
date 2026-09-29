package Src.models;

import java.util.ArrayList;

public class Sala {

    private int numero;
    private char bloco;
    private int capacidadeMax;
    private String tipo;
    private ArrayList<Atendimento> atendimentos;
    private Veterinario veterinario;


    public Sala(int numero, char bloco, int capacidadeMax, String tipo) {
        this.numero = numero;
        this.bloco = bloco;
        this.capacidadeMax = capacidadeMax;
        this.tipo = tipo;
    }

    public void addAtendimento(Atendimento atendimento){
        atendimentos.add(atendimento);
    }

    public void exibirAtendimentos(){
        for (Atendimento atendimento : atendimentos) {
            atendimento.exibir();
        }
    }

    public void exibirQtdAtendimentos(){
        int contador = 0;
        for (Atendimento atendimento : atendimentos) {
            contador+=1;
        }
        System.out.println("total de atendimentos nessa sala: "+ contador);
    }




    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public char getBloco() {
        return bloco;
    }
    public void setBloco(char bloco) {
        this.bloco = bloco;
    }
    public int getCapacidadeMax() {
        return capacidadeMax;
    }
    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }
    public void setAtendimentos(ArrayList<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }


    
}
