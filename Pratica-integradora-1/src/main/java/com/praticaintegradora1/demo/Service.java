package com.praticaintegradora1.demo;

public class Service {
    public String convertToRoman(Integer number) {
        Integer qtdM = 0;
        Integer qtdD = 0;
        Integer qtdC = 0;
        Integer qtdL = 0;
        Integer qtdX = 0;
        Integer qtdV = 0;
        Integer qtdI = 0;

        Integer restoMil = number%1000;
        if (restoMil != number) {
            qtdM = number/1000;
        }

        Integer restoQuinhentos = restoMil%500;
        if (restoQuinhentos != restoMil) {
            qtdD = restoMil/500;
        }

        Integer restoCem = restoQuinhentos%100;
        if (restoCem != restoQuinhentos) {
            qtdC = restoQuinhentos/100;
        }

        Integer restoCinquenta = restoCem%50;
        if (restoCinquenta != restoCem) {
            qtdL = restoCem/50;
        }

        Integer restoDez = restoCinquenta%10;
        if (restoDez != restoCinquenta) {
            qtdX = restoCinquenta/10;
        }

        Integer restoCinco = restoDez%5;
        if (restoCinco != restoDez) {
            qtdV = restoDez/5;
        }

        qtdI = restoCinco;

        String eme = "";
        String de = "";
        String ce = "";
        String ele = "";
        String xis = "";
        String ve = "";
        String ih = "";

        for (int i = 0; i <= qtdM; i++) {
            if (i != 0) {
                eme +="M";
            }
        }

        for (int i = 0; i <= qtdD; i++) {
            if (i != 0) {
                de += "D";
            }
        }

        for (int i = 0; i <= qtdC; i++) {
            if (i != 0) {
                ce +="C";
            }
        }

        for (int i = 0; i <= qtdL; i++) {
            if (i != 0) {
                ele += "L";
            }
        }

        for (int i = 0; i <= qtdX; i++) {
            if (i != 0) {
                xis += "X";
            }
        }

        for (int i = 0; i <= qtdV; i++) {
            if (i != 0) {
                ve += "V";
            }
        }

        for (int i = 0; i <= qtdI; i++) {
            if (i != 0) {
                ih += "I";
            }
        }

        return eme.concat(de).concat(ce).concat(ele).concat(xis).concat(ve).concat(ih);
    }
}
