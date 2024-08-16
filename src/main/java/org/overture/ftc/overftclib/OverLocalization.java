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

public interface OverLocalization {
    Position getPosition();
    void update();

    class Position {
        public double x;
        public double y;
        public double theta;

        public Position(double x, double y, double theta) {
            this.x = x;
            this.y = y;
            this.theta = theta;
        }
    }
}
