package useAbstract;

public class MainAbstract {
    // Abstracts classes
    // Gövdeli gövdesiz methodlar
    // Normal sınıf davranışı gösterirler
    // Gövdesiz (soyut) methodlar kurulmak istendiğinde abstract anahtar kelimesi kullanılır
    // Miras verildiğinde soyut methodlar override edilmek zorundadır
  
    public static void main(String[] args) {

        Person person = new Person(200);
        System.out.println(person.customerName());

    }
}
