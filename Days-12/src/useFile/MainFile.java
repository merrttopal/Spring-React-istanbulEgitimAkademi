package useFile;

import java.util.List;

public class MainFile {
    public static void main(String[] args) {

        DataStore dataStore = new DataStore("sample");

/*
        boolean createStatus = dataStore.createFile();
        System.err.println(createStatus);
        boolean deleteStatus = dataStore.deleteFile();
        System.err.println(deleteStatus);
 */
       //dataStore.addData("RestApi Note");
/*
       try {
           int i  = 1/0;
       }catch (Exception ex){
           dataStore.addData(ex.getStackTrace()[0].toString());
       }

 *//*
        dataStore.addData("new line note");
        dataStore.readData();
        List<String > ls = dataStore.readData();
        System.out.println(ls);
        */
        List<String> lsx = dataStore.allReadData();
        System.out.println(lsx);

    }
}
