package com.example.generics;

import java.util.HashMap;
import java.util.Map;

class Pair<K, V> {
    private Map<K, V> map = new HashMap<K, V>();

    public void addKeyValue(K key, V value) {
        map.put(key, value);
    }

    public V getValue(K key) {
        return map.get(key);
    }
}