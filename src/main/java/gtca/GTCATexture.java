package gtca;

import ic2.core.platform.textures.Sprites;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static ic2.core.platform.textures.Ic2Icons.addSprite;
import static ic2.core.platform.textures.Ic2Icons.addTextureEntry;

public class GTCATexture {

    @SideOnly(Side.CLIENT)
    public static void loadSprites() {

        addTexture("gtca_ores", 16, 1);

    }

    private static void addTexture(String name, int x, int y) {
        addSprite(new Sprites.SpriteData(name, GTCA.MODID + ":textures/sprites/" + name
                + ".png", new Sprites.SpriteInfo(x, y)));
        addTextureEntry(new Sprites.TextureEntry(name, 0, 0, x, y));
    }

}
