abstract class Animal {
    abstract void speak();

    static void makeAnimalSpeak(Animal a) {
        a.speak();
    }
}

public class innerClass {
    public static void main(String[] args) {

        Animal.makeAnimalSpeak(new Animal() {
            @Override
            void speak() {
                System.out.println("The dog barked.");
            }
        });

        Animal.makeAnimalSpeak(new Animal() {
            @Override
            void speak() {
                System.out.println("The cat meowed");
            }
        });

        Animal.makeAnimalSpeak(new Animal() {
            @Override
            void speak() {
                System.out.println("The bird chirped");
            }
        });
    }
}