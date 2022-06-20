public class DogLauncher {
    public static void main(String[] args) {

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog(25);
        dogs[0].makeNoise();
        dogs[1] = new Dog(50);
        dogs[1].makeNoise();

        Dog d = new Dog(15);
        Dog d2 = new Dog(100);

        Dog bigger = Dog.maxDog(d,d2);
        bigger.makeNoise();

    }
}

