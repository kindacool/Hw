-- Q1. 사원 테이블(EMP)에서 가장 최근에 입사한 사원명을 출력 하는 SQL문을 작성 하세요?
select ename from emp where hiredate = (select max(hiredate) from emp) ;