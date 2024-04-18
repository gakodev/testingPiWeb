package bases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

public class BasePi {
    public String driverPath;
    public String url;
    public WebDriver driver;

    @BeforeClass
    public void preCond(){
        url = "https://testandowbh.000webhostapp.com/index.php";

        driver = new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
    protected WebDriver getDriver() {
        return driver;
    }
}
