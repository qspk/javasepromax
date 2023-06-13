package enum_1;

public class Demo {
    public static void main(String[] args) {
        showSeason(Season.SPRING);
        showSeason(Season.SUMMER);
        showSeason(Season.AUTUMN);
        showSeason(Season.WINTER);
    }

    private static void showSeason(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("春暖花开");
                break;
            case SUMMER:
                System.out.println("烈日如火");
                break;
            case AUTUMN:
                System.out.println("落英缤纷");
                break;
            case WINTER:
                System.out.println("白雪皑皑");
                break;
        }
    }
}

enum Season {
    SPRING,SUMMER,AUTUMN, WINTER;
}