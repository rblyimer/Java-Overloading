public class Animal {
    String name;
    boolean isADog;

    public Animal(String name, boolean isADog) {
        this.name = name;
        this.isADog = isADog;
    }

    public String getName() {
        return name;
    }

    public boolean isADog() {
        return isADog;
    }

    @Override
    public String toString() {
        return getName() + " is a dog = " + isADog();
    }
}
