public class Student {
  private String name;
  private int age;
  private String lastName;
  private String urodzenie;

  public Student(String name, String lastName, int age, String urodzenie){
    this.name = name;
    this.age = age;
    this.lastName = lastName;
    this.urodzenie = urodzenie;
  }

  public String getName() {return name;}
  public String getLastName() {return lastName;}
  public int getAge() {return age;}
  public String getUrodzenie() {return urodzenie;}

  public String toString() {
    return name + " " + lastName + " " + Integer.toString(age) + " " + urodzenie;
  }

  public static Student parse(String str) {
    String[] data = str.split(" ");
    if (data.length != 4) {
      return new Student("Parse Error", "Parse Error", -1, "Parse Error");
    }
    return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);
  }
}