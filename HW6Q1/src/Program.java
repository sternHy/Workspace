import java.util.*;

public class Program {

    public static void main(String[] args) {
        List<String> votes = Arrays.asList("BB", "BB", "Bb", "aA", "CCC", "aa", "cCc", "aa", "dddd", "bb", "bb");
        int result = result(votes, 2);
        System.out.println("Returned: " + result);
    }

    public static int result(List<String> votes, int block) {
        HashMap<String, Integer> scores = new HashMap<>();
        for (String vote : votes) {
            String party = vote.toLowerCase();
            scores.put(party, scores.getOrDefault(party, 0) + 1);
        }
        System.out.println("Parties that didn't pass the block:");
        for (String i : scores.keySet()) {
            if (scores.get(i) < block)
                System.out.println(i);
        }
        System.out.println("Parties that did pass the block:");
        for (String i : scores.keySet()) {
            if (scores.get(i) >= block)
                System.out.println(i + ":" + scores.get(i));
        }
        String biggestParty = "";
        int maxVotes = 0;
        for (String party : scores.keySet()) {
            if (scores.get(party) > maxVotes) {
                maxVotes = scores.get(party);
                biggestParty = party;
            }
        }

        System.out.println("The biggest party");
        System.out.println(biggestParty);

        return maxVotes;
    }
}
