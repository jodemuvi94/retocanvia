package com.canvia.pe.app.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Table(name = "note")
public class Note implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Double note;

    @JoinColumn(name = "studentId", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Student studentId;
}
