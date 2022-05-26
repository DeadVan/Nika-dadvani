public class manipulation {
    private int a;
    private int b;
    private int p;
    private int s;


    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.a = a;
    }

    public int getP() {
        return (a + b)*2;
    }

    public int getS() {
        return a * b;
    }
    public static void main(String[] args){
        manipulation martkutxedi = new manipulation();
        manipulation martkutxedi2 = new manipulation();
        System.out.println(martkutxedi.getS()); // დაბეჭდავს ნულს იმიტორო არ გადავეციტ პარამეტრები და 0 აღიგქვა
        martkutxedi2.setA(13);
        martkutxedi2.setB(17);
        martkutxedi.setA(13);
        martkutxedi.setB(17);
        System.out.println(martkutxedi == martkutxedi2);
        //დაპრინტავს falses იმიტომ რომ ადარებს მეხსიერებაში მყოფ ადგილებს და ორივეს მდეობარეობს სხვადასხვა მეხსიერების გროვაში.
        martkutxedi = martkutxedi2;
        System.out.println(martkutxedi == martkutxedi2); // მა შემთხვევაში trues gamoitans რადგან
        // martkutxedi = martkutxedi2; ამ მოქმედებით მართკუთხედის მდებარეობა გადავიდა მართკუთხედი2 ის მდებარეობაში
        martkutxedi = null;
        System.out.println(martkutxedi.getS()); // Exception in threads





    }
}
