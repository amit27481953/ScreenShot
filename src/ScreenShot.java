
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;



public class ScreenShot {

	public static void main(String[] args) throws IOException, HeadlessException, AWTException {
		// TODO Auto-generated method stub

		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image, "png", new File("/home/l33tlpt4/Videos/ScreenJava/screenshot.png"));
	}

}
