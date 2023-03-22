package com.query.exemploswagger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.query.exemploswagger.model.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Integer>{
	List<Employe> findByDataValueGreaterThanEqual(double dataValue);
}
