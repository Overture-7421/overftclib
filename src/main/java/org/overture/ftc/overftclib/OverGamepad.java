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

public interface OverGamepad {
    //boolean isButtonPressed(Button button);
    double getLeftStickX();
    double getLeftStickY();
    double getRightStickX();
    double getRightStickY();
    double getLeftTrigger();
    double getRightTrigger();

    /*enum Button {
        A, B, X, Y, LEFT_BUMPER, RIGHT_BUMPER, BACK, START, LEFT_STICK_BUTTON, RIGHT_STICK_BUTTON
    }*/
}
