package ru.otus.cachehw;

import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author sergey
 * created on 14.12.18.
 */
public class MyCache<K, V> implements HwCache<K, V> {

    private Map<K, V> cache = new WeakHashMap<>();
    private List<HwListener<K, V>> listeners = new ArrayList<>();
    private Logger logger;

    public MyCache(Logger logger) {
        this.logger = logger;
    }


    @Override
    public void put(K key, V value) {
        this.cache.put(key, value);
        this.notifyAll(key, value, ListenerActions.INSERT);
    }

    @Override
    public void remove(K key) {
        this.cache.remove(key);
        this.notifyAll(key, null, ListenerActions.INSERT);
    }

    @Override
    public V get(K key) {
        V value = this.cache.get(key);
        this.notifyAll(key, value, ListenerActions.SELECT);
        return value;
    }

    private void notifyAll(K key, V value, ListenerActions action) {
        for (HwListener<K, V> listener : this.listeners) {
            try {
                listener.notify(key, value, action.getAction());
            } catch (Exception e) {
                logger.error(e.toString());
            }
        }
    }

    @Override
    public void addListener(HwListener<K, V> listener) {
        this.listeners.add(listener);
    }

    @Override
    public void removeListener(HwListener<K, V> listener) {
        this.listeners.remove(listener);
    }
}
