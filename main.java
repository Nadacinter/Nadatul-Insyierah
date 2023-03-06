import java.util.Scanner;

public class Main { 
 public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);
  
  System.out.print("Enter number of data: ");
  int numdata = scanner.nextInt();
  
  Marks marks = new Marks(numdata);
  marks.createData();
  PrincipalName principalName = new PrincipalName("Nadatul", "Insyierah");
  Address address = new Address("No 123, Jalan kampung pinang", "4252662", " Kuching", "Perak");
  School school = new School("Sekolah Tamn Ptronas",address,principalName,marks);
 
  school.setNumberParticipants();
  System.out.println(school.toString());
  System.out.printf("Average Score     : %.2f",marks.average());
  System.out.printf("\nStandard Deviation: %.2f",marks.stanDev(marks.average()));
 }
}
