package testcase;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readfile {

    public static void main(String[] args) throws IOException {
        Properties p;
        try (FileReader FR = new FileReader("C:\\Users\\Sachin.Kadlag\\IdeaProjects\\iQube\\TVS iQube Automation\\src\\test\\resources\\configflie\\properties")) {
            p = new Properties();
            p.load(FR);
        }
        System.out.println(p.getProperty("brower"));
        System.out.println(p.getProperty("testurl"));
    }
}
