-- Q3. SCOTT과 동일한 근무지에서 근무하는 사원의 이름을 출력하는 SQL문 작성?
select e.ename from emp e, dept d where e.deptno = d.deptno 
    and d.loc = (select d.loc from emp e, dept d where e.deptno = d.deptno and e.ename = 'SCOTT');
    
-- 또는 부서번호가 같으면 같은 근무지에서 근무하므로 조인없이 서브쿼리만으로 이렇게 해도 될 것 같습니다
select ename from emp where deptno = (select deptno from emp where ename = 'SCOTT');
