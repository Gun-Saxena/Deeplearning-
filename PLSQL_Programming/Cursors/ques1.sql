Declare
    CURSOR GenerateMonthlyStatements IS
        select c.CustomerID,c.Name,t.TransactionID,t.TransactionDate,t.Amount,t.TransactionType
        from Customers c
        join Accounts a on c.CustomerID=a.CustomerID
        join Transactions t on a.AccountID=t.AccountID
        where EXTRACT(month from t.TransactionDate)=EXTRACT(month from sysdate)
        and EXTRACT(year from t.TransactionDate)=EXTRACT(year from sysdate);
    rec GenerateMonthlyStatements%ROWTYPE;
Begin
    OPEN GenerateMonthlyStatements;
    LOOP
        FETCH GenerateMonthlyStatements INTO rec;
        EXIT WHEN GenerateMonthlyStatements%NOTFOUND;
        dbms_output.put_line('Customer ID '||rec.CustomerID||',Name '||rec.Name||',Transaction ID '||rec.TransactionID||',Amount '||rec.Amount||',Type '||rec.TransactionType);
    END LOOP;
    CLOSE GenerateMonthlyStatements;
END;
/