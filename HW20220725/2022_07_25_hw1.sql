-- Q1. SMITH�� ������ ������ ���� ����� �̸��� ������ ����ϴ� SQL���� �ۼ� �ϼ���?
select ename, job from emp where job = (select job from emp where ename = 'SMITH');