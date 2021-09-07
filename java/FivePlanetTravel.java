public class FivePlanetTravel {
    public static void main(String[] args) {
        // theplanets.org average distance from earth to the planets
        int mercury = 56974146;
        int venus = 25724767;
        int mars = 48678219;
        int jupiter = 390674710;
        int saturn = 792248270;

        // number of planets to visit
        int numPlanets = 5;

        // speed of light and our speed
        int lightSpeed =  670616629;
        lightSpeed /= 10;

        // total travel time
        double total = 0;

        System.out.println("Travel time to Mercury: " + (double) mercury/lightSpeed + " hours.");
        total += (double) mercury / lightSpeed;


        System.out.println("Travel time to Venus: " + (double ) venus/lightSpeed + " hours.");
        total += (double) venus/lightSpeed;

        System.out.println("Travel time to Mars: " + (double ) mars/lightSpeed + " hours.");
        total += (double) mars/lightSpeed;

        System.out.println("Travel time to Jupiter: " + (double ) jupiter/lightSpeed + " hours.");
        total += (double) jupiter/lightSpeed;

        System.out.println("Travel time to Saturn: " + (double ) saturn/lightSpeed + " hours.");
        total += (double) saturn/lightSpeed;

        System.out.println(" Total time travelled over the course of the tour: "+ total + " hours.");

        int average = (int) ((total + 0.5) / numPlanets);
        System.out.println("Average travel time: " + average + " hours");
    }
}
