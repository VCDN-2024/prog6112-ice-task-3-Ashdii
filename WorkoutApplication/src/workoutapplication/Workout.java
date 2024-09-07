package workoutapplication;

// Abstract class Workout that defines the blueprint for a workout routine
abstract class Workout {
    // Fields to store workout details
    private String exercises;
    private int duration;
    private int intensityLevel;

    // Constructor to initialize workout details
    public Workout(String exercises, int duration, int intensityLevel) {
        this.exercises = exercises;
        this.duration = duration;
        this.intensityLevel = intensityLevel;
    }

    // Get method to retrieve exercises
    public String getExercises() {
        return exercises;
    }

    // Get method to retrieve duration in minutes
    public int getDuration() {
        return duration;
    }

    // Get method to retrieve intensity level
    public int getIntensityLevel() {
        return intensityLevel;
    }
}