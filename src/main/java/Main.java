import listPrecent.ListPercent;
import listPrecent.Percent;
//import listPrecent.Sex;
import org.joda.time.DateTime;


public class Main {
    public static void main(String[] args){

        ListPercent list = new ListPercent();

        Percent per = new Percent("Vasily Petrov", Percent.Sex.MAN, (new DateTime()).minusYears(14));
        Percent per1 = new Percent("Petr Ivanov", Percent.Sex.MAN, (new DateTime()).minusYears(24));
        Percent per2 = new Percent("Marya Tarasova", Percent.Sex.WOMAN, (new DateTime()).minusYears(18));

        list.add(per);
        list.add(per1);
        list.add(per2);

        System.out.println("All people list:");
        list.printAllPercent();

        System.out.println("Percent age id = 1:");
        Percent sPer = list.getPercent(1);
        if(sPer != null)
            System.out.println(sPer.getAge());
        else
            System.out.println("List don't have percent id = 1");

        System.out.println("Delete percent id = 1:");
        list.delete(1);

        System.out.println("All people list:");
        list.printAllPercent();

        System.out.println("Search percent id = 1:");
        Percent sPer1 = list.getPercent(1);
        if(sPer1 != null)
            System.out.println(sPer1.toString());
        else
            System.out.println("List don't have percent id = 1");

    }
}
