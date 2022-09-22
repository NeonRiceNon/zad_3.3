package com.company;

public interface PlayInstrument {
    String KEY = "До мажор";

    String[] Instruments = new String[]{"Musical Trument", "Guitar", "Drum"};
    String[] InsrInfo = new String[]{ "Играет Труба с диаметром 5см", "Играет гитара с семью струнами", "Играет барабан размером в 60см"};

        default void play() {
            for (int i=0; i==2; i++){
                System.out.println(InsrInfo[i]);
            }
        }
}
