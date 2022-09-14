package com.company;
import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a;
        a = "Summer is the warmest time of the year.";
       // System.out.println(a);

    }

    public void two(vrGoda b) {
        b = vrGoda.Winter;

        switch (b) {
            case Spring:
                System.out.println("I love winter");
                break;
            case Winter:
                System.out.println("I love spring");
                break;
            case Summer:
                System.out.println("I love summer");
                break;
            case Autumn:
                System.out.println("I love autumn");
                break;
        }
    }

    public class Winter extends Main {
        public void getDescription(String time) {
            time = "Cold season";
            System.out.println(time);
        }
    }

    public class Summer extends Main {
       // @Override
        public void getDescription(String time) {
            time = "Warm season";
            System.out.println(time);
        }
    }

    public class info{
        public void info (vrGoda[] String ) {
            String[] b = new String[4];
            b[1] = "Ср.температура = -15; " +
                    " Холодное время года и много сугробов";
            b[2] = "Ср.температура =10; "
                    + "Теплое время года, когда все расцветает";
            b[3] = "Ср.температура = 20; " +
                    " Жаркое время года и много свежих овощей и фруктов";
            b[4] = "Ср.температура = 5; " +
                    "Дождливое время года с разноцветными листьями";

            int i;
            for (i = 0; i < 5; i++)
            System.out.println(b[i]);
        }
    }
}

enum vrGoda{
    Winter{
        int sr = -15;
        String a = "холодное время года и много сугробов";
    },
    Spring{
        int sr = 10;
        String a = "теплое время года, когда все расцветает";
    },
    Summer{
        int sr = 20;
        String a = "жаркое время года и много свежих овощей и фруктов";
    },
    Autumn{
        int sr = 5;
        String a = "дождливое время года с разноцветными листьями";
    };
}