-- Q3. ������ 'SALESMAN'�� ����� �޴� �޿����� �ּ� �޿����� ���� �޴� ������� �̸��� �޿��� ����ϵ� �μ���ȣ�� 
--	20���� ����� �����Ѵ�.(ANY������ �̿�)

-- 1) ������ ���������� Ǯ��
select ename, sal from emp where sal > (select min(sal) from emp where job = 'SALESMAN') and deptno != 20;
-- 2) ������ ���������� Ǯ��
select ename, sal from emp where sal > any (select sal from emp where job = 'SALESMAN') and deptno != 20;