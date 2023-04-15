package works;

public class MainLoop {
    public static void main(String[] args) {

        //for loop
        int i = 0;
        for(i = 0; i<10 ;i++) {
            System.out.println("i : " + i);


        }
        System.out.println(i);

        // ++, --
        int x = 0;
        System.out.println(++x);

        String[] cities = {"Istanbul", "Ankara","Izmir","Mugla","Aydın"};

        for (int j = 0; j < cities.length; j++) {
            String item = cities[j];
            System.out.println(item);
        }
        // for each
        for (String item: cities) {
            System.out.println(item);
        }


        String[] sections = {"kış","ilkbahar","yaz","sonbahar"};
        String[][] months = {{"Aralık","Ocak", "Şubat"},{"Mart",
                "Nisan", "Mayıs"},{"Haziran", "Temmuz",
                "Ağustos"},{"Eylül", "Ekim", "Kasım"} };

        String month = "Haziran";
        label: for (int j = 0; j < months.length; j++) {
            String[] newArr = months[j];
            for (int k = 0; k <newArr.length; k++) {
                String item = newArr[k];
                if(month.equals(item)){
                    System.out.println(sections[j]);
                    break label;
                }
            }

        }




    }
}
