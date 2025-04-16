public class Student {

  private String Name;
  private int Age;
  private String lastName;
  
  public Student(String name, String lastName, int age){
    this.name = name;
    this.age = age;
    this.lastName = lastName;
  }

  public String GetName() {return Name;}
  public String GetLastName() {return lastName;}
  public int GetAge() {return Age;}

  public String ToString() {
    return Name + " " + lastName  + " " + Integer.toString(Age);
  }

public static Student parse(String str) {
    String[] data = str.split(" ");
    if (data.length != 3) {
      return new Student("Parse Error", "Parse Error", -1);
    }
    return new Student(data[0], data[1], Integer.parseInt(data[2]));
  }
}