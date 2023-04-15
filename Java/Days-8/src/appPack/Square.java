package appPack;

public class Square extends Drawing{

    public Square() {}

    public Square(int border){
        super(border);
    }

    @Override
    public void draw() {

        drawIt("Square");

    }

    public void action(int i){
        if(i > 5 ){
            draw();
        }else {super.draw();}
    }

}
