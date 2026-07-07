Declare
    age number;

Begin
    for c in(select CustomerID,DOB from Customers)
LOOP
    age:=FLOOR(MONTHS_BETWEEN(SYSDATE,c.DOB)/12);
    IF age>60 THEN
        UPDATE Loans
        SET InterestRate=InterestRate-1
        WHERE CustomerID=c.CustomerID;
        dbms_output.put_line('discount applied-'|| c.CustomerID);
    END IF;
END LOOP;
COMMIT;
END;
/