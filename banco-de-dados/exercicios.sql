USE movies_db;

# Mostrar o nome e sobrenome dos atores cuja classificação é superior a 7.5
SELECT first_name, last_name
FROM actors
WHERE rating > 7.5;

# Mostrar o título, a classificação e os prêmios dos filmes cujo rating seja superior a 7.5 e tenha mais de 2 prêmios
SELECT title, rating, awards
FROM movies
WHERE rating > 7.5
AND awards > 2;

# Mostrar o título e a classificação dos filmes ordenados por classificação em ordem crescente
SELECT title, rating
FROM movies
ORDER BY rating ASC;

# Mostrar o título dos 3 primeiros filmes do banco de dados
SELECT title
FROM movies
LIMIT 3;

# Mostrar o título e a classificação dos filmes cujo title contenha "Toy Story"
SELECT title, rating
FROM movies
WHERE title
LIKE "%toy story%";

# Mostrar todos os atores cujo nome começa com Sam
SELECT first_name, last_name
FROM actors
WHERE first_name
LIKE "Sam%";

# Mostrar o título dos filmes que foram lançados entre 2004 e 2008
SELECT title, release_date
FROM movies
WHERE year(release_date)
BETWEEN 2004 AND 2008;

# Mostrar o título dos filmes com classificação superior a 3
# que tenha mais de 1 prêmio e que tenha sido lançado entre 1988 e 2009
# ordenados por classificação
SELECT title
FROM movies
WHERE rating > 3
AND awards > 1
AND year(release_date) BETWEEN 1988 AND 2009
ORDER BY rating ASC;

# Qual a média de notas dos atores?
SELECT ROUND(AVG(rating), 2) AS "Rating Avarage" FROM actors;

# Mostrar a quantidade de episodios que cada ator participou
SELECT actor_id, COUNT(episode_id)
FROM actor_episode
GROUP BY actor_id;

