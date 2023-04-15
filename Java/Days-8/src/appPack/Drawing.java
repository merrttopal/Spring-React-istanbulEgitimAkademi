package appPack;

public class Drawing {
    int border = 0;
    public Drawing() {System.out.println("Drawing call");}

    public Drawing(int border ){
        System.out.println("Drawing border: " + border);
        this.border = border;

    }

    public void draw(){
        drawIt("");
    }

    public void drawIt(String status){
        System.out.println(status+" Drawing done." + border);
    }

    // obje sınıfından miras
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
