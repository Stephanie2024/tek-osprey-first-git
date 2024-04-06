package tek.bdd.steps;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.HomePage;
import tek.bdd.utility.seleniumUtilities;

public class SmokeTestSteps extends seleniumUtilities {



    @Then("Validate top left corner is {string}")
        public void validateTopLeftCorner(String expectedTitle) {

            String actualTitle = getElementText(HomePage.TOP_NAV_LOGO);

            Assert.assertEquals(expectedTitle, actualTitle);
        }

        @Then("Validate Sign In Button is Enabled")
        public void validateSignInButtonIsEnabled() {
            boolean isButtonEnabled = isElementEnabled(HomePage.SING_IN_BUTTON);
            Assert.assertTrue(isButtonEnabled);
        }

    }

