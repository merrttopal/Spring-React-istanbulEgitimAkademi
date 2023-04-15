package overLoad;

public class MainOverLoad {
    public static void main(String[] args) {
        int age = 21;
        String name = "Mert";
        float num1 = 1.5f;
        Object obj = 50.6;

        String cString = String.valueOf(age);
        Action action = new Action();
        byte num = 10;
        double end = action.call(num);

        end = action.call(10.5f);
        System.out.println(end);
    }
}
