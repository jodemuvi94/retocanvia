package com.canvia.pe.app.infraestructure.persistence.repository;

import com.canvia.pe.app.domain.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

    @Query("SELECT AVG(n.note) FROM Note n WHERE n.studentId.id=:studentId")
    Double getAvg(@Param("studentId") Long studentId);
}
