package org.mine.aliases;

class Thing {
    private int data;

    public Thing(int data) {
        this.data = data;
    }
}
public class ThingExample {
    public static void main(String[] args) {
        Thing thing1 = new Thing(99);
        Thing thing2 = new Thing(99);
        Thing thing3 = new Thing(100);

        System.out.println(thing1);
        System.out.println(thing2);
        System.out.println(thing3);

        System.out.println(" ");

        System.out.println("Even though with same data, thing1 == thing2 is: ");
        System.out.println(thing1 == thing2);

        System.out.println(" ");

        System.out.println("thing2 == thing3 is:");
        System.out.println(thing2 == thing3);

        System.out.println(" ");

        System.out.println("Primitive Types");
        int x = 99;
        int y = x;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        System.out.println(" ");

        y = 100;
        System.out.println("y = 100; doesn't change x.");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        System.out.println(" ");

        System.out.println("Wrapper Types");

        String string1 = "Hello";
        String string2 = string1;

        System.out.println(string1);
        System.out.println(string2);

        System.out.println(" ");

        string2.concat(" World!!"); // This doesn't change string2
        System.out.println(string1);
        System.out.println(string2);

        System.out.println(" ");

        string2 = string2.concat(" World!!"); // This changes string2
        System.out.println(string1);
        System.out.println(string2);

        System.out.println(" ");

        System.out.println("Using StringBuilder");
        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        StringBuilder stringBuilder2 = stringBuilder1;

        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);

        System.out.println(" ");

        stringBuilder1.append(" World!!"); // This changes both stringBuilder1 and stringBuilder2 because they are both Aliases of same memory location.
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);
    }
}
