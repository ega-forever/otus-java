public class Demo {

    public static void main (String[] args){

        IUserAction userAction = (IUserAction) IoC.create(new UserAction());
        userAction.myAction("my action", "type_1");
        userAction.myActionEmpty();


    }

}
