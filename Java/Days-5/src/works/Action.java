package works;

public class Action {
    // Constructor kurucu methodlar
    // Return Anahtar kelimesi alamazlar
    // Void  Anahtar kelimesi alamazlar
    // Sınıf ismi ile aynı olmak zorunda
    // Erişim belirteci alırlar
    // Methodları parametre alabilirler


    // Amaç
    // Bir sınıfın purulence farklı yeteneklere kavuşmasını sağlamak
    String data = "";
    int status = 40;
    Setting setting = new Setting();
    public Action() {
       // System.out.println(" Default Action Called ");
       // read();
    }

    public Action(String data){
        System.out.println("Action Call: "+ data);
        this.data = data;
    }

    public void read(){
        System.out.println("Read Call");
    }


    public void count(){
        System.out.println(this.data.length());
    }
}
