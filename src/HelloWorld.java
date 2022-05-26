public class HelloWorld {
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
    public static void main(String[] args){
        HelloWorld martkutxedi;
        martkutxedi = new HelloWorld();
        martkutxedi.setSigane(10);
        martkutxedi.setSigrdze(13);
        System.out.println("perimetri aris: " + martkutxedi.getPerimetri());
        System.out.println("fartobi aris: " + martkutxedi.getFartobi());

    }
}
