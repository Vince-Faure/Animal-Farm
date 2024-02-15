public  class Animal {
    private String animal;

    public Animal(String animal) {
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }


    public void makeNoise() {
        System.out.println("L'animal fait du bruit");
    }
}

