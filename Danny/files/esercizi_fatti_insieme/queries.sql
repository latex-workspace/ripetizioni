-- Seleziona i dipartimenti che si trovano nello stesso edificio del dipartimento di "Biology"
select * from department d
where d.building in (
  -- Seleziona gli edifici in cui si trova il dipartimento "Biology"
  select d.building from department d
  where d.dept_name = "Biology"
);

-- Seleziona l'ID dell'insegnante e il numero di corsi distinti che insegna
select i.id, count(distinct c.course_id) from instructor i, teaches t, course c
where i.id = t.id and 
t.course_id = c.course_id
group by i.id
having count(distinct c.course_id) = 1;

-- Seleziona tutti gli insegnanti e il numero di corsi che insegnano. Ordina secondo il numero di corsi descrescente
select i.id, count(distinct c.course_id) 
from 
instructor i left join teaches t  on i.id = t.id
left join course c on t.course_id = c.course_id
group by i.id
having count(distinct c.course_id) <= 1
order by count(distinct c.course_id) DESC;

-- Seleziona gli ID degli studenti non iscritti a nessun corso
select s.id
from student s left join takes t on s.ID = t.id
where t.ID IS NULL;

-- Seleziona i corsi che non sono insegnati da nessun insegnante
select *
from course c left join teaches t on c.course_id = t.course_id
where t.course_id is null;

-- Seleziona gli ID dei corsi che non sono insegnati da nessun insegnante
select c.course_id from course c
except
select t.course_id from teaches t;

-- Seleziona gli studenti il cui voto è superiore alla media dei voti degli altri studenti. Versione con join
select s1.id, s1.grade, avg(s2.grade) from studenti s1, studenti s2
group by s1.id
having s1.grade > avg(s2.grade);

-- Seleziona gli studenti il cui voto è superiore alla media dei voti degli altri studenti. Versione con subquery
select * from orders o 
where o.amount > (
  select avg(o1.amount) from orders o1
);

-- Seleziona gli studenti il cui voto è superiore alla media dei voti degli altri studenti. Versione con subquery
select * from studenti s
where s.grade > (
  select avg(s.grade) from studenti s
);
