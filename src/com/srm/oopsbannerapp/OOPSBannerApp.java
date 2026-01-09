/**
 * OOPSBannerApp UC6 - OOPS Banner Display Application
 * This class demonstrates a simple java application that displays the object-  * oriented programming system oops acronym to the console.
 *@author Developer
 * @version 6.0
 */
package com.srm.oopsbannerapp;

public class OOPSBannerApp {
    public static String[] getOPattern(){
        return new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        };
    }

    public static String[] getPPattern(){
        return new String[]{
                "******   ",
                "**    ** ",
                "**     **",
                "*******  ",
                "**       ",
                "**       ",
                "**       "
        };
    }

    public static String[] getSPattern(){
        return new String[]{
                "   ***** ",
                " **      ",
                "**       ",
                "  *****  ",
                "      ** ",
                "**    ** ",
                "  *****  "

        };
    }

    public static void main(String args[]){
        String[] oPattern= getOPattern();
        String[] pPattern= getPPattern();
        String[] sPattern= getSPattern();
        for(int i=0;i< oPattern.length;i++){
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
    }
}
