import java.time.YearMonth;

public class Cat {

    private String name;
    private String breed;
    private int numberOfLegs =4;
    private int yearBorn;

    public Cat(String name, String breed, int numberOfLegs, int yearBorn) {
        this.name = name;
        this.breed = breed;
        this.numberOfLegs = numberOfLegs;
        this.yearBorn = yearBorn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", yearBorn=" + yearBorn +
                '}';
    }

    //#4 function
    public int findAge(){
        int currentYear = YearMonth.now().getYear();;
        int age = currentYear - getYearBorn();
        return age;
    }

    //#5 - needs tweaking
    //Would use String builder instead;
    public String getStageofLife(){
        String res = "";
        int age = findAge();
        if(age <= 1){
            res="baby";
        }else if(age < 5){
            res="juvenile";
        }else if(age < 12){
            res="adult";
        }else if(age >= 12){
            res="senior";
        }

        return res;
    }


}
