package workoutapplication;

// ProcessWorkout class that extends Workout and implements IWorkout
class ProcessWorkout extends Workout implements IWorkout {

    // Constructor to initialize workout details using the parent class constructor
    public ProcessWorkout(String exercises, int duration, int intensityLevel) {
        super(exercises, duration, intensityLevel);
    }

    // Method to display the workout details
    @Override
    public void printWorkout() {
        System.out.println("Workout Details:");
        System.out.println("Exercises: " + getExercises());
        System.out.println("Duration: " + getDuration() + " minutes");
        System.out.println("Intensity Level: " + getIntensityLevel());
    }
}
