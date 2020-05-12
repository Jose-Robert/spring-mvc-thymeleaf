package com.spring.mvc.boot.dao;

import org.springframework.stereotype.Repository;

import com.spring.mvc.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
