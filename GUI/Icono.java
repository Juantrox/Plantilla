package GUI;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.InputStream;

/**
 * Utilidad para asignar el icono de la aplicación a ventanas y barra de tareas.
 */
public class Icono {

    private static final String DEFAULT_ICON_PATH = "/Logo.png";
    private static final String FALLBACK_ICON_PATH = "/GUI/Logo.png";

    /**
     * Aplica el icono predeterminado a una ventana.
     * @param window Ventana a la que se asignará el icono.
     */
    public static void applyToWindow(Window window) {
        setIcon(window, DEFAULT_ICON_PATH, FALLBACK_ICON_PATH);
    }

    /**
     * Busca un icono en las rutas indicadas y lo asigna a la ventana si existe.
     * @param window Ventana a la que se le aplicará el icono.
     * @param resourcePaths Rutas de recursos donde buscar la imagen del icono.
     */
    public static void setIcon(Window window, String... resourcePaths) {
        if (window == null || resourcePaths == null) {
            return;
        }

        for (String resourcePath : resourcePaths) {
            if (resourcePath == null) {
                continue;
            }

            try (InputStream stream = Icono.class.getResourceAsStream(resourcePath)) {
                if (stream == null) {
                    continue;
                }

                Image icon = ImageIO.read(stream);
                if (icon == null) {
                    continue;
                }

                window.setIconImage(icon);

                if (Taskbar.isTaskbarSupported()) {
                    try {
                        Taskbar.getTaskbar().setIconImage(icon);
                    } catch (UnsupportedOperationException ignored) {
                    }
                }

                return;
            } catch (Exception ignored) {
            }
        }
    }
}
