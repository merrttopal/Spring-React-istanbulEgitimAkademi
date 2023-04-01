package useFile;
import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class DataStore {
    private final String fileName;
    private final File file;
    private final String folderName = fncDate();

    public DataStore(String fileName) {
        folderControl(folderName);
        this.fileName = folderName +"/"+fileName + ".txt";
        file = new File(this.fileName);
    }
    public String fncDate(){
        LocalDateTime time = LocalDateTime.now();
        int year = time.getYear();
        String month = time.getMonthValue()>9 ? ""+time.getMonthValue() : "0"+time.getMonthValue();
        String day = time.getDayOfMonth()>9 ?""+time.getDayOfMonth() : "0"+time.getDayOfMonth();
        String nowDay = day+"_"+month+"_"+year;
        System.out.println(nowDay);
        return nowDay;
    }

    public void folderControl(String folderName) {
        File file = new File(folderName);
        if (!file.exists()) {
            file.mkdir();
        }
    }

    public boolean createFile() {

        try {
            // deleteFile();
            return file.createNewFile();
        } catch (Exception e) {
            System.err.println("createFile Error" + e);
        }
        return false;
    }

    public boolean deleteFile() {
        try {
            if (file.exists()) {
                return file.delete();
            }
        } catch (Exception e) {
            System.err.println("deleteFile Error" + e);
        }
        return false;
    }

    public void addData(List<String> data) {
        try {
            //  if(file.canWrite()){
            FileWriter writer = new FileWriter(file, true);
            data = new LinkedList<>();
            data.add(0, data.toString());
            data.add(1, data.toString());
            data.add(2, data.toString());
            writer.append(data.toString());
            writer.close();
            //   }
        } catch (Exception e) {
            System.err.println("addData: " + e);
        }
    }

    public List<String> readData() {
        List<String> ls = new ArrayList<>();
        try {
            if (file.canRead()) {
                Scanner scanner = new Scanner(file);

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    ls.add(line);
                }
            }
        } catch (Exception e) {
            System.err.println("readData: " + e);
        }
        return ls;
    }

    public List<String> allReadData(){
        List<String> ls = new ArrayList<>();
        try {
            File file = new File(folderName);
            File[] files = file.listFiles();
            for (File item :files) {
                System.out.println(item.getAbsoluteFile());
                String type = item.getName().substring(item.getName().length() - 4);
                System.out.println(type);
                if (type.equals(".txt")) {
                    Scanner scanner = new Scanner(item);
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        ls.add(line);
                    }
                }
            }
        }catch (Exception e) {
            System.err.println("aaaaaaaa"+e);
        }
        return ls;
    }


}