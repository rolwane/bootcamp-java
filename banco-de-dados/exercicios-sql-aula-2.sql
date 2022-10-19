USE movies_db;

# Quantas temporadas estão cadastradas
SELECT COUNT(id) FROM seasons;

# Quantas temporadas existem para cada série
SELECT series.title, COUNT(seasons.id)
FROM series
INNER JOIN seasons ON series.id = seasons.serie_id
GROUP BY series.id;

# Quantas temporadas existem para a série "The Walking Dead"
SELECT series.title, COUNT(seasons.id)
FROM series
INNER JOIN seasons ON series.id = seasons.serie_id
WHERE series.title = "The Walking Dead"
GROUP BY series.id;

# Quais séries têm mais de 5 temporadas
SELECT series.title, COUNT(seasons.id) AS qnt_seasons
FROM series
INNER JOIN seasons ON series.id = seasons.serie_id
GROUP BY series.id
HAVING qnt_seasons > 5;

# Quais as 3 séries com maior numero de temporadas
SELECT series.title, COUNT(seasons.id) AS qnt_seasons
FROM series
INNER JOIN seasons ON series.id = seasons.serie_id
GROUP BY series.id
ORDER BY qnt_seasons DESC
LIMIT 3;

# Quais os nomes do atores que trabalham em filmes com avaliação maior que 9.1
SELECT ac.first_name, ac.last_name
FROM actors AS ac
WHERE ac.id IN (SELECT am.actor_id FROM actor_movie AS am
WHERE am.movie_id IN (SELECT mv.id FROM movies AS mv WHERE mv.rating > 9.1));
