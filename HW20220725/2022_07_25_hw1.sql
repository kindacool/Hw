-- Q1. SMITH와 동일한 직급을 가진 사원의 이름과 직급을 출력하는 SQL문을 작성 하세요?
select ename, job from emp where job = (select job from emp where ename = 'SMITH');