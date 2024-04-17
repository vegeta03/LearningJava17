package org.mine.handling_text;

public class StringIdentityPooling {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
        System.out.println("s1 == s2? " + (s1 == s2));

        System.out.println(" ");

        System.out.println("s1 : " + s1);
        String s3 = "He";
        System.out.println("s3 : " + s3);
        s3 = s3 + "llo";
        System.out.println("s3 + 'llo' : " + s3);
        System.out.println("s1 == s3? " + (s1 == s3));

        System.out.println(" ");

        System.out.println("s1 : " + s1);
        final String final_s3 = "He";
        System.out.println("final_s3 : " + final_s3);
        String s4 = final_s3 + "llo";
        System.out.println("s4 = final_s3 + 'llo' : " + s4);
        System.out.println("s1 == s4? " + (s1 == s4));

        System.out.println(" ");

        String s5 = s3.intern();
        System.out.println("s5 = s3.intern(); : " + s5);
        System.out.println("s1 == s5? " + (s1 == s5));

    }
}
