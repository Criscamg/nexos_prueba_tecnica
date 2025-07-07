-- Table: public.tb_cargo

-- DROP TABLE IF EXISTS public.tb_cargo;

CREATE TABLE IF NOT EXISTS public.tb_cargo
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    nombre_cargo character varying COLLATE pg_catalog."default",
    CONSTRAINT "TB_Cargo_pkey" PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.tb_cargo
    OWNER to postgres;