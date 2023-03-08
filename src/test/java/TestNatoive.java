import config.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.SettingObject;
import pages.SettingsField;

public class TestNatoive extends BaseClass {
    static SettingObject settingObject;

    @BeforeClass
    public static void bTestNative() {
        settingObject = new SettingObject(driver);
        preSettings();
    }

    @Test
    public void test1() throws InterruptedException {
        for(int i=0;i<7;i++){
            Thread.sleep(1000);
            System.out.println(driver.currentActivity());
        }
    }

    private static void preSettings() {
        settingObject.print_name(SettingsField.TEMPERATURE);
        settingObject.print_name(SettingsField.WIND_SPEED);
        settingObject.selectTemp(true);
        settingObject.selectSpeed("km");
     //   settingObject.buttonDoneClick();
    }

}
