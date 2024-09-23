package org.overture.ftc.overftclib;

import java.awt.*;

/**
 * Used to target a fixed update rate, default of 20ms, so wpilib controllers can work correctly.
 * Meant to be used with LinearOpMode.
 */
public class RobotTimerWatchdog {
    private long TIME = System.nanoTime();
    private final long periodMs;

    /**
     *
     * @param periodMs Time between loops
     */
    RobotTimerWatchdog(long periodMs){
        this.periodMs = periodMs;
    }

    RobotTimerWatchdog() {
        this.periodMs = 20;
    }

    /**
     * Used to start the timer
     */
    public void Start() {
        TIME = System.nanoTime();
    }

    /**
     * Use to wait until the next timestep, if needed
     * @throws InterruptedException If any thread has interrupted the current thread. The interrupted status of the current thread is cleared when this exception is thrown
     */
    public void WaitForTimeStep() throws InterruptedException {
        long currentTime = System.nanoTime();
        long timeDelta = currentTime - TIME;
        long timeDeltaMs = (long) (timeDelta / 1e6);
        long timeToWait = periodMs - timeDeltaMs;

        if(timeToWait > 0) {
            Thread.sleep(timeToWait);
        }
    }
}
