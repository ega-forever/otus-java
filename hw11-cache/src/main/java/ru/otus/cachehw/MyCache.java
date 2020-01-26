package ru.otus.cachehw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author sergey
 * created on 14.12.18.
 */
public class MyCache<K, V> implements HwCache<K, V> {

    Map<K, V> cache = new WeakHashMap<>();
    List<HwListener<K, V>> listeners = new ArrayList<>();

    @Override
    public void put(K key, V value) {
        for (HwListener<K, V> listener : this.listeners) {
            listener.notify(key, value, ListenerActions.INSERT.getAction());
        }

        this.cache.put(key, value);
    }

    @Override
    public void remove(K key) {
        for (HwListener<K, V> listener : this.listeners) {
            listener.notify(key, null, ListenerActions.DELETE.getAction());
        }

        this.cache.remove(key);
    }

    @Override
    public V get(K key) {
        V value = this.cache.get(key);

        for (HwListener<K, V> listener : this.listeners) {
            listener.notify(key, value, ListenerActions.SELECT.getAction());
        }
        return value;
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
