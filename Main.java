package main;

public class Main {

    public static void main(String[] args) {

        StudentDB db = new StudentDB();

        // add students
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Natnael");
        s1.setGrade(95);

        Student s2 = new Student();
        s2.setId(2);
        s2.setName("Abel");
        s2.setGrade(88);

        db.addStudent(s1);
        db.addStudent(s2);

        // show all
        db.showAll();

        // search
        System.out.println("Searching ID 1:");
        Student found = db.searchById(1);
        if (found != null) {
            System.out.println(found.getName());
        }

        // update
        db.updateStudent(2, "Abel Updated", 92);

        // delete
        db.deleteStudent(1);

        System.out.println("After update & delete:");
        db.showAll();

        // static usage
        System.out.println("Total Students Created: " +
                Student.getStud());
    }
}
