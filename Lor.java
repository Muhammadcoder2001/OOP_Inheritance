package HomeWork_inheritance;

public class Lor  extends  Doctor{

    public Lor(String name, String lastName, int age, String activity) {
        super(name, lastName, age, activity);
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Muhammadqodir", "Abduqahhorov", 32, "Lor");
        doctor.getInfo();
        System.out.println();
        doctor.set_name("Abduqodir");
        doctor.setAge(45);
        doctor.setLastName("Abduqahhorov");
        doctor.setActivity("Changed to Xirurg");
        System.out.println(doctor.getActivity());
        System.out.println(doctor.getAge());
        System.out.println(doctor.getName());
        System.out.println(doctor.getLastName());
    }

}
