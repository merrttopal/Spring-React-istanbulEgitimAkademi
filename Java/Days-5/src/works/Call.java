package works;

public class Call {

    int status = 0;
    int num,num1,num2 = 0;
    double r = 0;
    public Call(int num1,int num2) {
        status = 1;

        this.num1 = num1;
        this.num2 = num2;
    }

    public Call(int num1) {
        status = 2;

        this.num1 = num1;
    }

    public Call(double r) {
        status = 3;

        this.r = r;
    }


    public double action(){
        double end = 0;
        switch (status){
            case 1:
                end = sum(num1,num2);
            break;

            case 2:
                end = square(num1);
            break;

            case 3:
                end = field(r);
            break;
        }
        return end;

    }







    int sum(int num1,int num2){
        return num1+num2;
    }


    int square(int num1){
        return (num1*num1);
    }

    double field(double num){
        int pi = 3;
        return (num*num)*pi;
    }


}
