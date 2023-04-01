package useInterFace;

public class MainInterface {
    public static void main(String[] args) {
        UserImpl user = new UserImpl();
        user.userAge(1);


        IUser user1 = new UserImpl();
        user1.userName(1);


        IProfile user2 = new UserImpl();
        user2.userProfileName(1);

        // interface to class
        IUser iUser = new IUser() {
            @Override
            public String userName(int uId) {
                return null;
            }

            @Override
            public int userAge(int uId) {
                return 0;
            }
        };




    }

}
