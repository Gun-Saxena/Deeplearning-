BEGIN
    for l in(select LoanID, CustomerID, EndDate from Loans
    where EndDate between sysdate AND Sysdate+30)
    LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder:Loan ID '||l.LoanID||' for customerID '||l.CustomerID ||' is due on ' || TO_CHAR(l.EndDate,'DD-MON-YYYY'));
    END LOOP;
END;
/