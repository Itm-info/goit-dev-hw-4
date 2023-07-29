SELECT project.id AS project_id, sum(worker.salary) * DATEDIFF(MONTH, project.start_date, project.finish_date) AS PRICE
FROM project, worker
JOIN project_worker ON worker.id = worker_id AND project.id = project_id
GROUP BY project.id
ORDER BY PRICE desc;