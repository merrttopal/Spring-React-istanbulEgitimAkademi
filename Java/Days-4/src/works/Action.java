package works;

public class Action {
    int age = 21;                           //Defauld erişim belirteci sadece kendi paketindeki classlar tarafından görünür

    public String name = "Mert";            // public -> her yerden görün

    protected int agee = 22 ;               // sadece kendi sınıfının içinde görünür

    private String tcId = "12312312312";

    public int count(){
        return tcId.length();
    }


    private void call(){

        System.out.println("This Line Call");

    }






}
