package com.revature.customlistdemo;

public interface MyCustomList<E> {
    int size();
    boolean empty();
    void add(E e);
    void add(E e, int index);
    void remove(E e);
    void remove(int index);
    E get(int index);
    int find(E e);
    void clear();
    void replace(E e, int index);

}
