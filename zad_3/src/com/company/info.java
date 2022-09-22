package com.company;

public class info {
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
}
