package works;

public class Settings {
    public String profileName(int userId){
        String data = "";
        if (userId == 10) {
            data = "Mert";
        } else if (userId == 20) {
            data= "treM";
        }
        return data;
    }
}
