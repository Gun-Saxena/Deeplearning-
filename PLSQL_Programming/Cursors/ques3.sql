Declare
    CURSOR UpdateLoanInterestRates IS
        select LoanID,InterestRate from Loans
        for update;
    rec UpdateLoanInterestRates%ROWTYPE;
Begin
    OPEN UpdateLoanInterestRates;
    LOOP
        FETCH UpdateLoanInterestRates INTO rec;
        EXIT WHEN UpdateLoanInterestRates%NOTFOUND;
        UPDATE Loans
        SET InterestRate=InterestRate+1
        WHERE CURRENT OF UpdateLoanInterestRates;
    END LOOP;
    CLOSE UpdateLoanInterestRates;
    COMMIT;
    dbms_output.put_line('Interest Rates Updated');
End;
/