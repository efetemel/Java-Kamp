
CREATE TABLE public.users
(
    id integer NOT NULL,
    email text COLLATE pg_catalog."default" NOT NULL,
    password text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT users_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.users
    OWNER to postgres;

CREATE TABLE public.employers
(
    -- Inherited from table public.users: id integer NOT NULL,
    -- Inherited from table public.users: email text COLLATE pg_catalog."default" NOT NULL,
    -- Inherited from table public.users: password text COLLATE pg_catalog."default" NOT NULL,
    company_name text COLLATE pg_catalog."default" NOT NULL,
    company_web_site text COLLATE pg_catalog."default" NOT NULL,
    company_phone_number text COLLATE pg_catalog."default" NOT NULL,
    is_email_verified boolean NOT NULL
)
    INHERITS (public.users)
TABLESPACE pg_default;

ALTER TABLE public.employers
    OWNER to postgres;

CREATE TABLE public.job_seekers
(
    -- Inherited from table public.users: id integer NOT NULL,
    -- Inherited from table public.users: email text COLLATE pg_catalog."default" NOT NULL,
    -- Inherited from table public.users: password text COLLATE pg_catalog."default" NOT NULL,
    first_name text COLLATE pg_catalog."default" NOT NULL,
    last_name text COLLATE pg_catalog."default" NOT NULL,
    identity_number text COLLATE pg_catalog."default" NOT NULL,
    date_of_birth date NOT NULL,
    is_email_verified boolean NOT NULL
)
    INHERITS (public.users)
TABLESPACE pg_default;

ALTER TABLE public.job_seekers
    OWNER to postgres;

CREATE TABLE public.system_personal
(
    -- Inherited from table public.users: id integer NOT NULL,
    -- Inherited from table public.users: email text COLLATE pg_catalog."default" NOT NULL,
    -- Inherited from table public.users: password text COLLATE pg_catalog."default" NOT NULL,
    job_name text COLLATE pg_catalog."default" NOT NULL
)
    INHERITS (public.users)
TABLESPACE pg_default;

ALTER TABLE public.system_personal
    OWNER to postgres;

CREATE TABLE public.job_list
(
    id integer NOT NULL,
    job_name text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT job_list_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.job_list
    OWNER to postgres;