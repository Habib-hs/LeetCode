# Write your MySQL query statement below
SELECT 
    P.product_id AS product_id, 
    IFNULL(ROUND((Sum(U.units*P.price * 1.0)) / (SUM(U.units)), 2), 0) AS average_price
FROM 
    Prices P
LEFT JOIN 
    UnitsSold U ON P.product_id = U.product_id and
    purchase_date BETWEEN start_date AND end_date
GROUP BY 
    P.product_id;
