package encryptdecrypt;

public class CryptoVendor extends CryptographyFactory {
    public Algorithm createAlgorithm(String type){
        switch (type){
            case "unicode":
                return new UnicodeAlg("unicode");
            case "shift":
                return new ShiftCodeAlg("shiftCode");
            default:
                return null;
        }
    }
}
