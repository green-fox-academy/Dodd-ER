public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int secondsInADay = 24 * 60 * 60;
        int currentSecondsInADay = currentSeconds + (currentMinutes * 60) + (currentHours * 60 * 60);
        System.out.println("Seconds in allday: " + secondsInADay);
        System.out.println("Current sec in a day: " + currentSecondsInADay);

        System.out.println("Remaining sec in a day: " + (secondsInADay - currentSecondsInADay));


    }
}
