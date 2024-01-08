package designpattern1.app;

public class MobileApp implements OldUI {
    @Override
    public void displayMenus(XmlData xmlData) {
        System.out.println("OLD MENUS");
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        System.out.println("OLD MENUS");
    }
}
