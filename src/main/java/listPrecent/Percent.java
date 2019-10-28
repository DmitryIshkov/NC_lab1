package listPrecent;

import org.joda.time.DateTime;


public class Percent {

    static private int counter = 0;

    private int id;
    private String fio;
    private boolean sex;
    private DateTime dob;
    private Percent nextPercent;

    /**
     * Конструктор класса Percent, поле следующего объекта инициализируется null'ом, id получается из статичной переменной counter, после чегоона инкрементируется
     * @param fio фамили имя отчество
     * @param sex пол 0-женщина, 1-мужчина
     * @param dob дата рождения
     */
    public Percent(String fio, boolean sex, DateTime dob) {
        this.id = counter++;
        this.fio = fio;
        this.sex = sex;
        this.dob = dob;
        this.nextPercent = null;
    }

    @Override
    public String toString() {
        return "Percent{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", sex=" + sex +
                ", dob=" + dob +
                ", nextPercent=" + nextPercent +
                '}';
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

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public boolean isSex() {
        return sex;
    }

    public DateTime getDob() {
        return dob;
    }
}
