import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //while(true) {
        //    PointerInfo info = MouseInfo.getPointerInfo();
        //    Point loc = info.getLocation();
//
        //    System.out.println(loc.getX() + ", " + loc.getY());
        //}


        //takePicture("werner.png");




        for(int i= 0; i < 4; i++)
        {
            click();
            takePicture("werner/werner" + (i + 72) + ".png");

            try {
                System.out.println("I:" + i);
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    public static void takePicture(String name)
    {
        try {
            BufferedImage screenshot = new Robot().createScreenCapture(new Rectangle(825, 42, 911, 1289));
            try {
                ImageIO.write(screenshot, "png", new File("C:/Users/Iris/Desktop/" + name));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }

    }

    public static void click()
    {
        try {
            Robot r = new Robot();


            r.mouseMove(1189, 19);
            r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(100);
            r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            r.mouseMove(2000, 300);



        } catch (AWTException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
