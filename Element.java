package Proiect_SP;

import java.util.LinkedList;
import java.util.List;

public abstract class Element {
    Element parent;
    abstract void print();

    abstract void add(Element el);
    abstract void remove(Element el);
    abstract Element get(int num);
}
