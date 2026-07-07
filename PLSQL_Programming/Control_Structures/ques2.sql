ALTER TABLE Customers ADD IsVIP VARCHAR(5);

Declare
Begin
    for c in(select CustomerID,Balance from Customers)
    LOOP
        IF c.Balance>10000 THEN
            UPDATE Customers
            SET IsVIP='True'
            WHERE CustomerID=c.CustomerID;
            dbms_output.put_line(c.CustomerID||' promoted to VIP');
        ELSE
            UPDATE Customers
            SET IsVIP='False'
            WHERE CustomerID=c.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
/