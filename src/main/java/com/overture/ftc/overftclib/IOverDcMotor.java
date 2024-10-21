/*
 * Overftclib
 * Written by: Santiago Quintana
 * Owned By: Overture Robotics Group.
 *
 * The following Interface is provided as-is in the intention of a long-term modern FTC Library that integrates WPILibJava
 * devices, logic and references.
 *
 * All rights reserved 2024. (R) OVERTURE ROBOTICS GROUP
 * */

package com.overture.ftc.overftclib;

public interface IOverDcMotor {
    public void setPower(double power);
    public double getPower();
    public Direction getDirection();
    public void setMode(RunMode mode);
    public void setZeroPowerBehavior(ZeroPowerBehavior zeropowerbehavior);
    public void setTargetPosition(int position);
    public int getTargetPosition();
    public int getCurrentPosition();
    public void setDirection(Direction direction);

    public  enum Direction {
        FORWARD, REVERSE
    }
    public  enum RunMode {
        RUN_WITHOUT_ENCODER, RUN_USING_ENCODER, RUN_TO_POSITION, STOP_AND_RESET_ENCODER
    }
    public  enum ZeroPowerBehavior {
        UNKNOWN, BRAKE, FLOAT
    }

}

