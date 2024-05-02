package com.canvia.pe.app.infraestructure.persistence.repository;

import com.canvia.pe.app.domain.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
