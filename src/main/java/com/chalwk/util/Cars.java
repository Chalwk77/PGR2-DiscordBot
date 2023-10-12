/* Copyright (c) 2023, PGR2-Bot. Jericho Crosby <jericho.crosby227@gmail.com> */
package com.chalwk.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cars {

    public static Map<String, ArrayList> carsMap = new HashMap<>();

    public static void populateCars() {
        carsMap.put("Compact Sports", compactSports);
        carsMap.put("Sports Convertible", sportsConvertible);
        carsMap.put("Coupe", coupe);
        carsMap.put("Sport Utility", sportUtility);
        carsMap.put("Pacific Muscle", pacificMuscle);
        carsMap.put("Roadster", roaster);
        carsMap.put("Classic", classic);
        carsMap.put("Sports Coupe", sportsCoupe);
        carsMap.put("American Muscle", americanMuscle);
        carsMap.put("Super Car", superCar);
        carsMap.put("Grand Touring", grandTouring);
    }

    public static ArrayList<String> compactSports = new ArrayList<>() {{
        add("Lancia Delta Integrale Evo");
        add("Volkswagen R32");
        add("Renault Clio V6");
        add("Honda Civic Type-R (J)");
        add("Ford Focus RS");
        add("Volkswagen New Beetle RSi");
        add("Seat Leon Cupra R");
        add("MINI Cooper S");
    }};

    public static ArrayList<String> sportsConvertible = new ArrayList<>() {{
        add("BMW Z4 3.0i");
        add("Honda S2000");
        add("Porsche Boxster S");
        add("Toyota MR2 Spyder");
        add("Mazda Miata MX-5");
        add("Audi TT Roadster");
    }};
    public static ArrayList<String> coupe = new ArrayList<>() {{
        add("Audi TT 3.2 Quattro");
        add("BMW M3");
        add("Audi S4");
        add("Nissan 350Z");
        add("Honda Integra Type-R (J)");
        add("Mazda RX-8");
        add("Audi TT Coupe");
    }};
    public static ArrayList<String> sportUtility = new ArrayList<>() {{
        add("Ford SVT Lighting");
        add("BMW X5 4.6is");
        add("Porsche Cayenne Turbo");
        add("Mercedes-Benz ML55 AMG");
        add("Chevrolet SSR");
        add("Volvo XC90");
    }};
    public static ArrayList<String> pacificMuscle = new ArrayList<>() {{
        add("Nissan Skyline GT-R (R34) Nür");
        add("Subaru Impreza WRX STi");
        add("Toyota Supra Twin-Turbo");
        add("Mazda RX-7");
        add("Mitsubishi Lancer Evolution VII");
        add("Mitsubishi 3000 GT VR4");
    }};
    public static ArrayList<String> roaster = new ArrayList<>() {{
        add("AC 427 MKII");
        add("Renault Spider");
        add("Caterham 7 Classic");
        add("Lotus 340R");
        add("Lotus Elise");
        add("Vauxhall VX220");
    }};
    public static ArrayList<String> classic = new ArrayList<>() {{
        add("Ferrari 250 GTO *Bronze");
        add("Lancia Stratos");
        add("Ferrari Dino 246 GT");
        add("Ferrari 275 GB");
        add("Porsche 911 RS 2.7");
        add("Mercedes 300SL Gullwing");
        add("Jaguar E-Type");
        add("Porsche 550 Spyder");
        add("Nissan 240Z");
        add("Toyota 2000GT");
    }};
    public static ArrayList<String> sportsCoupe = new ArrayList<>() {{
        add("Trident Iceni");
        add("Porsche 911 Carrera Coupe (996)");
        add("Morgan Aero 8");
        add("Cadillac XLR");
        add("TVR Tamora");
        add("Audi RS6");
        add("Jaguar XKR");
        add("Lexus SC 430");
    }};
    public static ArrayList<String> americanMuscle = new ArrayList<>() {{
        add("Pontiac Trans Am");
        add("Chevrolet Camaro Z/28");
        add("Ford Mustang SVT Cobra");
        add("Ford Mustang Fastback 2+2");
        add("Chevrolet Camaro SS");
        add("Chevrolet Corvette Stingray");
        add("Pontiac GTO");
    }};
    public static ArrayList<String> superCar = new ArrayList<>() {{
        add("Ferrari 355 F1");
        add("Porsche 911 Turbo (996)");
        add("Chevrolet Corvette Z06");
        add("Dodge Viper GTS");
        add("Ferrari 360 Modena");
        add("Ferrari 360 Spider");
        add("TVR Tuscan Speed 6");
        add("Delfino Feroce *Steel");
    }};
    public static ArrayList<String> grandTouring = new ArrayList<>() {{
        add("Lotus Esprit V8");
        add("Aston Marton Vanquish");
        add("Ferrari 575M Maranello");
        add("Mercedes-Benz SL55 AMG");
        add("Maserati 4200GT *Xbox Live");
        add("Ferrari 550 Barchetta");
        add("Ferrari Testarossa");
        add("Bentley Continental GT");
    }};
}