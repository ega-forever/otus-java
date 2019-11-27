public class UserAction implements IUserAction {

    @Log
    public void myAction(String name, String type){
        System.out.println("super action: " + name + " with type: " + type);
    }

    public void myActionEmpty(){
        System.out.println("empty action");
    }

}
