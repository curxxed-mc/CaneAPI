package xyz.cane.chat;

import org.jetbrains.annotations.NotNull;

/**
 * A utility class for handling Minecraft chat color codes.
 * This provides a clean and optimized alternative to Bukkit's ChatColor enum.
 */
public final class ChatColor {

    /**
     * The special character used to denote color and formatting codes.
     */
    public static final char COLOR_CHAR = '\u00A7'; // This is the '§' symbol

    // --- Color Codes ---
    public static final String BLACK = COLOR_CHAR + "0";
    public static final String DARK_BLUE = COLOR_CHAR + "1";
    public static final String DARK_GREEN = COLOR_CHAR + "2";
    public static final String DARK_AQUA = COLOR_CHAR + "3";
    public static final String DARK_RED = COLOR_CHAR + "4";
    public static final String DARK_PURPLE = COLOR_CHAR + "5";
    public static final String GOLD = COLOR_CHAR + "6";
    public static final String GRAY = COLOR_CHAR + "7";
    public static final String DARK_GRAY = COLOR_CHAR + "8";
    public static final String BLUE = COLOR_CHAR + "9";
    public static final String GREEN = COLOR_CHAR + "a";
    public static final String AQUA = COLOR_CHAR + "b";
    public static final String RED = COLOR_CHAR + "c";
    public static final String LIGHT_PURPLE = COLOR_CHAR + "d";
    public static final String YELLOW = COLOR_CHAR + "e";
    public static final String WHITE = COLOR_CHAR + "f";

    // --- Formatting Codes ---
    public static final String OBFUSCATED = COLOR_CHAR + "k";
    public static final String BOLD = COLOR_CHAR + "l";
    public static final String STRIKETHROUGH = COLOR_CHAR + "m";
    public static final String UNDERLINE = COLOR_CHAR + "n";
    public static final String ITALIC = COLOR_CHAR + "o";
    public static final String RESET = COLOR_CHAR + "r";

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private ChatColor() {}

    /**
     * Translates a string using an alternate color code character into a
     * string that uses the internal Minecraft color codes.
     *
     * @param altColorChar The alternate color code character to replace (e.g., '&')
     * @param textToTranslate The string containing the alternate color codes.
     * @return The translated string.
     */
    @NotNull
    public static String translateAlternateColorCodes(char altColorChar, @NotNull String textToTranslate) {
        char[] chars = textToTranslate.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == altColorChar && "0123456789AaBbCcDdEeFfKkLlMmNnOoRr".indexOf(chars[i + 1]) > -1) {
                chars[i] = COLOR_CHAR;
                chars[i + 1] = Character.toLowerCase(chars[i + 1]);
            }
        }
        return new String(chars);
    }
}
