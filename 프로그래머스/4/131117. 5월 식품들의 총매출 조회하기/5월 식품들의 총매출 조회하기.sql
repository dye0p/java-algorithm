SELECT p.PRODUCT_ID, p.PRODUCT_NAME, sum(o.amount) * p.price as TOTAL_SALES
from FOOD_PRODUCT p
join FOOD_ORDER o on p.PRODUCT_ID = o.PRODUCT_ID
where o.PRODUCE_DATE like '%2022-05-%'
group by o.product_id
order by TOTAL_SALES DESC, o.product_id