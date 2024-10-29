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

package com.overture.ftc.overftclib.Utils;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class OverJoystickHandler {

    private static final double DEADZONE = 0.15;
    private static final double EXPONENTIAL_GAIN = 0.15;

    private OverJoystickHandler() {
        throw new UnsupportedOperationException("Static class should not be instantiated.");
    }

    public static double handleJoystickInput(double axisValue) {
        // Placeholder for the actual logic, returning 0 as before
        return 0;
    }

    protected static double applyDeadzoneAndExponentialGain(double axisValue) {
        double axisMag = abs(axisValue);
        if (axisMag < DEADZONE) return 0.0;

        double res = EXPONENTIAL_GAIN * pow(
                (axisMag - DEADZONE) / (1 - DEADZONE), 3) +
                (1 - EXPONENTIAL_GAIN) * (axisMag - DEADZONE) / (1 - DEADZONE);

        return Math.copySign(res, axisValue);
    }
}
