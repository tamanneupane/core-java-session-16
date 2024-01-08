package immutable;

public final class President {
    private final String name;
    private final int age;

    private President(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static President createPresident(String name, int age) {
        return new President(name, age);
    }
}


