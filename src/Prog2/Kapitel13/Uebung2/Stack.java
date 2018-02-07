package Prog2.Kapitel13.Uebung2;

import java.util.ArrayList;

@SuppressWarnings("all") //unterdrueckt alle Warnings
public class Stack extends ArrayList
{
    void push(Object o){
        add(o);
        System.out.println(get(size()-1) + " wurde zum Stack hinzugefügt.");
        System.out.print("So sieht der Stack jetzt aus: ");
        System.out.println(toString());
    }

    void pop(){
        System.out.println(get(size()-1) + " wird vom Stack gelöscht.");
        remove(size()-1);
        System.out.print("So sieht der Stack jetzt aus: ");
        System.out.println(toString());
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(123);
        stack.push("Test");
        stack.push(1.123);
        stack.push("Localhorst");
        System.out.println("");
        stack.pop();
        stack.remove(0);
        System.out.println(stack.toString());
    }
}