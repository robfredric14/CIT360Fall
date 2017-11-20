package sandboxCode.jUnitTest;



public class Pound {
    public static void main(String[] args) {
        Pound pound = new Pound();
        Dog[] allDogs = pound.buildDogs();
        pound.displayDogs(allDogs);
    }
    private Dog[] buildDogs() {
        Dog dog1 = new Dog(4, "brown", 10.5, "Husky", "Dogmeat");
        Dog dog2 = new Dog(3, "white", 10.5, "Chiwawa", "Chico");
        Dog dog3 = new Dog(4, "tan", 10.5, "Golden Retriever", "Keeper");
        Dog dog4 = new Dog(4, "black", 10.5, "Pitbull", "Rocky");
        Dog dog5 = new Dog(4, "black", 10.5, "Doberman Pinscher", "Charlie");

        Dog[] dogArray = {dog1, dog2, dog3, dog4, dog5};
        return dogArray;
    }

    private void displayDogs(Dog[] dogArray) {
        for (int i=0; i<dogArray.length; i++) {
            System.out.println(dogArray[i]);
        }
    }


}
