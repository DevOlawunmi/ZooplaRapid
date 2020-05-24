package co.uk.zoopla.hooks;

import co.uk.zoopla.commons.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Browsers {
    String defaultBrowser = "Chrome";
   @Before
    public void setUp(){
        launchBrowser(defaultBrowser);
    }
    @After
    public void tearDown(){
       closeBrowser();
    }
}
