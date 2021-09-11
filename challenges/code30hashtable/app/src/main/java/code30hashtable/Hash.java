package code30hashtable;

public class Hash {
    public String key;
    public int value;
    public Hash next;


    public Hash(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Hash getNext() {
        return next;
    }

    public void setNext(Hash next) {
        this.next = next;
    }
}
