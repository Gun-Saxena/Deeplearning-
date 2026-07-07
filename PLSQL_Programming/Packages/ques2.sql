CREATE OR REPLACE PACKAGE EmployeeManagement AS 
    PROCEDURE HireEmployee(empid IN NUMBER,ename IN VARCHAR2,pos IN VARCHAR2,sal IN NUMBER,dep IN VARCHAR2,hdate IN DATE);
    PROCEDURE UpdateEmployee(empid IN NUMBER,sal IN NUMBER);
    FUNCTION AnnualSalary(empid IN NUMBER) RETURN NUMBER;
end;
/
CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS
    PROCEDURE HireEmployee(empid IN NUMBER,ename IN VARCHAR2,pos IN VARCHAR2,sal IN NUMBER,dep IN VARCHAR2,hdate IN DATE)IS
    begin
        insert into Employees values (empid,ename,pos,sal,dep,hdate);
        COMMIT;
        dbms_output.put_line('Employee Hired');
    end;
    PROCEDURE UpdateEmployee(empid IN NUMBER,sal IN NUMBER)IS
    begin
        update Employees
        SET Salary=sal
        WHERE EmployeeID=empid;
        COMMIT;
        dbms_output.put_line('Employee Updated');
    end;
    FUNCTION AnnualSalary(empid IN NUMBER) RETURN NUMBER IS
        sal NUMBER;
    begin
        select Salary into sal
        from Employees
        where EmployeeID=empid;
        return sal*12;
    end;
end;
/
begin
    EmployeeManagement.HireEmployee(3,'Rahul','Developer',50000,'IT',SYSDATE);
    EmployeeManagement.UpdateEmployee(3,55000);
end;
/
Declare
    annual NUMBER;
begin
    annual:=EmployeeManagement.AnnualSalary(3);
    dbms_output.put_line('Annual Salary='||annual);
end;
/