import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*
Class of Records for filling the PhoneBook
 */
public class Record {
    long id;
    String phoneNumber;
    String Name;

    Record(long id, String phoneNumber, String Name) throws MyExceptionClass {

            this.id = id;
            this.phoneNumber = phoneNumber;
            this.Name = Name;

    }

    /*
    I dont know how to check that arguments are given to constructor,
    So made extra 3 constructors for this case
     */
    Record() throws MyExceptionClass{
        throw new MyExceptionClass("Record not valid");
    }

    Record(long id) throws MyExceptionClass{
        throw new MyExceptionClass("Record not valid");
    }

    Record(long id, String pn) throws MyExceptionClass{
        throw new MyExceptionClass("Record not valid");
    }

    //Getter
    public String recordInfo(){
        ArrayList<String> info = new ArrayList<>();
        info.add(Long.toString(id));
        info.add(phoneNumber);
        info.add(Name);
        return info.toString();

    }
}



