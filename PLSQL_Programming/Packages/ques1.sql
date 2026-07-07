CREATE OR REPLACE PACKAGE CustomerManagement AS 
    PROCEDURE AddNewCustomer(id IN NUMBER,name IN VARCHAR2,dob IN DATE,bal IN NUMBER);
    PROCEDURE UpdateCustomer(id IN NUMBER,name IN VARCHAR2);
    FUNCTION GetCustomerBalance(id IN NUMBER) RETURN NUMBER;
End;
/
CREATE OR REPLACE PACKAGE BODY CustomerManagement AS PROCEDURE AddNewCustomer(id IN NUMBER,name IN VARCHAR2,dob IN DATE,bal IN NUMBER)IS
    Begin
        insert into Customers values(id,name,dob,bal,SYSDATE);
        COMMIT;
        dbms_output.put_line('Customer Added');
    End;
    PROCEDURE UpdateCustomer(id IN NUMBER,name IN VARCHAR2)IS
    Begin
        UPDATE Customers
        SET Name=name
        WHERE CustomerID=id;
        COMMIT;
        dbms_output.put_line('Customer Updated');
    End;
    FUNCTION GetCustomerBalance(id IN NUMBER) RETURN NUMBER IS
        bal NUMBER;
    Begin
        select Balance into bal from Customers
        where CustomerID=id;
        return bal;
    End;
End;
/
Begin
    CustomerManagement.AddNewCustomer(3,'Chunnu',TO_DATE('2000-08-15','YYYY-MM-DD'),15000);
    CustomerManagement.UpdateCustomer(3,'Chunnu Sharma');
End;
/
declare
    bal NUMBER;
begin
    bal:=CustomerManagement.GetCustomerBalance(3);
    dbms_output.put_line('Balance='||bal);
end;
/