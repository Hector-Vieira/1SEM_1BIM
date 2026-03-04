/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeira.aula.poo.model;

/**
 *
 * @author hector80605
 */
public class Professor {
    private String nome;
          
    private Integer idade;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome; 
    }
    
    public void setIdade(Integer idade){
        this.idade = idade;
    }
    
    public Integer getIdade(){
        return this.idade;
    }
}
