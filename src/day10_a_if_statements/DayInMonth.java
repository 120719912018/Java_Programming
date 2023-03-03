package day10_a_if_statements;

public class DayInMonth {


    public static void main(String[] args) {

        int monthNumber=13;
          boolean has31days= monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 ||
                  monthNumber == 8 ||  monthNumber == 10 || monthNumber == 12;

        boolean has30days= monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 ||
                monthNumber == 8 ||  monthNumber == 10 || monthNumber == 12;

        boolean has28days= monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 ||
                monthNumber == 8 ||  monthNumber == 10 || monthNumber == 12;




    }
}
