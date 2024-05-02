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
@Table(name = "student")
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    @Column(name = "paternal_surname")
    private String paternalSurname;
    @Column(name = "maternal_surname")
    private String maternalSurname;
    private Integer gender;
}
