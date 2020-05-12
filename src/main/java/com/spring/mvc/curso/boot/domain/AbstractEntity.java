package com.spring.mvc.curso.boot.domain;

import java.io.Serializable;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
public class AbstractEntity <ID extends Serializable> implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private ID id;

	@Override
	public String toString() {
		return "id=" + id;
	}
	
	

}
