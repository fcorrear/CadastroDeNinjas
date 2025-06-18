package com.springboot.exercises.CadastroDeNinjas;

import jakarta.persistence.*;

@Entity // Anotação que "transforma" essa classe em uma entidade do banco de dados
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id // Anotação que informa que o atributo id é pra ser tratado como tal automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Informa como é pra ser feita a atribuição de cada id
    private Long id;

    private String nome;
    private String email;
    private int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
