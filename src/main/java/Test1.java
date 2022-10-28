/*
Tests work of custom written exceptions
 */
public class Test1 {

    public static void main(String[] args) throws MyExceptionClass {

        //Record params not filled in initialization
        try {
            PhoneBook pB = new PhoneBook(new Record(100, "+7913"));
        } catch (MyExceptionClass e) {
            System.out.println(e);
        }

        try {
            PhoneBook pB = new PhoneBook(new Record(100));
        } catch (MyExceptionClass e) {
            System.out.println(e);
        }

        //Record not valid exception in create new Record method
        try {
            PhoneBook pB = new PhoneBook();
            pB.createRecord(new Record(22, "+79137383620"));
        } catch (MyExceptionClass e) {
            System.out.println(e);
        }

        try {
            PhoneBook pB = new PhoneBook();
            pB.createRecord(new Record(22));
        } catch (MyExceptionClass e) {
            System.out.println(e);
        }

        //Phone number already exists Exception
        try {
            PhoneBook pB = new PhoneBook(new Record(1, "8913", "James Gosling"));
            pB.createRecord(new Record(2, "8913", "Bill Joy"));
        } catch (MyExceptionClass e) {
            System.out.println(e);
        }

        //Record Not Found Exception
        try {
            PhoneBook pB = new PhoneBook(new Record(1, "8913", "James Gosling"));
            pB.deleteRecord(2);
        } catch (MyUncheckedException e) {
            System.out.println(e);
        }

        try {
            PhoneBook pB = new PhoneBook(new Record(1, "8913", "James Gosling"));
            pB.updateRecord(new Record(2, "2", "Name"));
        } catch (MyUncheckedException e) {
            System.out.println(e);
        }
    }
}
