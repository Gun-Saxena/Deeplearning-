CREATE OR REPLACE PROCEDURE TransferFunds(acc IN NUMBER,Toacc IN NUMBER,t IN NUMBER)IS
    bal NUMBER;
Begin
    select Balance into bal
    from Accounts
    where AccountID=acc;
    IF bal>=t THEN
        UPDATE Accounts
        SET Balance=Balance-t
        WHERE AccountID=acc;
        UPDATE Accounts
        SET Balance=Balance+t
        WHERE AccountID=Toacc;
        COMMIT;
        dbms_output.put_line('Funds transferred');
    ELSE
        dbms_output.put_line('Balance insufficient');
    END IF;
end;
/

Begin
    TransferFunds(1,2,200);
End;
/