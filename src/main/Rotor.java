package main;

public abstract class Rotor {
    float MaxSpeed;
    float CurrentSpeed;

    public float getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public float getCurrentSpeed() {
        return CurrentSpeed;
    }

    public void setCurrentSpeed(float currentSpeed) {
        CurrentSpeed = currentSpeed;
    }

    abstract void Stop();
    abstract void Start();

}
