/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeira.aula.poo;

/**
 *
 * @author hector80605
 */        
import com.mycompany.primeira.aula.poo.model.Professor;
public class PrimeiraAulaPoo {

    public static void main(String[] args) {
        Aluno  aluno = new Aluno();
        aluno.cpf = "alkalk";
        aluno.idade = 12;
        aluno.ra = "lajlkjsa";
        aluno.nome = "fulano";
        aluno.telefone = "kalkas";
        System.out.println("Nome do aluno é " + aluno.nome);
        
        Professor professor = new Professor();
        professor.setNome("Andeson");          
         System.out.println("O nome do professor é " + professor.getNome());
    }
}
