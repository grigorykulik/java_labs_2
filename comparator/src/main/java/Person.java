public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    @Override
    public int compareTo(@org.jetbrains.annotations.NotNull Person o) {
        int result=this.lastName.compareTo(o.getLastName());

        if (result==0) {
            result=this.firstName.compareTo(o.getFirstName());
        }

        return result;
    }

    @Override
    public String toString() {
        return this.lastName + " " + this.firstName + " " + this.age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
