import java.time.Year;
import java.util.ArrayList;
import java.time.YearMonth;

public class CatTester {

    public static void main(String[] args){
        Cat cat1 = new Cat("ACat", "ABreed", 4, 2012 );
        Cat cat2 = new Cat("BCat", "BBreed", 6, 2007 );
        Cat cat3 = new Cat("CCat", "CBreed", 8, 2016);

        ArrayList<Cat> Kennel = new ArrayList<>();
        Kennel.add(cat1);
        Kennel.add(cat2);
        Kennel.add(cat3);

        int totalCatLegs = 0;
        for(Cat myCat: Kennel){
            totalCatLegs += myCat.getNumberOfLegs();
        }
        int year = YearMonth.now().getYear();
        System.out.println("The total number of cat legs: "+ totalCatLegs);
        System.out.println("Current Year:" + year);
    }
}
