import com.sun.management.GarbageCollectionNotificationInfo;

import javax.management.NotificationEmitter;
import javax.management.NotificationListener;
import javax.management.openmbean.CompositeData;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) throws InterruptedException {

        monitorGC();
        List<String> list = new ArrayList<>();

        int delimer = 10;
        while (true) {
            list.add("super string" + System.currentTimeMillis());

            if (list.size() % delimer == 0) {
                int delSize = list.size() / 2;
                for (int index = 0; index < delSize; index++)
                    list.remove(index);

                delimer *= 2;
                Thread.sleep(100);

            }


        }

    }

    private static void monitorGC() {

        List<GarbageCollectorMXBean> gcbeans = ManagementFactory.getGarbageCollectorMXBeans();

        for (GarbageCollectorMXBean bean : gcbeans) {
            System.out.println("GC name:" + bean.getName());
            NotificationEmitter emitter = (NotificationEmitter) bean;

            NotificationListener listener = (notification, handback) -> {
                if (notification.getType().equals(GarbageCollectionNotificationInfo.GARBAGE_COLLECTION_NOTIFICATION)) {
                    GarbageCollectionNotificationInfo info = GarbageCollectionNotificationInfo.from((CompositeData) notification.getUserData());
                    System.out.println(
                            "start: " + info.getGcInfo().getStartTime() + ", duration: " + info.getGcInfo().getDuration() +
                                    "ms, gcName: " + info.getGcName() + ", action: " + info.getGcAction() + ", cause: " + info.getGcCause()
                    );
                }
            };

            emitter.addNotificationListener(listener, null, null);

        }


    }

}
