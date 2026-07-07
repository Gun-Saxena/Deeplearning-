CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(dep IN VARCHAR2,bonus IN NUMBER)IS
Begin
    UPDATE Employees
    SET Salary=Salary+(Salary*bonus/100)
    WHERE Department=dep;
    COMMIT;
    dbms_output.put_line('updated');
End;
/

Begin
    UpdateEmployeeBonus('IT',100);
End;
/