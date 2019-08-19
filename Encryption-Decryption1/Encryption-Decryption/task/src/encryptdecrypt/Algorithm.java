package encryptdecrypt;

public abstract class Algorithm {
    String algName;
    public Algorithm(String algName){
        this.algName=algName;
    }

    abstract String encrypt(String input, int shift);
    abstract String decrypt(String input, int shift);
}
