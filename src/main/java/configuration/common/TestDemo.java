package configuration.common;

public class TestDemo {

//Check coding is working for any operator
    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        String path =System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/BrowserDriver/Windows/chromedriver");

        System.out.println(currentDirectory);
    }
}
