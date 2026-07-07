CREATE OR REPLACE PROCEDURE AddNewCustomer(custid IN NUMBER,name IN VARCHAR2,dob IN DATE,bal IN NUMBER)IS
    cnt NUMBER;
Begin
    select COUNT(*) into cnt from Customers
    where CustomerID=custid;
    IF cnt>0 THEN
        RAISE_APPLICATION_ERROR(-20002,'Customer ID exists');
    END IF;
    insert into Customers(CustomerID,Name,DOB,Balance,LastModified)values(custid,name,dob,bal,SYSDATE);
    COMMIT;
    dbms_output.put_line('Customer added');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        dbms_output.put_line('Error:'||SQLERRM);
END;
/

Begin
    AddNewCustomer(3,'Rinky Sharma',TO_DATE('1998-08-15','YYYY-MM-DD'),12000);
End;
/

