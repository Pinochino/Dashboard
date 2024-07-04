CREATE TABLE Movie (
    id SERIAL PRIMARY KEY,
    title VARCHAR(45),
    director VARCHAR(45),
    studio VARCHAR(40),
    movieCast VARCHAR(30),
    releaseYear INTEGER,
    poster VARCHAR(30)
);

CREATE TABLE Movie_Cast (
    id SERIAL PRIMARY KEY,
    movieId INTEGER REFERENCES Movie(id),
    movie_cast VARCHAR(45)
);
