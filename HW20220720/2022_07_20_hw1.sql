-- ����1. ������̺�(EMP)���� �Ի���(HIREDATE)�� 4�ڸ� ������ ��� �ǵ��� SQL���� �ۼ��ϼ���? (ex. 1980/01/01)
select empno, ename, job, mgr, TO_CHAR(hiredate,'YYYY/MM/DD'), sal, comm, deptno from emp;