CREATE TABLE USUARIO(
    id PRIMARY KEY,
    username,
    password,
    email,
    nickname,
    phone
);
CREATE TABLE reserva(
    id PRIMARY KEY,
    username,
    schedule,
    reserve_date
);
CREATE TABLE instalacion(
    id PRIMARY KEY,
    nickname,
    description
);
CREATE TABLE horario(
    id PRIMARY KEY,
    start_time,
    end_time,
    sport_center
);