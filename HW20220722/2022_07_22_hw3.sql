-- Q3. SCOTT�� ������ �ٹ������� �ٹ��ϴ� ����� �̸��� ����ϴ� SQL�� �ۼ�? DEPT LOC�� EMP ENAME
select e.ename from emp e, dept d where e.deptno = d.deptno 
    and d.loc = (select d.loc from emp e, dept d where e.deptno = d.deptno and e.ename = 'SCOTT');
    
-- �Ǵ� �μ���ȣ�� ������ ���� �ٹ������� �ٹ��ϹǷ� ���ξ��� �������������� �̷��� �ص� �� �� �����ϴ�
select ename from emp where deptno = (select deptno from emp where ename = 'SCOTT');