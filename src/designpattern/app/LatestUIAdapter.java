package designpattern.app;

public class LatestUIAdapter implements OldUI {
    private final LatestUI latestUI;


    public LatestUIAdapter() {
        this.latestUI = new LatestUI();
    }

    @Override
    public void displayMenus(XmlData xmlData) {
        JsonData jsonData = convertXMLtoJSON(xmlData);
        latestUI.displayMenus(jsonData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JsonData jsonData = convertXMLtoJSON(xmlData);
        latestUI.displayRecommendations(jsonData);
    }


    private JsonData convertXMLtoJSON(XmlData xmlData) {
        //PROCESS/CONVERT
        return new JsonData();
    }
}
