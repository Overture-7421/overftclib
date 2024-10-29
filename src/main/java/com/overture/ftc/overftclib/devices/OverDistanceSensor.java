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

package com.overture.ftc.overftclib.devices;

public interface OverDistanceSensor extends OverGenericSensor {
    double getDistance(DistanceUnit unit);

    enum DistanceUnit {
        CM, INCH, MM
    }
}
