package be.intecbrussel.opdrachten.opdrachtqueue;

import java.util.*;

public class QueueApp {

    public static void main(String[] args) {

        Queue<String> names = new LinkedList<>();
        names.offer("Jean-Marie"); //adding an element
        names.offer("Jean-Bart"); //adding an element
        names.offer("Jean-Alexandre"); //adding an element

        System.out.println(names.remove()); // Show the removed element.
        System.out.println(names.remove()); // Show the removed element.
        System.out.println(names.remove()); // Show the removed element.
    }
}
