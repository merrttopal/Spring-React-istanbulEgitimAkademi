package useAbstract;

public class Person extends Customer{
    int personNum = 0;
    public Person(int personNum) {
        this.personNum = personNum;
    }

    @Override
    public int customerNumber() {
        return personNum;
    }


}
