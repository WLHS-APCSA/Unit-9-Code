package practice_frq;

public class Dog extends Pet{

    private String breed;

    public Dog(String n, String b){
        super(n,"dog");
        breed = b;
    }
    @Override
    public void printPetInfo(){
        super.printPetInfo();
        System.out.print(" of breed "+this.breed);
    }
}
