class Animal {

    // Properties of the class...
    public int     numberOfLegs;
    public boolean hasWings;

    // Constructor of the class...
    public Animal() {
      numberOfLegs = 4;
      hasWings = false;
    }

    // Methods of the class...
    public void talk() {
      System.out.println("Hello");
    }
}

class Bird extends Animal {

    // Properties of the class...
    public boolean canFly;

    // Constructor of the class...
    public Bird() {
      numberOfLegs = 2;
      hasWings = true;
      canFly = true;
    }

    // Methods of the class...
    public void fly() {
      System.out.println("flap flap");
    }
}

class Eagle extends Bird {

    // Properties of the class...
    private int numberOfKills;

    // Constructor of the class...
    Eagle() {
      numberOfKills = 0;
    }

    // Methods of the class...
    public void attack() {
      numberOfKills++;
    }
}

class AnimalTest {

    // The main method is the point of entry into the program...
    public static void main(String[] args) {

        Animal a = new Animal();
        System.out.println(a.numberOfLegs);
        System.out.println(a.hasWings);
        a.talk();
        // a.fly(); Can't compile because it class animal doesn't include fly

        Bird b = new Bird();
        System.out.println(b.numberOfLegs);
        System.out.println(b.hasWings);
        System.out.println(b.canFly);
        // System.out.println(b.numberOfKills); cannot compile because this is not part of bird
        b.talk();
        // b.attack(); cannot compile because it is part of eagle not of bird

        a = b;
        a.talk();
        // a.fly(); because it looks in the class animal for fly, and it is not there

        // b = a; Because bird is already an animal, it cannot be equal to it.
        b.talk();
        b.fly();

        Eagle e = new Eagle();
        // System.out.println(e.numberOfKills); is a private int, so it cannot be used outside the class
        System.out.println(e.numberOfLegs);
        System.out.println(e.hasWings);
        e.talk();
        e.attack();

    }
}