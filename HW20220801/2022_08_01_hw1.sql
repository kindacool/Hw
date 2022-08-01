-- Q1. ��� ���̺��� ������� �˻��Ͽ� ����� ������ ���ؿ��� ���� ���ν����� ���� �����ϼ���

-- ���ν��� ����
create or replace procedure job_ename (
    vename in emp.ename%type,
    vjob out emp.job%type)
is
begin
    select job into vjob from emp
    where ename = vename;
end;

-- ���ε� �Լ� ����
variable var_job varchar2(10);

-- ���ν��� ����
execute job_ename('SCOTT', :var_job);

-- ���
print var_job;