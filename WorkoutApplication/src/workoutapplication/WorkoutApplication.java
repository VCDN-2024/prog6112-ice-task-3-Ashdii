package workoutapplication;

// Main class WorkoutApplication to run the application
public class WorkoutApplication {
    public static void main(String[] args) {
        
        // Prompt the user to enter workout details
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("Enter exercises: ");
            String exercises = scanner.nextLine();
            
            System.out.print("Enter duration (in minutes): ");
            int duration = scanner.nextInt();
            
            System.out.print("Enter intensity level (1-10): ");
            int intensityLevel = scanner.nextInt();

            // Create an instance of ProcessWorkout with the provided details
            ProcessWorkout workout = new ProcessWorkout(exercises, duration, intensityLevel);
            
            // Call the printWorkout method to display the details
            workout.printWorkout();
        } // Scanner resource is automatically closed here
    }
}
