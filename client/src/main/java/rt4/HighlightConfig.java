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
        put(11402, NAVY);
        put(11758, NAVY);
        put(25808, NAVY);
        put(26972, NAVY);
        put(34752, NAVY);
        put(35647, NAVY);
        put(2092, RED); // Iron ore
        put(2093, RED); // Iron ore
        put(31068, GOLD); // Coal
        put(31069, GOLD);
        put(31070, GOLD);
        put(31086, SKY_BLUE); // Mithril
        put(31087, SKY_BLUE); // Mithril
        put(31088, SKY_BLUE); // Mithril
//        put(5551, GOLD); // Willow
//        put(5553, GOLD);
        put(1307, GOLD); // Maple
        put(23271, ORANGE); // Wilderness ditch
        put(25730, RED);  // Range
        put(26814, SAND); // Edgeville Furnace
        put(26808, DEEP_NAVY); // Edgeville Furnace Door
        put(15621, GOLD); // Animator
        put(2288, SAND);
        put(2283, SAND);
        put(37704, SAND);
        put(2297, SAND);
        put(2328, SAND);
        put(2783, GOLD); // Anvil
    }};

    public static Map<Integer, Integer> npcIDs = new HashMap<Integer, Integer>() {{
        put(2234, PURPLE); // Farmer
        put(309, GOLD); // Salmon/Trout Fishing Hole
        put(312, GOLD); // Lobster/Swordfish
        put(333, GOLD); // Lobster/Swordfish @ Fishing Guild
        put(498, NAVY); // Fairy Banker
        put(941, VIOLET); // Green Dragon
        put(6538, NAVY); // Wilderness Banker
        put(1618, VIOLET);
        put(1585, VIOLET); // Fire giant
        put(1582, VIOLET); // Fire giant
        put(1583, VIOLET); // Fire giant
        put(110, VIOLET);
        put(7004, VIOLET);
        put(2824, GOLD); // Tanner (Ellis in Al-Kharid)
    }};


    // TODO: Highlighting and hiding of item stacks
    public static Map<Integer, Integer> itemHighlightIDs = new HashMap<Integer, Integer>() {{
        put(536, LIME);  // Dragon bones
        put(1753, LIME); // Green d'hide
//        put(563, LIME); // Law rune
//        put(561, LIME); // Nature rune
//        put(1213, LIME); // Rune dagger
//        put(987, LIME); // Loop half
//        put(985, LIME); // Tooth half
//        put(1615, LIME); // Dragonstone
//        put(2363, LIME); // Runite bar
//        put(1319, LIME); // Rune 2h sword
//        put(1373, LIME); // Rune battleaxe
//        put(1185, LIME); // Rune sq shield
//        put(1201, LIME); // Rune kite
//        put(1149, LIME); // Dragon med helm
//        put(2366, LIME); // Shield left half
//        put(1249, LIME); // Dragon spear

//        put(12158, LIME); // Gold charm
//        put(12159, LIME); // Green charm
//        put(12160, LIME); // Crimson charm
//        put(12163, LIME); // Blue charm





        put(8844, LIME);
        put(8845, LIME);
        put(8846, LIME);
        put(8847, LIME);
        put(8848, LIME);
        put(8849, LIME);
        put(8850, LIME);
        put(8851, LIME);
        put(1159, LIME);
        put(1121, LIME);
        put(1071, LIME);
        put(5073, LIME); // Bird's Nest
    }};

    public static List<Integer> itemHideIDs = Arrays.asList();  // Items which should not be rendered or be included in menus

    public static Set<String> defaultLeftClick = new HashSet<String>() {{
            add("Pickpocket");
    }};  // Items which should not be rendered or be included in menus

    // TODO: Override lighting and fog
}
