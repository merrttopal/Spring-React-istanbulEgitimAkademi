package works;

import java.util.Random;

public class BankCustomer {

    // Static
    // Kullanımı için nesne üretimine ihtiyaç duymazlar
    // Sınıfa ait olmak zorundadırlar. {}
    // Değişkenler, Fonksiyonlar ve nesnelerde kullanılır.
    // Tetiklenmasi sınıfAdı.statikAdı şeklinde tetiklenir
    // Erişim belirteci alırlar
    // Uygulama açık olduğu sürece ölmezler
    // İçindeki değerler istenilen her yerde değiştirilebilir

    static String name = "Mert";
    String city = "istanbul";




    public String userName(long customerTC ){
        Random random = new Random();
        String userName = "";
        if(customerTC == 78266265068L){
            userName = "Mert";
        }
        else if(customerTC == 38444326486L){
            userName = "Mehmet";
        }
        return userName;

    }
}
