package org.example;

public interface MyList {
    boolean isEmpty();
    int size();
    boolean contains(String str);
    void add(String str);
    boolean remove(String o);
    void clear();
    String get(int index);
    String set(int index, String element);
    void add(int index, String element);
    String remove(int index);
    int indexOf(String o);
}
