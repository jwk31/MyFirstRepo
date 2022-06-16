package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Demo {

    public boolean catDog(String str) {

        if (str.contains("cat")) {
            str = str.replace("cat", "_");
        }

        if (str.contains("dog")) {
            str = str.replace("dog", "*");
        }

        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) ==  '_'){
                countCat++;
            }
            if(str.charAt(i) == '*'){
                countDog++;
            }
        }

        if (countCat == countDog) {
            return true;
        } else {
            return false;
        }
    }

    @Test
    public void testCatDog() {
        String str1 = "catxxdogxxxdog";
        boolean expectedValue1 = false;
        String str2 = "catcat";
        boolean expectedValue2 = false;
        String str3 = "1cat1cadodog";
        boolean expectedValue3 = true;

        Assertions.assertEquals(expectedValue1, catDog(str1));
        Assertions.assertEquals(expectedValue2, catDog(str2));
        Assertions.assertEquals(expectedValue3, catDog(str3));
    }
}
