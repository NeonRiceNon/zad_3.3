package com.company;
//часть1
public enum vrGoda {

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
