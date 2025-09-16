package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating; // test bu ismi bekliyor

    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle() { return style; }
    public boolean isBattery() { return battery; }

    // ✅ Testin beklediği getter
    public int getGlobRating() { return globRating; }

    // (Opsiyonel) Main’de getGlobalRating kullanıyorsan uyumluluk için:
    public int getGlobalRating() { return globRating; }
}
