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
        DcMotor SSMmotor1;
        DcMotor SSMmotor2;
        DcMotor SSMmotor3;
        DcMotor SSMmotor4;
        SSMmotor1 = hardwareMap.get(DcMotor.class,"SSMmotor1");
        SSMmotor2 = hardwareMap.get(DcMotor.class,"SSMmotor2");
        SSMmotor3 = hardwareMap.get(DcMotor.class,"SSMmotor3");
        SSMmotor4 = hardwareMap.get(DcMotor.class,"SSMmotor4");
        waitForStart();

        while(opModeIsActive()){
            double speed = gamepad1.left_stick_y;
            SSMmotor1.setPower(speed);
            SSMmotor2.setPower(speed);
            SSMmotor3.setPower(speed);
            SSMmotor4.setPower(speed);

        }
    }
}