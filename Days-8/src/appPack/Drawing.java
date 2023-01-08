package appPack;

public class Drawing {



    public Drawing() {
        System.out.println("Drawing call");
    }

    public void draw(){
        drawIt("");
    }

    public void drawIt(String status){
        System.out.println(status+" Drawing done.");
    }
    // obje sınıfından miras
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
