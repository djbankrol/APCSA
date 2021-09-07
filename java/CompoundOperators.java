/*
 * Activity 1.1.4
 */
public class CompoundOperators
{
  public static void main(String[] args)
  {
    int numPeople = 0;  
    double totalYears = 0;
    int gradYear = 13;

    double years = 12.5;// I will soon be halfway through my senior year.
    System.out.println("Years I've spent in school: " + years);
    System.out.println("Years until I graduate: " + (gradYear - (years)));
    numPeople++;

    years+=7.5; // my sister halfway through 7th grade
    System.out.println("Years my sister has spent in school: " + (years - 12.5));
    System.out.println("Years until my sister graduates: " + (gradYear - (years - 12.5)));
    numPeople++;

    years+=9.5; // my brother is halfway through 9th grade
    System.out.println("Years my brother has spent in school: " + (years - 12.5-7.5));
    System.out.println("Years until my sister graduates: " + (gradYear - (years - 12.5 - 7.5)));
    numPeople++;
    totalYears+= years;

    System.out.println(" ");

    System.out.println("My siblings and I have "+ years + " years in school.");
    System.out.print("Total people: " + numPeople);
    System.out.println(", total years: " + totalYears);
    System.out.println("Average amount of years: " + years / 3 + " years");
    System.out.println("Total amount of days spent in school: " + years*180 + " days");
    System.out.println("Average amount of days spent in school: " + (years/3)*180 + " days");
  }
}