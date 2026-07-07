Declare
    CURSOR ApplyAnnualFee IS
        select AccountID,Balance from Accounts
        FOR UPDATE;
    rec ApplyAnnualFee%ROWTYPE;
Begin
    OPEN ApplyAnnualFee;
    LOOP
        FETCH ApplyAnnualFee INTO rec;
        EXIT WHEN ApplyAnnualFee%NOTFOUND;
        UPDATE Accounts
        SET Balance=Balance-1000
        WHERE CURRENT OF ApplyAnnualFee;
    END LOOP;
    CLOSE ApplyAnnualFee;
    COMMIT;
    dbms_output.put_line('Annual Fee Applied');
End;
/