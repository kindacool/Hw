-- Q2. 매니저가 KING 인 사원들의 이름과 직급을 출력하는 SQL문 작성?
select employee.ename, employee.job from emp employee, emp manager
    where employee.mgr = manager.empno and manager.ename = 'KING';