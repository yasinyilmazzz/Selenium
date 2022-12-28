package tests;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day09_FileExistTest {
    @Test
    public void isExistTest(){
//        Pick a file on your desktop
//        1 cup of water
//        And verify if that file exist on your computer or not
        String userDIR= System.getProperty("user.dir");       //=>gives the path of the current project folder
        System.out.println(userDIR);

        String userHOME=System.getProperty("user.home");      //=>gives you the user folder
        System.out.println(userHOME);

//        Pick a file on your desktop
//        And verify if that file exist on your computer or not

        String pathOfTheFile = userHOME+"/Desktop/Ekran görüntüsü 2022-12-05 001019.jpg";
//      In windows you get path shift+right click+copy paht combination. But path should type with "\\" or "/"
        boolean isExist = Files.exists(Paths.get(pathOfTheFile));
        Assert.assertTrue(isExist);
    }
}
