package enum_1;

public class Test {
    public static void main(String[] args) {
        printInfo(Sex.BOY);

    }

    private static void printInfo(Sex sex) {
        switch (sex) {
            case BOY:
                System.out.println("玄幻,修仙,科技");
                break;
            case GIRL:
                System.out.println("都市,言情");
                break;
        }
    }
}

enum Sex {
    BOY, GIRL;
}
