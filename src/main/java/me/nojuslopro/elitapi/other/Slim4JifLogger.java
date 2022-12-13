package me.nojuslopro.elitapi.other;

import java.awt.*;

public class Slim4JifLogger {

    // READ RAW TEXT

    public void log(String text) {
        System.out.println("[LOG] " + text);
    }

    public void warn(String text) {
        System.out.println(Color.YELLOW + "[WARN] " + text);
    }

    public void severe(String text) {
        System.out.println(Color.RED + "[ERROR] " + text);
    }

}
