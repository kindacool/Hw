-- 과제2. 사원테이블(EMP)에서 MGR컬럼의  값이  null 인 데이터의 MGR의 값을  CEO 로  출력하는 SQL문을 작성 하세요?
select empno, ename, job, nvl(TO_CHAR(mgr), 'CEO') as "MANAGER", sal, comm, deptno from emp;