package entities;

public class Integer extends Number {
    int value;

    public Integer(int value) {
        this.value = value;
    }

    public boolean isPrime() {
        if (value < 2) {
            return false;
        }
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
