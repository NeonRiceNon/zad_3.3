package com.company;

public class two {
    public static void two(vrGoda b) {
        b = vrGoda.Winter;
        String li;

        switch (b) {
            case Spring:
                li = "I love Spring";
                System.out.println(li);
                break;
            case Winter:
                li = "I love Winter";
                System.out.println(li);
                break;
            case Summer:
                li = "I love Summer";
                System.out.println(li);
                break;
            case Autumn:
                li = "I love Autumn";
                System.out.println(li);
                break;
        }
        //System.out.println(li);
    }
}
