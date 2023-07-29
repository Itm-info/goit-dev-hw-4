SELECT 'YOUNGEST' as TYPE, name, birthday FROM worker
WHERE
    birthday  =
    (
        SELECT max(birthday) FROM worker
    )
UNION ALL
SELECT 'ELDEST' as TYPE, name, birthday FROM worker
WHERE
    birthday  =
    (
        SELECT min(birthday) FROM worker
    )
;