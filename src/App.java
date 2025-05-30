import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String[] drinks = {"Portillo's", "Chic-Fil-A", "Starbucks", "Dunkin Donuts", "Kwik Trip", "7-Eleven"};
        String[] apps = {"Arby's", "Culver's", "Dairy Queen", "Cousins", "Panera"};
        String[] mainCourses = {"Arby's", "Taco Bell", "McDonald's", "Culver's", "Qdoba", "Portillo's", 
        "Dairy Queen", "Noodles", "Subway", "Cousins", "Chic-Fil-A", "Canes", "Panda Express", "Oscars",
        "Burger King", "Panera", "Dominos", "Kopps"};
        String[] desserts = {"Culver's", "Dairy Queen", "Oscars", "Crumbl", "Dunkin Donuts", "Fro-yo", "Kopps"};
        int drink = (int) Math.round(Math.random()*(drinks.length - 1));
        int app = (int) Math.round(Math.random()*(apps.length - 1));
        int mainCourse = (int) Math.round(Math.random()*(mainCourses.length - 1));
        int dessert = (int) Math.round(Math.random()*(desserts.length - 1));

        if(drinks[drink].equals(apps[app]) || drinks[drink].equals(mainCourses[mainCourse]) || drinks[drink].equals(desserts[dessert])){
            drink++;
        }

        if(apps[app].equals(mainCourses[mainCourse]) || apps[app].equals(desserts[dessert]) && app != apps.length){
            app++;
        }
        else if(apps[app].equals(mainCourses[mainCourse]) || apps[app].equals(desserts[dessert])){
            app--;
        }

        if(mainCourses[mainCourse].equals(desserts[dessert]) && mainCourse != mainCourses.length){
            mainCourse++;
        }
        else if(mainCourses[mainCourse].equals(desserts[dessert])){
            mainCourse--;
        }


        System.out.println(drinks[drink]);
        System.out.println(apps[app]);
        System.out.println(mainCourses[mainCourse]);
        System.out.println(desserts[dessert]);

    }
}
