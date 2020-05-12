package com.spring.mvc.boot.domain;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "ENDERECO")
public class Endereco extends AbstractEntity<Long> {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String logradouro;
	
	@Column(nullable = false)
	private String bairro;
	
	@Column(nullable = false)
	private String cidade;
	
	@Column(nullable = false, length = 2)
	@Enumerated(EnumType.STRING)
	private UF uf;
	
	@Column(nullable = false, length = 9)
	private String cep;
	
	@Column(nullable = false, length = 5)
	private Integer numero;
	
	private String complemento;

}
