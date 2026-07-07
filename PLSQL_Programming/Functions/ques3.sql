CREATE OR REPLACE FUNCTION HasSufficientBalance(acc_id IN NUMBER,amt IN NUMBER) RETURN BOOLEAN IS
    bal NUMBER;
Begin
    select Balance into bal from Accounts 
    where AccountID=acc_id;
    IF bal>=amt THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;
End;
/

Declare
    acc_id NUMBER;
    amt NUMBER;
    res BOOLEAN;
Begin
    acc_id:=&account_id;
    amt:=&amount;
    res:=HasSufficientBalance(acc_id,amt);
    IF res THEN
        dbms_output.put_line('Sufficient Balance');
    ELSE
        dbms_output.put_line('Insufficient Balance');
    END IF;
End;
/