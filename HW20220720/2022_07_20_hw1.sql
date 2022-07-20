-- 과제1. 사원테이블(EMP)에서 입사일(HIREDATE)을 4자리 연도로 출력 되도록 SQL문을 작성하세요? (ex. 1980/01/01)
select empno, ename, job, mgr, TO_CHAR(hiredate,'YYYY/MM/DD'), sal, comm, deptno from emp;