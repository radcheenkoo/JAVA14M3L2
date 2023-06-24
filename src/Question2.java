import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        String[] someNames = new String[3];
        someNames[0] = "A";
        someNames[1] = "B";
        someNames[2] = "C";

        String[] strArr2 = new String[1];
        strArr2[0] = "A";

        String[] strArr3 = new String[1];
        strArr2[0] = "A";

        String strRes = "name - " + someNames[0] + ", age - " + strArr2[0] + ", planet - " + strArr3[0];

        System.out.println("someNames = " + Arrays.toString(someNames));
        System.out.println("strArr2 = " + Arrays.toString(strArr2));

        changeElectResult(strArr2);
        changeElectResult(someNames);

        System.out.println("someNames = " + Arrays.toString(someNames));
        System.out.println("strArr2 = " + Arrays.toString(strArr2));

    }

    public static void changeElectResult(String[] strArr) {
        if (strArr.length > 1) {
            String zeroStr = strArr[0];
            strArr[0] = strArr[strArr.length - 1];
            strArr[strArr.length - 1] = zeroStr;
        }
    }

}
