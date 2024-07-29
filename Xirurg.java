package HomeWork_inheritance;

public class Xirurg  extends Doctor{

    public Xirurg(String name, String lastName, int age, String activity) {
        super(name, lastName, age, activity);
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Mirzohid", "Nazaraliyev", 25, "Xirurg");

        doctor.getInfo();
        System.out.println();
        doctor.set_name("Abdujalil");
        doctor.setAge(45);
        doctor.setLastName("Dadajonov");
        doctor.setActivity("Changed to LOR");
        System.out.println(doctor.getActivity());
        System.out.println(doctor.getAge());
        System.out.println(doctor.getName());
        System.out.println(doctor.getLastName());

    }
}
