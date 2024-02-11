class Teachers{
    String name, gender;
    int age, phone;

    void setInfor(String n, String g, int a, int p){
        name = n;
        gender = g;
        age = a;
        phone = p;
    }

    // setInfo using parameter method.
    void showInfor(){
        System.out.println("Name   : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Age    : "+age);
        System.out.println("Phone  : "+phone);
        System.out.println("\n");
    }

}

public class classPrac2 {
    public static void main(String[] args) {
        Teachers teacher1 = new Teachers();
        Teachers teacher2 = new Teachers();

        // Parameter method.
        teacher1.setInfor("Gobinda Bhattacharjee", "Male", 22, 1532830003);
        teacher1.showInfor();

        teacher2.setInfor("Gourab Chakraborty", "Male", 24, 1523457623);
        teacher2.showInfor();
    }
}
