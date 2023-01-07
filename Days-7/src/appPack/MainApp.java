package appPack;

public class MainApp {
    public static void main(String[] args) {
        // inharitance
        // bir sınıfın farkı bir sınıfa özellik aktarması durumu
        // javada bi  class sadece tek bir başka sınıfın mirasını alır
        // mirası veren sınıf nesne halinde oluşup miras verebilir
        // extends anahtar kelimesi ile miras verilmiş olur
        // mirası alan sınıf, üst sınıfını ezebilir (@Override)
        // mirası alan sınıf, üst sınıf gibi davranış sergiler
        //


        Base a = new A();
        //a.action(1,2);
        B b = new B();
        C c = new C();

        a.action(1,2);
        b.action(1,2);
        c.action(1,2);
        System.out.println("-----------------");
        call(a);
        call(b);
        call(c);
    }
    public static void call(Base base){
        base.action(1,2);
    }
}
