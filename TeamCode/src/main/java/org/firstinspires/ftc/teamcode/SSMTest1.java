package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp(name="F_TeleOp")
public class SSMTest1 extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        //Initialization Code
        DcMotor SSMmotorOne;
        SSMmotorOne = hardwareMap.get(DcMotor.class,"SSMmotorOne")

        waitForStart();

        while(opModeIsActive()){
            double speed = gamepad1.left_stick_x;
            SSMmotorOne.setPower(speed);
        }
    }
}
