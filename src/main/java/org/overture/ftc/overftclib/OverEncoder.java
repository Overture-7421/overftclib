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

public interface OverEncoder {
    void reset();
    int getCurrentPosition();
    double getVelocity();
    double getDistance();
    boolean isAtTargetPosition(int targetPosition);
    void setTargetPosition(int targetPosition);
}
