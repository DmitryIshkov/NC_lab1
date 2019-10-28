package listPrecent;

import org.joda.time.DateTime;
import org.joda.time.Years;



public class Percent {
    public enum Sex {
        MAN,
        WOMAN
    }

    static private int counter = 0;

    private int id;
    private String fio;
    private Sex sex;
    private DateTime birthdays;
    private Percent nextPercent;

    /**
     * Конструктор класса Percent, поле следующего объекта инициализируется null'ом, id получается из статичной переменной counter, после чегоона инкрементируется
     * @param fio фамили имя отчество
     * @param sex пол 0-женщина, 1-мужчина
     * @param birthdays дата рождения
     */
    public Percent(String fio, Sex sex, DateTime birthdays) {
        this.id = counter++;
        this.fio = fio;
        this.sex = sex;
        this.birthdays = birthdays;
        this.nextPercent = null;
    }

    @Override
    public String toString() {
        return "Percent{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", sex=" + sex +
                ", dob=" + birthdays +
                ", nextPercent=" + nextPercent +
                '}';
    }

    /**
     * получение возраста
     * @return возраст человека
     */
    public int getAge(){
        DateTime currentDate = new DateTime();

        if ((birthdays != null) && (currentDate != null)) {
            return Years.yearsBetween(birthdays, currentDate).getYears();
        } else {
            return 0;
        }
    }


    public void setNextPercent(Percent nextPercent) {
        this.nextPercent = nextPercent;
    }

    public Percent getNextPercent() {
        return nextPercent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setBirthdays(DateTime dob) {
        this.birthdays = birthdays;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public Sex isSex() {
        return sex;
    }

    public DateTime getBirthdays() {
        return birthdays;
    }
}
