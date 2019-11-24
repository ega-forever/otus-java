import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class IoC {

    static IUserAction createUserAction() {
        InvocationHandler handler = new LoggerInvocationHandler(new UserAction());
        return (IUserAction) Proxy.newProxyInstance(IoC.class.getClassLoader(), new Class<?>[]{IUserAction.class}, handler);
    }


    static class LoggerInvocationHandler implements InvocationHandler {

        private final UserAction clazz;

        LoggerInvocationHandler(UserAction clazz) {
            this.clazz = clazz;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            if (clazz.getClass().getMethod(method.getName(), method.getParameterTypes()).getAnnotation(Log.class) != null) {
                System.out.println("executed method: " + method.getName() + ", param: " + args[0]);
            }

            return method.invoke(clazz, args);
        }
    }

}
