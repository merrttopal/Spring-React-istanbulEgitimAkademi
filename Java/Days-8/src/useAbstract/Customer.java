package useAbstract;

public abstract class  Customer {

    public abstract int customerNumber();

    public int total (){
        int num = customerNumber();
        if(num == 100){
            return 100000;
        }else if (num == 200){
            return 200000;
        }
        return num;
    }
    public String customerName(){
        int num = customerNumber();
        if(num == 100){
            return "murat";
        }else if (num == 200){
            return "mert";
        }
        return "";
    }

}