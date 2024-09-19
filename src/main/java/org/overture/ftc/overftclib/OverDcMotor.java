/*
 * OverFTCLib
 * Written by: Santiago Quintana
 * Owned By: Overture Robotics Group.
 *
 * The following Interface is provided as-is in the intention of a long-term modern FTC Library that integrates WPILibJava
 * devices, logic and references.
 *
 * All rights reserved 2024. (R) OVERTURE ROBOTICS GROUP
 * */

package org.overture.ftc.overftclib;

public interface OverDcMotor {
    void setPower(double power);
    double getPower();
    void setDirection(Direction direction);
    Direction getDirection();
    void setMode(RunMode mode);

    enum Direction {
        FORWARD, REVERSE
    }
    enum RunMode {
        RUN_WITHOUT_ENCODER, RUN_USING_ENCODER, RUN_TO_POSITION, STOP_AND_RESET_ENCODER
    }

}

