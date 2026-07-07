CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(ln_amt IN NUMBER,rate IN NUMBER,yr IN NUMBER) RETURN NUMBER IS
    mon_install NUMBER;
Begin
    mon_install:=(ln_amt+(ln_amt*rate*yr/100))/(yr*12);
    RETURN mon_install;
End;
/

Declare
    ln_amt NUMBER;
    rate NUMBER;
    yr NUMBER;
    install NUMBER;
Begin
    ln_amt:=&ln_amt;
    rate:=&rate;
    yr:=&yr;
    install:=CalculateMonthlyInstallment(ln_amt,rate,yr);
    dbms_output.put_line('Monthly Installment='|| install);
End;
/