-- ����2. ������̺�(EMP)���� MGR�÷���  ����  null �� �������� MGR�� ����  CEO ��  ����ϴ� SQL���� �ۼ� �ϼ���?
select empno, ename, job, nvl(TO_CHAR(mgr), 'CEO') as "MANAGER", sal, comm, deptno from emp;