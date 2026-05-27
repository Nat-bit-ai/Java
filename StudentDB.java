package main;

import java.util.ArrayList;

class StudentDB {

    protected ArrayList<Student> students = new ArrayList<>();

    // CREATE
    public void addStudent(Student s) {
        students.add(s);
    }

    // READ ALL
    public void showAll() {
        for (Student s : students) {
            s.display();
        }
    }

    // SEARCH
    public Student searchById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // UPDATE
    public boolean updateStudent(int id, String newName, double newGrade) {
        Student s = searchById(id);

        if (s != null) {
            s.setName(newName);
            s.setGrade(newGrade);
            return true;
        }
        return false;
    }

    // DELETE
    public boolean deleteStudent(int id) {
        Student s = searchById(id);

        if (s != null) {
            students.remove(s);
            return true;
        }
        return false;
    }
}