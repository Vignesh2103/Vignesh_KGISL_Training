SELECT floor_no, COUNT(floor_no) AS floor_wise_total
FROM company
GROUP BY floor_no;