package tests;

import com.codeborne.selenide.Configuration;

public class ConfigurationFile {

    static {

        Configuration.screenshots = true;
        Configuration.startMaximized = true;

    }
}
