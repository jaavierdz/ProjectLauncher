import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Scanner;

public class ProjectLauncher {
    public static void main(String @NotNull [] args) {
        // Apps
        String[] apps = {
                "Spotify",
                "IntelliJ IDEA",
                "Discord",
                "Claude"
        };

        String proyectoPath = args[0];
        System.out.println("Sacate el eneryeti ya");

        try {
            new ProcessBuilder("open", proyectoPath).start();

            for (String app : apps) {
                new ProcessBuilder("open", "-a", app).start();
            }
            System.out.println("Chillin tio");
        } catch (IOException e) {
            System.err.println("xd: " + e.getMessage());
        }
    }
}
