package org.example.common;

public class Pair<K, V> {

    public K getKey() {
        return key;
    }

    public Pair(){}

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    private K key;
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public String toString(){
        return "{key=>" + key + " & value=> " + value + "}";
    }



}
