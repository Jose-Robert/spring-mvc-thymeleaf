package com.spring.mvc.boot.domain;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long>{

	private static final long serialVersionUID = 1L;

	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_departamento_fk")
	private Departamento departamento;
	
	@OneToMany(mappedBy = "cargo")
	private List<Funcionario> funcionarios;
}
