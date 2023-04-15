package useInterFace;

public interface IUser {

    // interface
    // gövdesiz metodlar kugulanır
    // implement anahtar kelimesi ile özellikleri normal sınıfa aktarılır
    // dökümantasyonu kolaylaştırırlar
    // interfaceler içindeki methotlara erişim belirteci vermeye gerek yoktur (defauld public)

    String userName(int uId);
    int userAge(int uId);

}
