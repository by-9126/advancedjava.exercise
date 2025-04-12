package bt6_6;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Kitty");
        cat.greets();

        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Buddy");
        dog1.greets();
        dog1.greets(dog2);

        BigDog bigDog1 = new BigDog("Bruno");
        BigDog bigDog2 = new BigDog("Max");
        bigDog1.greets();
        bigDog1.greets(dog1);
        bigDog1.greets(bigDog2);
    }
}
