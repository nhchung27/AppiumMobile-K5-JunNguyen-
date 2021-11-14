package Lession03;

import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
//        System.out.println("----Bai 1----:");
//        parseMinute();
//        System.out.println("----Bai 2----:");
//        checkPassword();
//        System.out.println("----Bai 3----:");
//        splitString();
        System.out.println("----Bai 4----:");
        checkString();
    }

    public static void parseMinute() {
        String input = "2hrs and 5 minutes";
        char myHour = input.charAt(0);
        char myMinutes= input.charAt(9);
        int countMinutes = (Integer.parseInt(String.valueOf(myHour))) * 60 + (Integer.parseInt(String.valueOf(myMinutes)));
        System.out.println("Total minutes is :" + countMinutes);
    }

    public static void checkPassword(){
        String userPassword = "password123";
        String inputPassword = "";
        int retry = 0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input your password:");
            inputPassword = scan.nextLine();
            if (userPassword.equals(inputPassword)){
                System.out.println("Login successfully!");
                break;
            }
            retry++;
            System.out.println("Wrong password, please try again!");
            }
        while (retry < 3);
        if (retry == 3 && !inputPassword.equals(userPassword)) {
            System.out.println("Your account is locked!");
        }
    }
    public static void splitString(){
        String newString ="";
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your string");
        String inputStr = scan.nextLine();
        char[] chars = inputStr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
//            if (!Character.isDigit((chars[i]))){ //check non-ditgit
            if (Character.isDigit((chars[i]))){
                newString=newString + chars[i];
            }

        }
        System.out.println(newString);
    }
    public static void checkString(){
        String url = "https://google.com";
//       int lastIndex = url.lastIndexOf("/");
//       int indexOfTheDot = url.indexOf(".");
//       String domainName = url.substring(lastIndex +1);
//       String companyName = url.substring((lastIndex+1),indexOfTheDot);
//       System.out.println("Domain name: " + domainName);
//       System.out.printf("Second level domain:" + companyName);
//       String[] secondomain = domainName.split(".");
//       System.out.println(secondomain[0]);
        String[] urlArray = url.toLowerCase().replace("www.", "").split("://|\\.");
        System.out.println("PROTOCOL = " + urlArray[0]);
        System.out.println("DOMAIN NAME = " + urlArray[1]);
        System.out.println("TOP-LEVEL DOMAIN = " + urlArray[2]);
    }
}
