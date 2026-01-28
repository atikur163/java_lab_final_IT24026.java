class Student {
    private String id;
    private String name;
    private double cgpa;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! CGPA must be between 0.0 and 4.0");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId("IT24026");
        s1.setName("Atikur");
        s1.setCgpa(3.76);

        System.out.println("Student ID: " + s1.getId());
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student CGPA: " + s1.getCgpa());
    }
}
