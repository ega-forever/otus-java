public class UserAction implements IUserAction {

    @Log
    public void myAction(String name){
        System.out.println("super action: " + name);
    }

}
