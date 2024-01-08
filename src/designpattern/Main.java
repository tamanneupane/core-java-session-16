package designpattern;

import designpattern.app.LatestUIAdapter;
import designpattern.app.MobileApp;
import designpattern.app.XmlData;

public class Main {
    public static void main(String[] args) {


        MobileApp mobileApp = new MobileApp();
        mobileApp.displayMenus(new XmlData());
        mobileApp.displayRecommendations(new XmlData());


        LatestUIAdapter mobileApp2 = new LatestUIAdapter();
        mobileApp2.displayMenus(new XmlData());
        mobileApp2.displayRecommendations(new XmlData());


//        President president1 = President.getPresident("joe");
//
//        President president2 = President.getPresident("trump");
//
//
//        President president3 = president2;
//
//
//        System.out.println(president1.getName());
//        System.out.println(president2.getName());
//        System.out.println(president3.getName());
    }
}
