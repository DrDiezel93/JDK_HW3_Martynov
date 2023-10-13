package Task3_3;

public class Main {
    public static void main(String[] args) {
        Pair <String, String> pair = new Pair<>("Hello", "World");
        System.out.println(pair);
        String first = pair.getFirst();
        String sec = pair.getSecond();
        System.out.println(first);
        System.out.println(sec);
    }
}
