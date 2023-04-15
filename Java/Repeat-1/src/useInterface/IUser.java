package useInterface;

import useAbstract.User;

public interface IUser {
    boolean userLogin(String username, String password);
    String userName (String userID);

    default int sum(int a , int b){
        return a+b;
    }

}
