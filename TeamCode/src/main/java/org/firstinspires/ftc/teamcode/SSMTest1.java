package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp(name="One_TeleOp")
public class SSMTest1 extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        //Initialization Code
        DcMotor SSMmotorOne;
        DcMotor SSMmotorTwo;
        SSMmotorOne = hardwareMap.get(DcMotor.class,"SSMmotorOne");
        SSMmotorTwo = hardwareMap.get(DcMotor.class,"SSMmotorTwo");
        waitForStart();

        while(opModeIsActive()){
            double speedleft = gamepad1.left_stick_y;
            SSMmotorOne.setPower(speedleft);
            double speedright = gamepad1.right_stick_y;
            SSMmotorTwo.setPower(speedright);
        }
    }
}
