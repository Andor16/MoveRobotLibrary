package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.ftcrobotcontroller.opmodes.MoveMotors.Direction;

/**
 * Created by Payton on 7/1/2016.
 */
public class TestNoahsCode extends LinearOpMode {

    DcMotor leftMotor;
    DcMotor rightMotor;

    MoveMotors move;

    Continue stopTime;
    @Override
    public void runOpMode() throws InterruptedException {

        leftMotor = hardwareMap.dcMotor.get("leftDrive");
        rightMotor = hardwareMap.dcMotor.get("rightDrive");

        stopTime = new Continue();

        move = new MoveMotors(leftMotor, rightMotor, stopTime);

        waitForStart();

        move.Drive(60, 2500, Direction.FORWARD);
        move.Drive(60, 1000, Direction.RIGHT);
        move.Drive(60, 2500, Direction.FORWARD);

    }
}