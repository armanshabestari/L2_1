package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nPrint 'BENZ' to see models information.");
        Scanner input=new Scanner(System.in);
        String enter;
        Cla_200 cla200=new Cla_200("CLA 200",2015,1595,154,230,5.5);
        E_250 e250=new E_250("E 250",2014,1991,211,243,5.8);
        S_500 s500=new S_500("S 500",2019,4663,445,250,8.6);
        enter=input.next();
        if (enter.equals("BENZ")){

            System.out.println("1)Model\n2)Year\n3)Displacement (cc)\n4)Power (Hp)\n5)TopSpeed (Km/h)\n6)Fuel (L/100 Km)");
            System.out.println("----------------");
            cla200.display();
            System.out.println("----------------");
            e250.display();
            System.out.println("----------------");
            s500.display();
        }
        else{
            System.out.println("\nERROR!");
        }
    }
}
