package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp(name="TeleOp1")
public class SSMCode2 extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        //Initialization Code
        DcMotor FL;
        DcMotor FR;
        DcMotor BL;
        DcMotor BR;
        FL = hardwareMap.get(DcMotor.class,"SSMmotor1");
        FR = hardwareMap.get(DcMotor.class,"SSMmotor2");
        BL = hardwareMap.get(DcMotor.class,"SSMmotor3");
        BR = hardwareMap.get(DcMotor.class,"SSMmotor4");
        waitForStart();

        while(opModeIsActive()){
            double speed = gamepad1.left_stick_x;
            FL.setPower(speed);
            FR.setPower(speed);
            BL.setPower(speed*-1);
            BR.setPower(speed*-1);

        }
    }
}