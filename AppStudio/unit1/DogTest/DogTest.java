class Flea {

   // Properties of the class...
   private String name;

   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }

   public String fleaName(){
       return name;
   }
}

class Dog {

   // Properties of the class...
   private String name;
   private int    age;
   private Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }

   public String toString(){
       return ("name: " + name + " age: " + age + " Flea: " + dogsFlea);
   }
    public String dogName(){
        return name;
    }
}

class DogOwner{

    // properties of the class...
    private String name;
    private int salary;
    private Dog ownersDog;

    public DogOwner(String aName, int aSalary, Dog aDog) {
        name = aName;
        salary = aSalary;
        ownersDog = aDog;
    }

    public String toString(){
        return ("Dogowner: " + name + " salary: " + salary + " Dog: " + ownersDog);
    }
}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
    Flea a = new Flea("Pop");
    Flea b = new Flea("Squak");
    Flea c = new Flea("Zip");

    System.out.println(a.toString()+ " / " + b.toString()+ " / " + c.toString());

    Dog d = new Dog("Rex", 2, a);
    Dog e = new Dog("Jimbo", 3, b);
    Dog f = new Dog("Fido", 4, c);

    System.out.println(d.toString() + " / " + e.toString()+ " / " + f.toString());

    DogOwner g = new DogOwner("Angus", 1500, d);
    DogOwner h = new DogOwner("Brian", 2500, e);
    DogOwner i = new DogOwner("Charles", 3500, f);

    System.out.println(g.toString() + " / " + h.toString() + " / " + i.toString());

    }
}
