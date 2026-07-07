CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT
ON Transactions
FOR EACH ROW
DECLARE
    bal NUMBER;
Begin
    select Balance into bal from Accounts
    where AccountID=:NEW.AccountID;
    IF:NEW.TransactionType='Withdrawal' THEN
        IF:NEW.Amount>bal THEN
            RAISE_APPLICATION_ERROR(-20003,'Insufficient Balance');
        END IF;
    END IF;
    IF:NEW.TransactionType='Deposit' THEN
        IF:NEW.Amount<=0 THEN
            RAISE_APPLICATION_ERROR(-20004,'Deposit must be positive');
        END IF;
    END IF;
End;
/