public class DogLoop {
    public static void main(String[] args) {
        Dog smallDog = new Dog(5);
        Dog mediumDog = new Dog(25);
        Dog hugeDog = new Dog(150);

        Dog[] manyDogs = new Dog[4];
        manyDogs[0] = smallDog;
        manyDogs[1] = mediumDog;
        manyDogs[2] = hugeDog;

        int i = 0;
        while (i < manyDogs.length) {
            Dog.maxDog(manyDogs[i],mediumDog).makeNoise();
            i = i + 1;
        }
    }


    public static class Dog {
        public int size;

        public Dog(int s) {
            size = s;
        }
        public void makeNoise() {
            if (size < 10) {
                System.out.println("hideous yapping");
            } else if (size < 30) {
                System.out.println("brak!");
            } else {
                System.out.println("woof!");
            }
        }

        public static Dog maxDog(Dog d1,Dog d2) {
            if (d1.size > d2.size) {
                return d1;
            }
            return d2;
        }
    }
}