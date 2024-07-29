package HomeWork_inheritance;

public class Doctor {
    private String name;
    private  String lastName;
    private int age;
    private String activity;

    public Doctor(String name, String lastName, int age, String activity){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.activity = activity;

    }

    public void set_name(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public  void setActivity(String activity){
        this.activity = activity;
    }

    public  String getName(){
        return  ("Name : " + this.name);
    }

    public String getLastName(){
        return ("LastName : " + this.lastName);
    }

    public String getAge(){
        return  ("Age : " + this.age);
    }

    public String getActivity(){
        return  ("Activity : " + this.activity);

    }

    public void getInfo(){
        System.out.println("Name : " + this.name + "\n" +
                "Lastname: " + this.lastName + "\n"
        + "Age : " + this.age +"\n"+
                "Activity : " + this.activity);
    }


}
