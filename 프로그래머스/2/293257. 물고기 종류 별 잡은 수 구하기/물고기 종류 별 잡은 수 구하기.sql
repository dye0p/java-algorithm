select count(fn.FISH_NAME) as FISH_COUNT,
fn.FISH_NAME as FISH_NAME
from FISH_NAME_INFO fn
join FISH_INFO fi on fn.FISH_TYPE = fi.FISH_TYPE
group by fn.FISH_NAME
order by FISH_COUNT DESC

