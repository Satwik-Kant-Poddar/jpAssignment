package com.nrift.assignment.logic;

import org.springframework.stereotype.Service;

@Service
public class BigDecimalLogic {

    public String function(String input) {
        String ans = "";
        java.math.BigDecimal bd1 = new java.math.BigDecimal("0");
        try {
            bd1 = new java.math.BigDecimal(input);
        } catch (NumberFormatException e) {
            System.out.println(e);
            ans += "wrong input plz try again";
            return ans;
        }

        System.out.println(bd1);

        String str = bd1.toString();
        int a = str.length();
        int deciPos = 0;
        for (int i = 0; i < a; i++) {
            if (str.charAt(i) == '.') {
                System.out.println("got it " + i);
                deciPos = i;
            }
        }
        if (bd1.signum() == 1) {
            if (deciPos == 0) {
                deciPos = a;
                System.out.print(str.charAt(0));
                ans += str.charAt(0);
                for (int i = 1; i < deciPos; i++) {
                    if ((deciPos - i) % 3 == 0) {
                        System.out.print(",");
                        ans += ",";
                    }
                    System.out.print(str.charAt(i));
                    ans += str.charAt(i);
                }
                System.out.print(str.substring(deciPos));
                ans += str.substring(deciPos);
            } else {
                System.out.print(str.charAt(0));
                ans += str.charAt(0);
                for (int i = 1; i < deciPos; i++) {
                    if ((deciPos - i) % 3 == 0) {
                        System.out.print(",");
                        ans += ",";
                    }
                    System.out.print(str.charAt(i));
                    ans += str.charAt(i);
                }
                System.out.print(str.substring(deciPos));
                ans += str.substring(deciPos);
            }
        }

        else if (bd1.signum() == -1) {
            if (deciPos == 0) {
                deciPos = a;
                System.out.print(str.charAt(0) + "" + str.charAt(1));
                ans += str.charAt(0) + "" + str.charAt(1);
                for (int i = 2; i < deciPos; i++) {
                    if ((deciPos - i) % 3 == 0) {
                        System.out.print(",");
                        ans += ",";
                    }
                    System.out.print(str.charAt(i));
                    ans += str.charAt(i);
                }
                System.out.print(str.substring(deciPos));
                ans += str.substring(deciPos);
            } else {
                System.out.print(str.charAt(0) + "" + str.charAt(1));
                ans += str.charAt(0) + "" + str.charAt(1);
                for (int i = 2; i < deciPos; i++) {
                    if ((deciPos - i) % 3 == 0) {
                        System.out.print(",");
                        ans += ",";
                    }
                    System.out.print(str.charAt(i));
                    ans += str.charAt(i);
                }
                System.out.print(str.substring(deciPos));
                ans += str.substring(deciPos);
            }
        }else{
            ans="0";
        }
        return ans;
    }
}
