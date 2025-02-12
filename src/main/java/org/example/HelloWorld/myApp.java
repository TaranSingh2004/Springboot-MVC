package org.example.HelloWorld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class myApp {
    @Value("${myApp.name}")
    String name;

    @Value("1.3")
    String version;
    String description;

    public myApp() {
    }

    public myApp(String name, String version, String description) {
        this.name = name;
        this.version = version;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
