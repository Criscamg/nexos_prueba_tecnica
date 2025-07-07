-- Table: public.tb_mercancia

-- DROP TABLE IF EXISTS public.tb_mercancia;

CREATE TABLE IF NOT EXISTS public.tb_mercancia
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    nombre_mercancia character varying COLLATE pg_catalog."default" NOT NULL,
    cantidad integer NOT NULL,
    fecha_registro date DEFAULT now(),
    usuario_id_registro integer NOT NULL,
    usuario_id_modificacion integer,
    fecha_modificacion date,
    CONSTRAINT "TB_Mercancia_pkey" PRIMARY KEY (id),
    CONSTRAINT "Uk_nombre" UNIQUE (nombre_mercancia),
    CONSTRAINT "Usuario_Fk" FOREIGN KEY (usuario_id_registro)
        REFERENCES public.tb_usuario (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT usuario_modificacion_fk FOREIGN KEY (usuario_id_modificacion)
        REFERENCES public.tb_usuario (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.tb_mercancia
    OWNER to postgres;
-- Index: fki_usuario_modificacion_fk

-- DROP INDEX IF EXISTS public.fki_usuario_modificacion_fk;

CREATE INDEX IF NOT EXISTS fki_usuario_modificacion_fk
    ON public.tb_mercancia USING btree
    (usuario_id_modificacion ASC NULLS LAST)
    TABLESPACE pg_default;