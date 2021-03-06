package org.firstinspires.ftc.teamcode.appleCRISPR_2017;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.appleCRISPR_2017.DemoBots.AtDemoBot;
import org.firstinspires.ftc.teamcode.appleCRISPR_2017.DemoBots.AtDemoFourMotor;
import org.firstinspires.ftc.teamcode.appleCRISPR_2017.DemoBots.AtDemoTricycle;
import org.firstinspires.ftc.teamcode.appleCRISPR_2017.DemoBots.AtDemoTwoMotor;

/**
 * Created by Riley on 13-Apr-17.
 *
 * Good luck!
 */

@Autonomous(name = "Run Demo", group = "Autonomous")
public class AtDemoRun extends LinearOpMode {

    AtDemoBot robot;

    private void initialize() {
        try {
            robot = new AtDemoTwoMotor(hardwareMap);
        }
        catch (IllegalArgumentException ignored){}
        try {
            robot = new AtDemoFourMotor(hardwareMap);
        }
        catch (IllegalArgumentException ignored){}
        try {
            robot = new AtDemoTricycle(hardwareMap);
        }
        catch (IllegalArgumentException ignored){}
    }

    /**
     * This bit of code executes when you click the "run" button on the phone to run things!
     * Thus, if you want something to happen, put it in between the curly brackets.
     *
     * @throws InterruptedException when the process is interrupted.  Did you expect otherwise?
     */
    @Override
    public void runOpMode() throws InterruptedException {


        initialize();
        robot.stop();
        waitForStart();


        for (float i=-1; i<1; i+=.1){
            robot.driveForward((int) (i*100),0);
            telemetry.addData("Power",i);
            telemetry.update();
            sleep(1000);
        }


        telemetry.addData("FORWARD","");
        telemetry.update();
        robot.driveForward(75, 3);
        robot.sleep(4);

        telemetry.addData("STOP","");
        telemetry.update();
        robot.stop();
        robot.sleep(1);

        telemetry.addData("CCWISE","");
        telemetry.update();
        robot.turnLeft(75, 3);

        robot.stop();
        robot.sleep(2);

        telemetry.addData("C-WISE","");
        telemetry.update();
        robot.turnRight(75, 3);

        robot.stop();

        telemetry.addData("BACKWARD","");
        telemetry.update();
        robot.driveBackward(75, 3);

        robot.stop();



    }
}


/*               H E L P F U L   T I P S !
 *               (for when you get stuck)
 * Remember to end your lines with semicolons, like this;
 * Putting anything after two slashes in the code makes the robot ignore that. //like this
 * If the robot seems to skip a command - did you tell the program to pause there for a bit before continuing? using ("sleep(a number);")
 */

