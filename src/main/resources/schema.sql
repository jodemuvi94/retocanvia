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

INSERT INTO "student" (code, name, paternal_surname, maternal_surname, gender)
    VALUES ('0020240001', 'JOSE DERLIN', 'MUÑOZ', 'VILLALOBOS', 1);
INSERT INTO "student" (code, name, paternal_surname, maternal_surname, gender)
VALUES ('0020240002', 'ENITH', 'SANDOVAL', 'QUINTERO', 2);
INSERT INTO "student" (code, name, paternal_surname, maternal_surname, gender)
VALUES ('0020240003', 'DENILSON', 'MUÑOZ', 'VILLALOBOS', 1);