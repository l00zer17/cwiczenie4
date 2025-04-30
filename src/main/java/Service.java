import java.util.Collection;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Service {

  public void addStudent(Student student) throws IOException {
    try (BufferedWriter b = new BufferedWriter(new FileWriter("db.txt", true))) {
      b.write(student.toString());
      b.newLine();
    }
  }

  public Collection<Student> getStudents() throws IOException {
    var students = new ArrayList<Student>();
    try (BufferedReader reader = new BufferedReader(new FileReader("db.txt"))) {
      String line;
      while ((line = reader.readLine()) != null) {
        students.add(Student.parse(line));
      }
    }
    return students;
  }

  public Student findStudentByName(String name) throws IOException {
    for (Student s : getStudents()) {
      if (s.getName().equalsIgnoreCase(name)) {
        return s; 
      }
    }
    return null; 
  }
}
