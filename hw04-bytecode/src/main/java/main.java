public class main {

    public static void main (String[] args){

        IUserAction userAction = IoC.createUserAction();
        userAction.myAction("my action");


    }

}
