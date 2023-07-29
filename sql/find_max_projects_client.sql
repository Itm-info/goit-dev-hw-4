SELECT client.name AS CLIENT_NAME, count(project.id) AS PROJECT_COUNT
FROM project
JOIN client ON client.id=client_id
GROUP BY project.client_id
HAVING
    count(project.id) =
        SELECT max(project_count) FROM
        (
            SELECT client_id, count(id) AS project_count FROM project GROUP BY client_id
        );
