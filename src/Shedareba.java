public class Shedareba {
    private int k;
    private int b;
    private int sigane;

    public void setSigane(int sigane) {
        this.sigane = sigane;
    }
    private int sigrdze;

    public void setSigrdze(int sigrdze) {
        this.sigrdze = sigrdze;
    }
    private int perimetri;
    private int fartobi;

    public int getFartobi() {
        return sigane * sigrdze;
    }

    public int getPerimetri() {
        return (sigane + sigrdze)* 2;
    }
    public static void main(String[] args) {
        Shedareba martkutxedi;
        Shedareba markutxedi2;
        martkutxedi = new Shedareba();
        markutxedi2 = new Shedareba();
        markutxedi2.setSigane(6);
        markutxedi2.setSigrdze(9);
        martkutxedi.setSigane(5);
        martkutxedi.setSigrdze(14);
        int k = martkutxedi.getFartobi();
        int b = markutxedi2.getFartobi();
        if (k > b) {
            System.out.println("1");
        }else if(k < b){
            System.out.println("-1");
        }else {
            System.out.println("0");
        }
    }
}
