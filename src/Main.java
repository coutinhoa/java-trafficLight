import java.util.Scanner;

public class Main {


    // status - prints red, yellow or green
    // next - goes to the next color (red -> green, green -> yellow, yellow -> red)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type status to see the colour of the traffic light and next to change to the next colour");
        TrafficLight trafficlight = new TrafficLight();

        while(true) {
            String input= scanner.nextLine();

            if(input.equals("")) {
                System.out.println("Traffic light is not working.");
                return;
            }
            else if(input.equals("status")) {
                    System.out.println(String.format("colour is %s",trafficlight.getColour()));
            }
            else if(input.equals("next")) {
                trafficlight.next();
                System.out.println("traffic light changed to " + String.format("colour is %s",trafficlight.getColour()));
            }
        }

    }

}