package org.firstinspires.ftc.teamcode.appleCRISPR_2017;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.appleCRISPR_2017.AtRevComponents.AtREVModule;
import org.firstinspires.ftc.teamcode.appleCRISPR_2017.AtRevComponents.AtREVServo;

/**
 * Created by Riley on 13-Apr-17.
 *
 * Make sure to tell the code what your robot name is! (line 24ish)
 * Good luck!
 */

//@Autonomous(name = "Servo Test", group = "Autonomous")
public class AtDemoGeneral extends AtDemoBase {

    /**
     * This bit of code executes when you click the "init" button on the phone to run things!
     * Thus, if you want something to happen, put it in between the curly brackets.
     *
     * @throws InterruptedException when the process is interrupted.  Did you expect otherwise?
     */
    @Override
    public void runOpMode() throws InterruptedException {
        //ourInit("MiniBot");

        /*
        AtREVModule revModule = new AtREVModule();
        revModule.add(new AtREVMotorPair("motor0:motor1"));
        revModule.initialize(hardwareMap);

        ((AtREVMotorPair)revModule.get("motor0:motor1")).setPower(1);

        sleep(2000);

        ((AtREVMotorPair)revModule.get("motor0:motor1")).setPower(0);
        */

        AtREVModule revModule = new AtREVModule();
        AtREVServo servo = (AtREVServo)revModule.add(new AtREVServo("servo1"));
        servo.setPosition(0);

        revModule.initialize(hardwareMap);

        telemetry.addData("Servo Pos:", servo.getPosition());
        telemetry.update();
        sleep(3000);

        servo.setPosition(1);
        sleep(3000);
    }
}


/*               H E L P F U L   T I P S !
 *               (for when you get stuck)
 * Remember to end your lines with semicolons, like this;
 * Putting anything after two slashes in the code makes the robot ignore that. //like this
 * If the robot seems to skip a command - did you tell the program to pause there for a bit before continuing? using ("sleep(a number);")
 */