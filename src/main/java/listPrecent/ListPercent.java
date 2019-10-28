package listPrecent;

public class ListPercent {
    private Percent head;

    public ListPercent(){
        head = null;
    }

    /**
     * добавление нового человека в список
     * @param percent - объект человека
     */
    public void add(Percent percent){
        if(percent == null)
            return;

        if(head == null)
            head = percent;
        else{
            Percent localP = head;
            while(localP.getNextPercent() != null){
                localP = localP.getNextPercent();
            }

            localP.setNextPercent(percent);
        }
    }

    public void delete(int id){
        if(head != null)
            if(head.getId() == id){
                head = head.getNextPercent();
            }else{
                Percent prevPer = head;
                Percent localPer = head.getNextPercent();

                while(localPer != null){
                    if(localPer.getId() == id){
                        prevPer.setNextPercent(localPer.getNextPercent());
                        return;
                    }else{
                        prevPer = localPer;
                        localPer = localPer.getNextPercent();
                    }
                }
            }
    }

    /**
     * Получает объект человека с запрошенным id
     * @param id id искомого человека
     * @return выводит объект искоомго человека
     */
    public Percent getPercent(int id){
        Percent localP = head;
        while(localP != null){
            if(localP.getId() == id){
                return localP;
            }
            localP = localP.getNextPercent();
        }
        return null;
    }

    /**
     * печать информации о всех людях в списке
     */
    public void printAllPercent(){
        Percent localP = head;
        while(localP != null){
            System.out.println(localP.toString());
            localP = localP.getNextPercent();
        }
    }
}
