CREATE OR REPLACE PACKAGE AccountOperations AS
    PROCEDURE OpenAccount(accid IN NUMBER,custid IN NUMBER,acctype IN VARCHAR2,bal IN NUMBER);
    PROCEDURE CloseAccount(accid IN NUMBER);
    FUNCTION TotalBalance(custid IN NUMBER) RETURN NUMBER;
end;
/
CREATE OR REPLACE PACKAGE BODY AccountOperations AS
    PROCEDURE OpenAccount(accid IN NUMBER,custid IN NUMBER,acctype IN VARCHAR2,bal IN NUMBER)IS
    begin
        insert into Accounts(AccountID,CustomerID,AccountType,Balance,LastModified)values(accid,custid,acctype,bal,SYSDATE);
        COMMIT;
        dbms_output.put_line('Account Opened');
    end;
    PROCEDURE CloseAccount(accid IN NUMBER)IS
    begin
        delete from Accounts
        where AccountID=accid;
        COMMIT;
        dbms_output.put_line('Account Closed');
    end;
    FUNCTION TotalBalance( custid IN NUMBER) RETURN NUMBER IS
        bal NUMBER;
    begin
        select sum(Balance) into bal
        from Accounts
        where CustomerID=custid;
        RETURN bal;
    end;
end;
/
begin
    AccountOperations.OpenAccount(3,1,'Savings',10000);
    AccountOperations.CloseAccount(3);
end;
/
declare
    total NUMBER;
begin
    total:=AccountOperations.TotalBalance(1);
    dbms_output.put_line('Total Balance='||total);
end;
/