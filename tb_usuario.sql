-- Table: public.tb_usuario

-- DROP TABLE IF EXISTS public.tb_usuario;

CREATE TABLE IF NOT EXISTS public.tb_usuario
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    nombre_usuario character varying COLLATE pg_catalog."default",
    id_cargo integer,
    fecha_ingreso date DEFAULT now(),
    CONSTRAINT "TB_Usuario_pkey" PRIMARY KEY (id),
    CONSTRAINT "Cargo_Fk" FOREIGN KEY (id_cargo)
        REFERENCES public.tb_cargo (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.tb_usuario
    OWNER to postgres;
-- Index: fki_Cargo_Fk

-- DROP INDEX IF EXISTS public."fki_Cargo_Fk";

CREATE INDEX IF NOT EXISTS "fki_Cargo_Fk"
    ON public.tb_usuario USING btree
    (id_cargo ASC NULLS LAST)
    TABLESPACE pg_default;
-- Index: fki_cargo_fk

-- DROP INDEX IF EXISTS public.fki_cargo_fk;

CREATE INDEX IF NOT EXISTS fki_cargo_fk
    ON public.tb_usuario USING btree
    (id_cargo ASC NULLS LAST)
    TABLESPACE pg_default;