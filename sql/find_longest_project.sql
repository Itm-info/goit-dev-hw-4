SELECT id, DATEDIFF(MONTH, start_date, finish_date) AS MONTH_COUNT
FROM project
WHERE
    finish_date - start_date =
        SELECT max(finish_date - start_date) FROM project;