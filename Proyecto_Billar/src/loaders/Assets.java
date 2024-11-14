package loaders;

import java.awt.image.BufferedImage;

public class Assets {
    public static BufferedImage table;
    public static void init() {
        
        table = new LoaderImages().loadImage("D:/Universidad/AUXILIATURA/AUX_2024/24_aux_211_2/Repositorio_GitHub/Proyecto_Billar/res/textures/poll.jpeg");
    }
}
 