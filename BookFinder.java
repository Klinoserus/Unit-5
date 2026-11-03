public class BookFinder {

    static void book(int shelfNum) {
        if (shelfNum == 1) {
            System.out.println("The Three Body Problem (Cixin Liu)");
        } else if (shelfNum == 2) {
            System.out.println("The Dark Forest (Cixin Liu)");
        } else if (shelfNum == 3) {
            System.out.println("Death's End (Cixin Liu)");
        } else {
            System.out.println("The Wandering Earth (Cixin Liu)");
        }
    }

    public static void main(String[] args) {
        book(1);
        book(3);
    }
}
