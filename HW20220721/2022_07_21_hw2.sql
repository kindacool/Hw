-- Q2. ��� ���̺�(EMP)���� �ִ� �޿��� �޴� ������ �ִ�޿� �ݾ��� ����ϴ� SQL���� �ۼ� �ϼ���?
select ename, sal from emp where sal = (select max(sal) from emp);