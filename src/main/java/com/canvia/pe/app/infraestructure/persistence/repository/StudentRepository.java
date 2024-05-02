package com.canvia.pe.app.infraestructure.persistence.repository;

import com.canvia.pe.app.domain.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByCode(String code);
}
