package lab6sortedlist;

/* Keyable.java */

public interface Keyable {
    public int getKey();
    public boolean lessThan(Keyable x);
}