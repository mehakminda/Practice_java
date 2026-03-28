package com.test.designPattern.interview.DeisgnTicTacToe.model;

public class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    // You should also override equals() and hashCode() for proper behavior in collections
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair<?, ?> Pair = (Pair<?, ?>) o;
        return java.util.Objects.equals(key, Pair.key) &&
                java.util.Objects.equals(value, Pair.value);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(key, value);
    }
}