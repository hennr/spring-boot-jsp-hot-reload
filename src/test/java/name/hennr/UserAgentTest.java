package name.hennr;

import com.machinepublishers.jbrowserdriver.JBrowserDriver;
import com.machinepublishers.jbrowserdriver.Settings;
import com.machinepublishers.jbrowserdriver.UserAgent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebIntegrationTest(randomPort = true)
@DirtiesContext
public class UserAgentTest {

    @Value("${local.server.port}")
    private int port;

    @Test
    public void checkIfUserAgentIsSendCorrectly() throws Exception {

        // given
        Settings.Builder builder = new Settings.Builder();
        UserAgent userAgent = new UserAgent(UserAgent.Family.MOZILLA, "", "Linux", "", "Firefox/38.0", "Amigo!");
        builder.userAgent(userAgent);

        Settings settings = Settings.builder().userAgent(userAgent).build();
        WebDriver driver = new JBrowserDriver(settings);

        // when
        driver.get("http://localhost:" + this.port + "/useragent");
        String result = driver.findElement(By.xpath("html/body")).getText();
        System.out.println("User Agent: " + result);

        // then
        assertEquals("Amigo!", result);
    }
}
