-- Q2. 직급이 'SALESMAN'인 사원이 받는 급여들의 최대 급여보다 많이 받는 사원들의 이름과 급여를 출력하되 부서번호가 
--	20번인 사원은 제외한다.(ALL연산자 이용)

-- 1) 단일행 서브쿼리로 풀기
select ename, sal from emp where sal > (select max(sal) from emp where job = 'SALESMAN') and deptno <> 20;
-- 2) 다중행 서브쿼리로 풀기
select ename, sal from emp where sal > all (select sal from emp where job = 'SALESMAN') and deptno <> 20;