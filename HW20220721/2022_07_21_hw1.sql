-- Q1. ��� ���̺�(EMP)���� ���� �ֱٿ� �Ի��� ������� ��� �ϴ� SQL���� �ۼ� �ϼ���?
select ename from emp where hiredate = (select max(hiredate) from emp) ;