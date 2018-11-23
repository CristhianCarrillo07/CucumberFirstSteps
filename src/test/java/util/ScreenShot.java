package util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ScreenShot {
    private static File srcFile;
    private static File desFile;
    private static Path scrshotPath;

    public static void takeScreenShot(WebDriver driver) {
        scrshotPath = Paths.get(System.getProperty("user.dir") + "\\screenshot");
        System.out.println(scrshotPath);
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        desFile = new File(scrshotPath.toString(),System.currentTimeMillis()+".png");
        try {
            FileUtils.copyFile(srcFile, desFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}