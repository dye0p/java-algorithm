SELECT m.MEMBER_NAME, r.REVIEW_TEXT, DATE_FORMAT(r.review_date, '%Y-%m-%d') as REVIEW_DATE
from MEMBER_PROFILE m
join REST_REVIEW r on m.MEMBER_ID = r.MEMBER_ID
where m.member_id = (select member_id
                     from REST_REVIEW
                     group by member_id
                     order by count(member_id) DESC limit 1
                    )
                    
order by REVIEW_DATE, r.review_text                     
                     
                    
                     