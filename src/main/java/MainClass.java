import com.pi4j.io.gpio.*;
import com.pi4j.platform.Platform;
import com.pi4j.platform.PlatformAlreadyAssignedException;
import com.pi4j.platform.PlatformManager;

public class MainClass {

    public static void main(String[] args) throws InterruptedException, PlatformAlreadyAssignedException {

        System.out.println("Starting Demo");
        PlatformManager.setPlatform(Platform.RASPBERRYPI); // Support for Orange Pi

        final GpioController gpio = GpioFactory.getInstance();

//        GpioPinDigitalInput inputPin = gpio.provisionDigitalInputPin(RaspiPin.GPIO_00,PinPullResistance.PULL_UP);// Pulled UP
        GpioPinDigitalOutput outputPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_11);
        while(true){
//            if(inputPin.isLow()){// Checks if switch is pressed.

                Thread.sleep(500);
                outputPin.low();
//            }
//            else{
                Thread.sleep(500);
                outputPin.high();
//            }
        }
//        gpio.shutdown();
    }
}