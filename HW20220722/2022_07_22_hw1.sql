-- Q1. ������ MANAGER�� ����� �̸�, �μ����� ����ϴ� SQL���� �ۼ� �ϼ���? (JOIN�� ����Ͽ� ó��)
select e.ename, d.dname from emp e, dept d 
    where e.deptno = d.deptno and e.job = 'MANAGER'; 