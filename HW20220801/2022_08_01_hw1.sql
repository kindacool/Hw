-- Q1. 사원 테이블에서 사원명을 검색하여 사원의 직급을 구해오는 저장 프로시저를 만들어서 실행하세요

-- 프로시저 생성
create or replace procedure job_ename (
    vename in emp.ename%type,
    vjob out emp.job%type)
is
begin
    select job into vjob from emp
    where ename = vename;
end;

-- 바인드 함수 생성
variable var_job varchar2(10);

-- 프로시저 실행
execute job_ename('SCOTT', :var_job);

-- 출력
print var_job;