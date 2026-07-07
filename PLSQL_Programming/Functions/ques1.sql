CREATE OR REPLACE FUNCTION CalculateAge(dob IN DATE) RETURN NUMBER IS
    age NUMBER;
Begin
    age:=floor(MONTHS_BETWEEN(SYSDATE,dob)/12);
    RETURN age;
End;
/

Declare
    dob DATE;
    age NUMBER;
Begin
    dob:=TO_DATE('&enter dob','YYYY-MM-DD');
    age:=CalculateAge(dob);
    dbms_output.put_line('Age=' ||age);
End;
/