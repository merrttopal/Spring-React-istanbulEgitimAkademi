package useInterface;

public class User implements IUser, IProfile{

    @Override
    public boolean userLogin(String username, String password) {
        if (password.length()>0 && password.length()<10) {

        }
        return false;
    }

    @Override
    public String userName(String userID) {
        return null;
    }

    @Override
    public String profileImage(int userID) {
        return null;
    }
}
