package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) throws IllegalArgumentException{
        if (name!=null&&!name.isEmpty()&&name.length()<=40)
        this.name = name;
        else throw new IllegalArgumentException("Enter valid name!");

        if(age>=0&&age<=120)
        this.age = age;
        else throw new IllegalArgumentException("Enter valid age");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
