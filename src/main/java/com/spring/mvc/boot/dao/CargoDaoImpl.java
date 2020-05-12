package com.spring.mvc.boot.dao;

import org.springframework.stereotype.Repository;

import com.spring.mvc.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao{

}
