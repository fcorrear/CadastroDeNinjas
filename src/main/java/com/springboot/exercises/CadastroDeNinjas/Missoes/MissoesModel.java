package com.springboot.exercises.CadastroDeNinjas.Missoes;

import com.springboot.exercises.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private char rank;

    @OneToMany(mappedBy = "missoes") //Uma missão pode ter vários ninjas
    private List<NinjaModel> ninjas;

    public MissoesModel() {
    }

    public MissoesModel(String nome, char rank) {
        this.nome = nome;
        this.rank = rank;
    }


}
