-- Last updated: 6/13/2026, 12:11:47 AM
SELECT score,
DENSE_RANK()
OVER(ORDER BY score DESC) as "rank"

from Scores;
