-- Q2. �Ŵ����� KING �� ������� �̸��� ������ ����ϴ� SQL�� �ۼ�?
select employee.ename, employee.job from emp employee, emp manager
    where employee.mgr = manager.empno and manager.ename = 'KING';