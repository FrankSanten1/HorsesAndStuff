import java.util.ArrayList;

public class HorseRunner {
    public static void main(String[] args) {
        HorseBarn gamingHorsePen = new HorseBarn();
        //int[] randNums = RandomPermutation.next(10);
     
        //System.out.println(java.util.Arrays.toString(randNums));
        System.out.println("OG gaming horses: ");
        System.out.println(gamingHorsePen.getSpaces());

        System.out.println("Randomized gaming horses: ");
        ArrayList<Horse> randomizedGamingHorses = new ArrayList<Horse>();
        randomizedGamingHorses = RandomPermutation.next(gamingHorsePen.getSpaces());
        System.out.println(randomizedGamingHorses);

        System.out.println("Paired up gaming horses:");
        for (int i = 0; i < randomizedGamingHorses.size()/2; i++) {
            System.out.println(randomizedGamingHorses.get(i*2) + " and " + randomizedGamingHorses.get(i*2 + 1));
        }
        if (randomizedGamingHorses.size() % 2 == 1) {
            System.out.println(randomizedGamingHorses.get(randomizedGamingHorses.size()-1) + " is lonely and does not have a partner");
        }
    }
}
