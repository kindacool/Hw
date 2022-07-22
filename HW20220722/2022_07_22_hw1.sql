-- Q1. 직급이 MANAGER인 사원의 이름, 부서명을 출력하는 SQL문을 작성 하세요? (JOIN을 사용하여 처리)
select e.ename, d.dname from emp e, dept d 
    where e.deptno = d.deptno and e.job = 'MANAGER'; 