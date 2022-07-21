-- Q2. 사원 테이블(EMP)에서 최대 급여를 받는 사원명과 최대급여 금액을 출력하는 SQL문을 작성 하세요?
select ename, sal from emp where sal = (select max(sal) from emp);