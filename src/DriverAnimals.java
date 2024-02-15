public class DriverAnimals {
    public static  void main(String[] args){
        Animal[] animalTab = new Animal[4];
        animalTab[0]=new Cow("Marguerite");
        animalTab[1]=new Duck("Daffy");
        animalTab[2]=new Cow("Rosalie");
        animalTab[3]=new Duck("Donald");
        
        for (int i=0; i< animalTab.length; i++){
            String animalName = animalTab[i].getAnimal();
            System.out.println(animalName + " : "  );
            animalTab[i].makeNoise();
            
        }
    }
}
