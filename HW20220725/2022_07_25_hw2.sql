-- Q2. ������ 'SALESMAN'�� ����� �޴� �޿����� �ִ� �޿����� ���� �޴� ������� �̸��� �޿��� ����ϵ� �μ���ȣ�� 
--	20���� ����� �����Ѵ�.(ALL������ �̿�)

-- 1) ������ ���������� Ǯ��
select ename, sal from emp where sal > (select max(sal) from emp where job = 'SALESMAN') and deptno <> 20;
-- 2) ������ ���������� Ǯ��
select ename, sal from emp where sal > all (select sal from emp where job = 'SALESMAN') and deptno <> 20;