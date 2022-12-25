package works;

public class MainMethod {
    // Nesne üretimi
    public static void main(String[] args) {

        Action action = new Action();
        System.out.println(action.age);

        //Function Call
        action.noParameter();

        //no Return call
        action.noReturn("Mert",21);

        // Return function
        int count =  action.size("Today is JAVA");
        System.out.println(count);
        if (action.size("Fenerbahçe")>=10){
            System.out.println("Loser");
        }

        // Array Function Call
        Object[] arr = {30,"Java",45,"React",true,21,"Full",false,77.23123,"Stack"};
        String data =action.arrFunc(arr);
        System.out.println(data);

        // All Params Func Call
        String adress = action.addressLines("İstanbul","Maltepe","Mahalle","Sokak","No :","Daire No : ");
        System.out.println(adress);

        //Object Use
        Settings settings = new Settings();
        String name = action.useSettings(settings);


    }


}
