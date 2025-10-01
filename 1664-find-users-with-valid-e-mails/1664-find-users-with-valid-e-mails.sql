# Write your MySQL query statement below
SELECT 
    user_id, 
    name, 
    mail
FROM 
    Users
WHERE 
    mail REGEXP '^[a-zA-Z][a-zA-Z0-9._-]*@leetcode\\.com$'
    AND RIGHT(mail, 13) COLLATE utf8mb3_bin = '@leetcode.com';
