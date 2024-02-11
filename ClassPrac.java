class Teacher{
    String name, gender;
    int phone;
}

class showOut{
    String name, gender;
    int phone;

    
}


public class ClassPrac {
    public static void main(String[] args){
        Teacher tech1 = new Teacher();
        Teacher tech2 = new Teacher();

        tech1.name = "Gobinda Bhattacharjee";
        tech1.gender = "Male";
        tech1.phone = 1532830003;

        System.out.println("Name: "+tech1.name);
        System.out.println("Gender: "+tech1.gender);
        System.out.println("Phone: "+tech1.phone);

        tech2.name = "Nupur Bhattacharjee";
        tech2.gender = "Female";
        tech2.phone = 1556542028;

        System.out.println("Name: "+tech2.name);
        System.out.println("Gender: "+tech2.gender);
        System.out.println("Phone: "+tech2.phone);
    }
}
