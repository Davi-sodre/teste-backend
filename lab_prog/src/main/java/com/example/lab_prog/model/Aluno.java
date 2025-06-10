package com.example.lab_prog.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aluno")  // referencia ao nome da tabela
    private int id;
    

    // caso o nome da tabela e do campo sejam iguais, não é necessário fazer a chamada @Column pois o @Entity resolve

    private int matricula;
    private String nome;
    // se o cpf for diferente * fazer o mapeamento forçado não causa problema
    @Column(name = "cpf_aluno")
    private long cpf;

}
