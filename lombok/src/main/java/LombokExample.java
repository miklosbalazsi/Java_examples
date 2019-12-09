import lombok.*;

import java.util.List;


@ToString(callSuper=true,exclude="someExcludedField")
public class LombokExample {

    @Getter @Setter private boolean employed = true;
    @Setter(AccessLevel.PROTECTED) private String name;

    @Getter @Setter @NonNull private List<Person> members;

    private float someExcludedField;

    public void main(String[] args) {
        Boolean em = this.isEmployed();   // lombok Boolean Getter
        this.setEmployed(false);

        this.setName("FooBar");   // lombok setter for String

        this.setMembers();   //NullPointerException

        System.out.println( this.toString() ); // Will print all properties as key-value, except "someExcludedField"


    }

}
