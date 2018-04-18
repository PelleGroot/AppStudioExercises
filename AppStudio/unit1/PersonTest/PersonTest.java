class Person {

   // Properties of the class...
   private String name;
   private int    age;
   private String gender;

   // Constructor of the class...
   public Person(String aName, int anAge, String aGender) {
      name = aName;
      age  = anAge;
      gender = aGender;
   }

   // Methods of the class...
   public void talk() {
      System.out.println("Hi, my name's " + name);
      System.out.println("and my age is " + age);
      System.out.println("and I am a " + gender);
      commentAboutAge();
   }
   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      if (age == 5) {
         System.out.println("time to start school");
      }
      if (age > 60){
         System.out.println("old person");
      }
      if (age == 34){
         System.out.println("Luke, I am your father");
      }
      if (age == 44){
         System.out.println("Luke, I am your father, but ten years older");
      }
      if (age == 48){
         System.out.println("Winston, stop messing about with the computer");
      }
      if (age == 49){
         System.out.println("Winston, you are a yaer older now");
      }
   }
   public void growOlder() {
      age+=1;
   }

   public void growOlderBy(int years) {
      age = (age + years);
   }

   public void giveKnighthood(){
      name = ("Sir " + name);
   }

}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Person ls = new Person("Luke Skywalker",34,"man");
      Person wp = new Person("Winston Peters",48,"man");

      ls.growOlderBy(10);
      wp.giveKnighthood();
      ls.talk();
      wp.talk();
      wp.growOlder();
   }

}
