public class Animal {
    protected String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public void animalSound() {
        System.out.println("Animal sound");
    };
}

class Lion extends Animal {
    public Lion(String animalName) {
        super(animalName);
    }

    @Override
    public void animalSound() {
        System.out.println("Lion sound");
    }
}

class Cow extends Animal {
    public Cow(String animalName) {
        super(animalName);
    }

    @Override
    public void animalSound() {
        System.out.println("The cow sound");
    }
}
