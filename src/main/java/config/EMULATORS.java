package config;

public enum EMULATORS {
    PIXEL2610("Pixel2610"),
    NEXUS("Nexus");
    final String name;

    EMULATORS(String name) {
        this.name = name;
    }
}
