/* 
 * Activity 1.1.3
 */
public class GalaxyWeight
{
  public static void main(String[] args)
  {
    int weightOnEarth = 130;
    double earthGravity = 9.81;
    double mercuryGravity = 3.59;
    double venusGravity = 8.87;
    double marsGravity = 3.711;
    double jupiterGravity = 24.79;
    double saturnGravity = 11.08;
    double uranusGravity = 10.67;
    double neptuneGravity = 11.15;
    
    double weightOnMercury = weightOnEarth * mercuryGravity / earthGravity;
    System.out.println("Weight on Mercury: " + weightOnMercury + " lbs");
    
    double weightOnVenus = weightOnEarth * venusGravity / earthGravity;
    System.out.println("Weight on Venus: " + weightOnVenus+ " lbs");
    
    double weightOnMars = weightOnEarth * marsGravity / earthGravity;
    System.out.println("Weight on Mars: " + weightOnMars + " lbs");

    double weightOnJupiter = weightOnEarth * jupiterGravity / earthGravity;
    System.out.println("Weight on Jupiter: " + weightOnJupiter + " lbs");

    double weightOnSaturn = weightOnEarth * saturnGravity / earthGravity;
    System.out.println("Weight on Saturn: " + weightOnSaturn + " lbs");

    double weightOnUranus = weightOnEarth * uranusGravity / earthGravity;
    System.out.println("Weight on Uranus: " + weightOnUranus + " lbs");

    double weightOnNeptune = weightOnEarth * neptuneGravity / earthGravity;
    System.out.println("Weight on Neptune: " + weightOnNeptune + " lbs");
    System.out.println(" ");

    System.out.println("Average of all weights: ");
    double average = (weightOnMercury + weightOnVenus + weightOnMars + weightOnJupiter + weightOnSaturn + weightOnUranus + weightOnNeptune) / 2;
    System.out.println(average + " lbs");
  }
}