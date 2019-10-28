import listPrecent.ListP;
import listPrecent.Percent;
import org.joda.time.DateTime;


public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");

        ListP list = new ListP();

        Percent per = new Percent("Dmitry Ishkov", true, new DateTime());

        Percent per1 = new Percent("Dmitry Ishkov", true, new DateTime());

        Percent per2 = new Percent("Dmitry Ishkov", true, new DateTime());

        list.add(per);
        list.add(per1);
        list.add(per2);

        list.printAllPercent();
    }
}
