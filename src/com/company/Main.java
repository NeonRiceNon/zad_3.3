package com.company;

public class Main {
    public static void main(String[] args) {
        vrGoda b = vrGoda.Summer;
        System.out.println( b + " is the warmest time of the year." );
        two(vrGoda.Winter);
        info();


        SrTemp season = new SrTemp(-15, 10, 20, 5); //использование конструктора


    }
        public static void two(vrGoda b) {
            b = vrGoda.Winter;

            switch (b) {
                case Spring:
                    System.out.println("I love spring");
                    break;
                case Winter:
                    System.out.println("I love winter");
                    break;
                case Summer:
                    System.out.println("I love summer");
                    break;
                case Autumn:
                    System.out.println("I love autumn");
                    break;
            }
        }
            public static void info () {

            String[] b = new String[5];
            b[1] = vrGoda.Winter +" - " + "Ср.температура = -15; " +
                " Холодное время года и много сугробов";
            b[2] = vrGoda.Spring+" - " + "Ср.температура =10; "
                + "Теплое время года, когда все расцветает";
            b[3] = vrGoda.Summer+" - " + "Ср.температура = 20; " +
                " Жаркое время года и много свежих овощей и фруктов";
            b[4] = vrGoda.Autumn+" - " + "Ср.температура = 5; " +
                "Дождливое время года с разноцветными листьями";

            int i;
            for (i = 0; i <= 4; i++)
                System.out.println(b[i]);
            }

            public void getDescription(){
                String a ="Холодное время года";
                return;
            }
    }

enum vrGoda {   //перечисление
    Winter {
        int sr = -15;
        String a = "холодное время года";
    },
    Spring {
        int sr = 10;
        String a = "теплое время года";
    },
    Summer {
        int sr = 20;
        String a = "жаркое время года";
        //@Override
        public String getDescription(){
            return "Теплое время года";
        }
    },
    Autumn {
        int sr = 5;
        String a = "дождливое время года";
    };
}