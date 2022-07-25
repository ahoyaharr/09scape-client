package rt4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class HighlightConfig {
    public static final int MINIMAP_ZOOM_LEVEL = 0;

    public static boolean minimapHideNPC = true;
    public static boolean minimapHidePlayers = true;
    public static boolean minimapHideItems = true;

    private static final int defaultHighlightColor = 0x8F53;

    private static final int RED = 0xFF0000;
    private static final int BLUE = 0x0000FF;
    private static final int GREEN = 0x00FF00;
    private static final int LIME = 0xB6f703;
    private static final int ORANGE = 0xF78403;
    private static final int PURPLE = 0x6a12af;
    private static final int VIOLET = 0xAf3aa9;
    private static final int PINK = 0xF7b2f3;
    private static final int GOLD = 0xffbf06;
    private static final int NAVY = 0x154c79;
    private static final int DEEP_NAVY = 0x063970;
    private static final int SKY_BLUE = 0xabdbe3;
    private static final int SAND = 0xeab676;
    private static final int SOFT_BLUE = 0x1e81b0;

    public static Map<Integer, Integer> objectIDs = new HashMap<Integer, Integer>() {{
        put(2113, DEEP_NAVY); // Ladder down
        put(30941, SOFT_BLUE); // Ladder up
        put(11758, NAVY); // Bank booth
        put(31068, GOLD); // Coal
        put(31069, GOLD);
        put(31070, GOLD);
    }};

    public static Map<Integer, Integer> npcIDs = new HashMap<Integer, Integer>() {{
        put(309, defaultHighlightColor); // Salmon/Trout Fishing Hole
    }};


    // TODO: Highlighting and hiding of item stacks
    public static List<Integer> itemHighlightIDs = Arrays.asList();
    public static List<Integer> itemHideIDs = Arrays.asList();  // Items which should not be rendered or be included in menus

    // TODO: Override lighting and fog
}
