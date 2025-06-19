package com.springboot.exercises.CadastroDeNinjas.Ninjas;

import com.springboot.exercises.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

@Entity // Anotação que "transforma" essa classe em uma entidade do banco de dados
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id // Anotação que informa que o atributo id é pra ser tratado como tal automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Informa como é pra ser feita a atribuição de cada id
    private Long id;

    private String nome;
    private String email;
    private int idade;

    @ManyToOne //Indica para o Spring que um ninja tem uma única missão
    @JoinColumn(name = "id") //Foreign Key para acessar a tabela missões
    private MissoesModel missoes;

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
