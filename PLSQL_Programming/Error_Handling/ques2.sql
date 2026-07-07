CREATE OR REPLACE PROCEDURE UpdateSalary(empid IN NUMBER,percent IN NUMBER)IS
Begin
    UPDATE Employees
    SET Salary=Salary+(Salary*percent/100)
    WHERE EmployeeID=empid;
    IF SQL%ROWCOUNT=0 THEN
        RAISE NO_DATA_FOUND;
    END IF;
    COMMIT;
    dbms_output.put_line('Salary updated');
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        ROLLBACK;
        dbms_output.put_line('Error! Employee ID does not exist');
    WHEN OTHERS THEN
        ROLLBACK;
        dbms_output.put_line('Error:'||SQLERRM);
END;
/

Begin
    UpdateSalary(1,10);
End;
/

