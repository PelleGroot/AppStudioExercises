/* Need to import java.io package to use the BufferedReader and
	 InputStreamReader.
*/
import java.io.*;

public class Student {

  private static BufferedReader stdIn = new BufferedReader(new
		InputStreamReader(System.in));

  private String name;
  private int age;

  public Student () {
    name = "";
    age = 0;
  }

  public void readName () throws IOException {
    System.out.print("Input your name: ");
    name = stdIn.readLine();
  }

  public void readAge () throws IOException {
    for (int i = 0; i < 1;){
      try{
      System.out.print("Input your age: ");
      age = Integer.parseInt(stdIn.readLine());
      } catch ( NumberFormatException nfe) {
         System.out.println("Error, fill in a valid number");
      }
      if(age >= 0 || age <= 150){
          i+=1;
      }
    }
  }

  public void printName () {
    System.out.println("Name: " + name);
  }

  public void printAge () {
    System.out.println("Age: " + age);
  }


  public static void main (String[] args) throws IOException {
    Student me = new Student();
    me.readName();
    me.readAge();
    me.printName();
    me.printAge();

  }
}

