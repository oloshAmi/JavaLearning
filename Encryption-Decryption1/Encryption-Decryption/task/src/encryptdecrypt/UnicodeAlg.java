package encryptdecrypt;

public class UnicodeAlg extends Algorithm {
    public UnicodeAlg(String algName) {
        super(algName);
    }

    @Override
    public String encrypt(String input, int shift) {

        char[] a = input.toCharArray();
        for (int i = 0; i < a.length; i++) {
            a[i] += shift;
        }
        return String.valueOf(a);
    }

    @Override
    public String decrypt(String input, int shift) {

        char[] a = input.toCharArray();
        for (int i = 0; i < a.length; i++) {
            a[i] -= shift;
        }
        return String.valueOf(a);
    }

}
