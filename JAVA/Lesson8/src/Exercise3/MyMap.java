package Exercise3;

public class MyMap <K,V>{
    private K key;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    private V value;

    public MyMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public MyMap() {
    }

    @Override
    public String toString() {
        return "MyMap{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
