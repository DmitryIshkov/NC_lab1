package listPrecent;

public class ListP {
    private Percent head;

    public ListP(){
        head = null;
    }

    public void add(Percent percent){
        if(head == null)
            head = percent;
        else{
            Percent localP = head;
            while(localP.getNextPercent() != null)
                localP = localP.getNextPercent();

            localP.setNextPercent(percent);
        }
    }

    public void printAllPercent(){
        Percent localP = head;
        while(localP != null){
            System.out.println(localP.toString());
            localP = localP.getNextPercent();
        }
    }
}
