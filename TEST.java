package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple.Direction;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by aparikh1 on 11/1/2017.
 */

@Autonomous(name="TEST", group="Linear Opmode")
//@Disabled
public class TEST extends LinearOpMode {

    public static final double JEWEL_SPEED = 0.35;
    public static final int JEWEL_TIME = 500;
    public static final double CR_DOWN = -0.75;
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor leftDrive = null;
    private DcMotor rightDrive = null;
    //private DcMotor armDrive1 = null;
    //private DcMotor armDrive2 = null;
    private Servo servotest;
    private ColorSensor colorSensor = null;
    private DcMotor backmotorleft = null;
    private DcMotor backmotorright = null;

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");


        telemetry.update();

        leftDrive = hardwareMap.get(DcMotor.class, "motorleft");
        rightDrive = hardwareMap.get(DcMotor.class, "motorright");
        // armDrive1 = hardwareMap.get(DcMotor.class, "armmotor1");
        //armDrive2 = hardwareMap.get(DcMotor.class, "armmotor2");
        servotest = hardwareMap.get(Servo.class, "servotest");
        colorSensor = hardwareMap.get(ColorSensor.class, "colorsensor");
        backmotorleft = hardwareMap.get(DcMotor.class, "backmotorleft");
        backmotorright = hardwareMap.get(DcMotor.class, "backmotorright");


        leftDrive.setDirection(DcMotor.Direction.FORWARD);
        rightDrive.setDirection(DcMotor.Direction.REVERSE);
        //armDrive2.setDirection(DcMotor.Direction.FORWARD);
        //armDrive1.setDirection(DcMotor.Direction.FORWARD);
        backmotorleft.setDirection(Direction.REVERSE);
        backmotorright.setDirection(Direction.FORWARD);


        waitForStart();
        runtime.reset();


        rightDrive.setPower(1);
leftDrive.setPower(1);
        backmotorleft.setPower(-0.3);
        backmotorright.setPower(-0.3);
        sleep(501);


    }


}