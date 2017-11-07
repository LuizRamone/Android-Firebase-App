package com.example.luiz.firebaseapp;

/**
 * Created by Luiz on 31/10/2017.
 */

public class Produto {
    public String nome;
    public float valor;
    public String marca;

    public Produto() {

    }

    public String getnome(){
        return nome;
    }
    public void setNome( String nome){
        this.nome = nome;
    }
    public float getValor(){
        return valor;
    }
    public void setValor(float valor){
        this.valor = valor;
    }
    public String getMarca(){
        return marca;
    }
    public void Setmarca(String marca){
        this.marca = marca;
    }



}
