public class TrafficLight {
    // Constants
    public static final String RED = "Red";
    public static final String GREEN = "Green";

    
    private String color;
    private int duration; 

    // Constructor
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

   
    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }

  
    public void setColor(String color) {
        this.color = color;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    
    public void changeColor(String newColor) {
        this.color = newColor;
    }

    // Method to check if the light is red
    public boolean isRed() {
        return color.equals(RED);
    }

    // Method to check if the light is green
    public boolean isGreen() {
        return color.equals(GREEN);
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(RED, 30);

        // Display initial state
        System.out.println("Initial Traffic Light State:");
        System.out.println("Color: " + trafficLight.getColor());
        System.out.println("Duration: " + trafficLight.getDuration() + " seconds");

        // Change color to green
        trafficLight.changeColor(GREEN);

        // Display updated state
        System.out.println("\nUpdated Traffic Light State:");
        System.out.println("Color: " + trafficLight.getColor());
        System.out.println("Duration: " + trafficLight.getDuration() + " seconds");

        // Check if the light is red
        System.out.println("\nIs the light red? " + trafficLight.isRed());

        // Check if the light is green
        System.out.println("Is the light green? " + trafficLight.isGreen());
    }
}
