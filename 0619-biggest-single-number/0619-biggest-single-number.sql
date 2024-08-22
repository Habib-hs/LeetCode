# Write your MySQL query statement below
SELECT MAX(num) AS num  -- Find the maximum number from the results
FROM (
    SELECT num           -- Subquery to select numbers
    FROM MyNumbers
    GROUP BY num         -- Group by number
    HAVING COUNT(num) = 1  -- Filter to include only numbers that appear exactly once
) AS unique_numbers;    -- Alias for the derived table
