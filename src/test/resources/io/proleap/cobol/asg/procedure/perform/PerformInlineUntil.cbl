 IDENTIFICATION DIVISION.
 PROGRAM-ID. PERFORMINLINEUNTIL.
 PROCEDURE DIVISION.
   PERFORM WITH TEST AFTER UNTIL 1=1 
     DISPLAY "Test" 
     STOP RUN
   END-PERFORM.