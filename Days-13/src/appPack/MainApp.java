package appPack;

import java.util.Locale;

public class MainApp {
    public static void main(String[] args) {
        String words = "Hello world";
        String data = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
        String stNumber = "100";
        int num = 10;
        int size = data.length();
        String java = "  Java Programing  ";
        System.out.println("Size: "+size);

        char[] arr = stNumber.toCharArray();
        boolean isDigit = true;
        for (char item : arr){
            if(!Character.isDigit(item)){
                System.out.println("isDigit : "+item);
                isDigit = false;
            }
        }
        System.out.println("isDigit : "+ isDigit);

        byte[] bytes = data.getBytes();
        System.out.println(bytes.length);

        String lower = data.toLowerCase();
        System.out.println(lower);

        String upper = data.toUpperCase(new Locale("tr","TR"));
        System.out.println(upper);

        String[] wordArr = data.split(" ");
        String[] wordArr1 = data.split("\\. ");
        System.out.println(wordArr.length);
        System.out.println(wordArr1.length);


        boolean status = data.contains("bask");
        System.out.println(status);

        int dummyNum = data.compareToIgnoreCase("BOOK");
        System.out.println(dummyNum);


        int index = data.indexOf("simply");
        System.out.println(index);

        String newString = data.replaceAll("an","**");
        System.out.println(newString);
        System.out.println("/////////////////////////");
        String subString = data.substring(index, index +"simply".length());
        System.out.println(subString);

        java = java.trim();
        java = java.replaceAll(" ","");
        System.out.println(java);


    }
}
