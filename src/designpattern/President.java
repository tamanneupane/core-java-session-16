package designpattern1;

public class President {
    private final String name;
    private static President president;


    public static President getPresident(String name) {
        if (president == null) {
            president = new President(name);
        }
        return president;
    }

    private President(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
