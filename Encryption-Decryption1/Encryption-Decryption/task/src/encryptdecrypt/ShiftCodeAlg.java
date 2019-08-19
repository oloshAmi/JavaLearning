package encryptdecrypt;

public class ShiftCodeAlg extends Algorithm {

    public ShiftCodeAlg(String algName) {
        super(algName);
    }

    @Override
    public String encrypt(String input, int shift) {

        char[] a = input.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 97 && a[i] <= 122) {
                a[i] += shift;
                if (a[i] > 122) {
                    a[i] = (char) (97 + (a[i] % 122) - 1);
                }
            } else if (a[i] >= 65 && a[i] <= 90) {
                a[i] += shift;
                if (a[i] > 90) {
                    a[i] = (char) (65 + (a[i] % 90) - 1);
                }
            }
        }
        return String.valueOf(a);
    }

    @Override
    public String decrypt(String input, int shift) {

        char[] a = input.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 97 && a[i] <= 122) {
                a[i] -= shift;
                if (a[i] < 97) {
                    a[i] = (char) (122 - (97 % a[i]) + 1);
                }
            } else if (a[i] >= 65 && a[i] <= 90) {
                a[i] -= shift;
                if (a[i] < 65) {
                    a[i] = (char) (90 + (65 % a[i]) + 1);
                }
            }
        }
        return String.valueOf(a);
    }


}

