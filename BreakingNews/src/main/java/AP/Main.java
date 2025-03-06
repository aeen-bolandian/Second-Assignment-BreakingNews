package AP;

public class Main {
    public static void main(String[] args) {
        String API_KEY = "84a6150bee504d0a9f2a62aedfb226d8";
        Infrastructure infrastructure = new Infrastructure(API_KEY);
        infrastructure.displayNewsList();
    }
}