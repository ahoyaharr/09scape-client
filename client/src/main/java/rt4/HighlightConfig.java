package rt4;

import java.util.Map;
import java.util.*;

public class HighlightConfig {
    public static final int MINIMAP_ZOOM_LEVEL = 0;

    public static boolean minimapHideNPC = true;
    public static boolean minimapHidePlayers = true;
    public static boolean minimapHideItems = true;
    public static boolean replaceLeftClickOptions = true;
    public static boolean simplifyMinimap = true;

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
        put(2213, NAVY); // Bank booth
        put(11758, NAVY);
        put(34752, NAVY);
        put(2092, RED); // Iron ore
        put(2093, RED); // Iron ore
        put(31068, GOLD); // Coal
        put(31069, GOLD);
        put(31070, GOLD);
        put(31086, SKY_BLUE); // Mithril
        put(31087, SKY_BLUE); // Mithril
        put(31088, SKY_BLUE); // Mithril
        put(5551, GOLD); // Willow
        put(5553, GOLD);
        put(23271, ORANGE); // Wilderness ditch
    }};

    public static Map<Integer, Integer> npcIDs = new HashMap<Integer, Integer>() {{
        put(2234, PURPLE); // Farmer
        put(309, GOLD); // Salmon/Trout Fishing Hole
        put(312, GOLD); // Lobster/Swordfish
        put(498, NAVY); // Fairy Banker
    }};


    // TODO: Highlighting and hiding of item stacks
    public static Map<Integer, Integer> itemHighlightIDs = new HashMap<Integer, Integer>() {{
        put(1131, VIOLET);
        put(995, VIOLET);
        put(1739, PINK);
    }};

    public static List<Integer> itemHideIDs = Arrays.asList();  // Items which should not be rendered or be included in menus

    public static Set<String> defaultLeftClick = new HashSet<String>() {{
            add("Pickpocket");
    }};  // Items which should not be rendered or be included in menus

    // TODO: Override lighting and fog
}
