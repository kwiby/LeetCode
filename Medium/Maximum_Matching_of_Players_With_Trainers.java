package Medium;

import java.util.Arrays;

public class Maximum_Matching_of_Players_With_Trainers {
    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int count = 0;

        Arrays.sort(players);
        Arrays.sort(trainers);

        int a = players.length - 1;
        int b = trainers.length - 1;

        while (a >= 0 && b >= 0) {
            if (players[a] <= trainers[b]) {
                count++;
                b--;
            }
            a--;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] players = {1, 1, 1};
        int[] trainers = {10};

        System.out.println(matchPlayersAndTrainers(players, trainers));
    }
}