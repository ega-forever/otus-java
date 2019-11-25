import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

class IoC {

    static Object create(Object instance) {
        InvocationHandler handler = new LoggerInvocationHandler(instance);
        return Proxy.newProxyInstance(IoC.class.getClassLoader(), instance.getClass().getInterfaces(), handler);
    }


    static class LoggerInvocationHandler implements InvocationHandler {

        private final Object instance;
        private final Map<String, Method> methodsMap;

        LoggerInvocationHandler(Object instance) {
            this.instance = instance;
            this.methodsMap = new HashMap<>();

            for (Method method : this.instance.getClass().getMethods()) {
                methodsMap.put(LoggerInvocationHandler.toShortString(method), method);
            }
        }

        private static String toShortString(Method method) {
            StringBuilder sb = new StringBuilder("method ");
            sb.append(method.getName());
            sb.append('(');
            StringJoiner sj = new StringJoiner(",");
            for (Class<?> parameterType : method.getParameterTypes()) {
                sj.add(parameterType.getTypeName());
            }
            sb.append(sj);
            sb.append(')');
            return sb.toString();
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            Method clazzMethod = this.methodsMap.get(LoggerInvocationHandler.toShortString(method));

            if (clazzMethod.getAnnotation(Log.class) != null) {
                System.out.println("executed method: " + method.getName() + ", param: " + args[0]);
            }

            return method.invoke(this.instance, args);
        }
    }

}
