CREATE OR REPLACE TRIGGER UpdateCustomerLastModified
BEFORE UPDATE
ON Customers
FOR EACH ROW
Begin
    :NEW.LastModified:=SYSDATE;
End;
/