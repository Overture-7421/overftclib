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

package org.overFTClib;

public interface OverIMU {
    Orientation getOrientation();
    Acceleration getAcceleration();
    Velocity getVelocity();
    void reset();

    class Orientation {
        public double roll;
        public double pitch;
        public double yaw;

        public Orientation(double roll, double pitch, double yaw) {
            this.roll = roll;
            this.pitch = pitch;
            this.yaw = yaw;
        }
    }

    class Acceleration {
        public double x;
        public double y;
        public double z;

        public Acceleration(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    class Velocity {
        public double x;
        public double y;
        public double z;

        public Velocity(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}

