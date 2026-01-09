/**
 * OOPSBannerApp UC7 - OOPS Banner Display Application
 * This class demonstrates a simple java application that displays the object-  * oriented programming system oops acronym to the console.
 *@author Developer
 * @version 7.0
 */
package com.srm.oopsbannerapp;

public class OOPSBannerApp {
    static class CharacterPatternMap {

        private final Character character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         *
         * @param character character to map
         * @param pattern   7-line ASCII pattern
         */
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        /**
         * @return mapped character
         */
        public Character getCharacter() {
            return character;
        }
        /**
         * @return ASCII pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        charMaps[0] = new CharacterPatternMap('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        });

        charMaps[1] = new CharacterPatternMap('P', new String[]{
                "******   ",
                "**    ** ",
                "**     **",
                "*******  ",
                "**       ",
                "**       ",
                "**       "
        });

        charMaps[2] = new CharacterPatternMap('S', new String[]{
                "   ***** ",
                " **      ",
                "**       ",
                "  *****  ",
                "      ** ",
                "**    ** ",
                "  *****  "
        });

        charMaps[3] = new CharacterPatternMap(' ', new String[]{
                "        ",
                "        ",
                "        ",
                "        ",
                "        ",
                "        ",
                "        "
        });

        return charMaps;
    }
    /**
     * Retrieves the ASCII pattern for a given character
     *
     * @param ch       character to look up
     * @param charMaps array of character-pattern mappings
     * @return pattern array for the character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // Default: return space pattern if character not found
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints a message as an ASCII banner
     *
     * @param message  message to print
     * @param charMaps available character-pattern mappings
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[row]).append(" ");
            }
            System.out.println(line);
        }
    }

    public static void main(String args[]){
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }

}
