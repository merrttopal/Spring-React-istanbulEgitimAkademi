package useAbstract;

public abstract class User {
    abstract  int userID();

    public String userName(){
        String name = "";
        if (userID() == 10) {
            name = "Mert";
        } else if (userID() == 20) {
            name = "Kadir";
        }
        return name;
    }

    public boolean userStatus(){
        boolean status = false;
        if (userID() == 10) {
            status = true;
        } else if (userID() == 20) {
            status = true;
        }
        return status;
    }


}
