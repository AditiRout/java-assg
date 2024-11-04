package firstProj;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Student {
    private String name;
    private int rollno;
    private int sem;
    private int marks;

    Student(String name, int rollno, int sem, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.sem = sem;
        this.marks = marks;
    }

    public String getName() {
        return this.name;
    }

    public int getRollNo() {
        return this.rollno;
    }

    public int getSem() {
        return this.sem;
    }

    public int getMarks() {
        return this.marks;
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        File file = new File("student.txt");

        try {
            // Writing data to the file
            FileWriter fw = new FileWriter(file, true);

            students[0] = new Student("Sachin", 12, 3, 67);
            students[1] = new Student("Anushka", 5, 4, 89);
            students[2] = new Student("Raj", 18, 6, 90);

            for (int i = 0; i < 3; i++) {
                fw.write(students[i].getName() + "," + students[i].getMarks() + "," + students[i].getRollNo() + "," + students[i].getSem() + "\n");
            }

            fw.flush();
            fw.close();
            System.out.println("Data written to file.");

            // Reading data from the file
            FileReader fr = new FileReader("student.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("Data read from file:");

            String data;
            while ((data = br.readLine()) != null) {
                String[] arr = data.split(",");
                String name = arr[0];
                String marks = arr[1];
                String rollno = arr[2];
                String sem = arr[3];

                System.out.println(name + "," + marks + "," + rollno + "," + sem);
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
