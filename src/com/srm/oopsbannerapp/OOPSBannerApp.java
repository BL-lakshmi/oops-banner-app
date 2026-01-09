/**
 * OOPSBannerApp UC5 - OOPS Banner Display Application
 * This class demonstrates a simple java application that displays the object-  * oriented programming system oops acronym to the console.
 *@author Developer
 * @version 5.0
 */
package com.srm.oopsbannerapp;

public class OOPSBannerApp {
    public static void main(String args[]){
        String lines[]= {
                String.join(" ", "   ***   ", "   ***   ", "******   ", "   ***** "),
                String.join(" ", " **   ** ", " **   ** ", "**    ** ", " **      "),
                String.join(" ", "**     **", "**     **", "**     **", "**       "),
                String.join(" ", "**     **", "**     **", "*******  ", "  *****  "),
                String.join(" ", "**     **", "**     **", "**       ", "      ** "),
                String.join(" ", " **   ** ", " **   ** ", "**       ", "**    ** "),
                String.join(" ", "   ***   ", "   ***   ", "**       ", "  *****  ")
        };
        for(String line:lines){
            System.out.println(line);
        }
    }
}
