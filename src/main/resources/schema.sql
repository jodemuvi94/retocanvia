DROP TABLE IF EXISTS "note";
DROP TABLE IF EXISTS "student";

CREATE TABLE "student" (
    "id" SERIAL NOT NULL,
    "code" varchar(10) NOT NULL,
    "name" varchar(50) NOT NULL,
    "paternal_surname" varchar(50) NOT NULL,
    "maternal_surname" varchar(50) NOT NULL,
    "gender" int4 NOT NULL,
    PRIMARY KEY("id")
);

CREATE TABLE "note" (
    "id" SERIAL NOT NULL,
    "student_id" int4 NOT NULL,
    "description" varchar(50) NOT NULL,
    "note" numeric(4,2) NOT NULL,
    PRIMARY KEY("id")
);

ALTER TABLE note ADD FOREIGN KEY (student_id) REFERENCES student(id);

INSERT INTO "student" (code, name, paternal_surname, maternal_surname, gender)
    VALUES ('0020240001', 'JOSE DERLIN', 'MUÑOZ', 'VILLALOBOS', 1);
INSERT INTO "student" (code, name, paternal_surname, maternal_surname, gender)
    VALUES ('0020240002', 'ENITH', 'SANDOVAL', 'QUINTERO', 2);
INSERT INTO "student" (code, name, paternal_surname, maternal_surname, gender)
    VALUES ('0020240003', 'DENILSON', 'MUÑOZ', 'VILLALOBOS', 1);

INSERT INTO note (student_id, description, note)
    VALUES ((SELECT id FROM student WHERE code='0020240001'), 'Práctica 1', 13);
INSERT INTO note (student_id, description, note)
    VALUES ((SELECT id FROM student WHERE code='0020240001'), 'Práctica 2', 15);
INSERT INTO note (student_id, description, note)
    VALUES ((SELECT id FROM student WHERE code='0020240001'), 'Parcial 1', 14);
INSERT INTO note (student_id, description, note)
    VALUES ((SELECT id FROM student WHERE code='0020240001'), 'Parcial 2', 16);
INSERT INTO note (student_id, description, note)
    VALUES ((SELECT id FROM student WHERE code='0020240001'), 'Ex. Medio Curso', 18);
INSERT INTO note (student_id, description, note)
    VALUES ((SELECT id FROM student WHERE code='0020240001'), 'Ex. Final', 10);

INSERT INTO note (student_id, description, note)
    VALUES ((SELECT id FROM student WHERE code='0020240002'), 'Práctica 1', 5);
INSERT INTO note (student_id, description, note)
    VALUES ((SELECT id FROM student WHERE code='0020240002'), 'Práctica 2', 16);
INSERT INTO note (student_id, description, note)
    VALUES ((SELECT id FROM student WHERE code='0020240002'), 'Parcial 1', 11);
INSERT INTO note (student_id, description, note)
    VALUES ((SELECT id FROM student WHERE code='0020240002'), 'Parcial 2', 14.5);
INSERT INTO note (student_id, description, note)
    VALUES ((SELECT id FROM student WHERE code='0020240002'), 'Ex. Medio Curso', 19);
INSERT INTO note (student_id, description, note)
    VALUES ((SELECT id FROM student WHERE code='0020240002'), 'Ex. Final', 8);

INSERT INTO note (student_id, description, note)
    VALUES ((SELECT id FROM student WHERE code='0020240003'), 'Práctica 1', 2);
INSERT INTO note (student_id, description, note)
    VALUES ((SELECT id FROM student WHERE code='0020240003'), 'Práctica 2', 0);
INSERT INTO note (student_id, description, note)
    VALUES ((SELECT id FROM student WHERE code='0020240003'), 'Parcial 1', 20);
INSERT INTO note (student_id, description, note)
    VALUES ((SELECT id FROM student WHERE code='0020240003'), 'Parcial 2', 11);
INSERT INTO note (student_id, description, note)
    VALUES ((SELECT id FROM student WHERE code='0020240003'), 'Ex. Medio Curso', 17);
INSERT INTO note (student_id, description, note)
    VALUES ((SELECT id FROM student WHERE code='0020240003'), 'Ex. Final', 16);