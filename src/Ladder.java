import java.util.Scanner;
import java.util.Random;

public class Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int people = attendingPeople(sc);
        int ladderHeight=ladderCount(sc);

        String[][] ladder = new String[people+2][ladderHeight];
        for (int i=0;i<ladderHeight;i++) {
            functionladder(people);
            System.out.println();
        }
    }
    private static int attendingPeople(Scanner sc) {
        System.out.print("참여할 사람은 몇명인가요? ");
        int people = Integer.parseInt(sc.next());
        return people;
    }

    private static int ladderCount(Scanner sc) {
        System.out.print("최대 사다리 높이는 몇 개인가요? ");
        int ladderHeight = Integer.parseInt(sc.next());
        return ladderHeight;
    }

    private static void functionladder(int people) {
        for (int j=0;j<people+2;j++) {
            drawingLadder(j);
        }
    }
    private static void drawingLadder(int j) {
        if (j%2== 1) {
            Random random = new Random();
            System.out.print(random.nextBoolean() ? "-" : " ");
        }
        else {
            System.out.print('|');
        }
    }
}
