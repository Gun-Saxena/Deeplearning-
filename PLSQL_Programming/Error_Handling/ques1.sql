CREATE OR REPLACE PROCEDURE SafeTransferFunds(p1_acc IN NUMBER,p2_acc IN NUMBER,t IN NUMBER)IS
    bal NUMBER;
Begin
    select Balance into bal from Accounts
    where AccountID=p1_acc;
    IF bal<t THEN
        RAISE_APPLICATION_ERROR(-20001,'Insufficient Funds');
    END IF;
    UPDATE Accounts
    SET Balance=Balance-t
    WHERE AccountID=p1_acc;
    UPDATE Accounts
    SET Balance=Balance+t
    WHERE AccountID=p2_acc;
    COMMIT;
    dbms_output.put_line(t||' funds transferred');
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        ROLLBACK;
        dbms_output.put_line('no account found');
    WHEN OTHERS THEN
        ROLLBACK;
        dbms_output.put_line('Error: '||SQLERRM);
END;
/

Begin
    SafeTransferFunds(1,2,500);
End;
/

