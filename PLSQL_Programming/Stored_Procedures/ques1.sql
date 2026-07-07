CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest()IS
Begin
    UPDATE Accounts
    SET Balance=Balance+(Balance*1/100)
    WHERE AccountType='Savings';
    COMMIT;
    dbms_output.put_line('Interest processed');
End;
/

Begin
    ProcessMonthlyInterest;
End;
/