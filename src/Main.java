public class Main {
    public static void main(String[] args) {
        int[] votes = {1, 2, 34, 5, 6, 7, 8, 9, 10, 11, 12, 13, 34, 15};
        int userWithMostVotes = mostVotes(votes);
        System.out.println("User with the most votes is User: " + userWithMostVotes);
    }

    /**
     * Finds the user that has most number of votes.
     */
    public static int mostVotes(int[] votesPerUser) {
        // Assumes the first user has the most votes.
        int votes = votesPerUser[0];

        // Stores the user that has most number of votes.
        int userId = 0;

        for (int i = 1; i < votesPerUser.length; i++) {
            if (votesPerUser[i] > votes) {
                votes = votesPerUser[i];
                userId = i;
            }
        }
        return userId;
    }
}