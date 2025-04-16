/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    try {
      
        Service s = new Service();
        Scanner scanner = new Scanner(System.in);
      
     boolean tak = true;
      while(tak){
        System.out.println("Wybierz opcję:");
        System.out.println("1 - Dodaj studenta");
        System.out.println("2 - Wyświetl wszystkich studentów");
        System.out.print("Twój wybór: ");
        String choice = scanner.nextLine();

        switch (choice) {
          case "1":
            System.out.print("Podaj imię studenta: ");
            String name = scanner.nextLine();

            System.out.print("Podaj wiek studenta: ");
            int age = Integer.parseInt(scanner.nextLine());

            s.addStudent(new Student(name, age));
            System.out.println("Dodano studenta.");
            break;

          case "2":
            var students = s.getStudents();
            for (Student current : students) {
              System.out.println(current.ToString());
            }
            break;

          default:
            System.out.println("Nieznana opcja.");
            break;
        }
      }
        scanner.close();


    } catch (IOException e) {

    }
  }
}