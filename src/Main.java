public class Main {
    public static void main(String[] args) {

        Cena john = new Cena();
        john.entranceThemeMusic();
        john.combo1();
        john.combo2();
        john.finisher();
        john.paymentForWork(20);
    }
}

abstract class Wrestler{
    public void paymentForWork(int hours){
        System.out.println("\nThe wrestler gets paid $" +hours*250.00);
    }
    public abstract void entranceThemeMusic();
    public abstract void finisher();
    public abstract void combo1();
    public abstract void combo2();
}

class Cena extends Wrestler{
    @Override
    public void entranceThemeMusic() {
        System.out.println("\n[Music: AND HIS NAME IS JOHN CENAAAAAAAAA!]");
    }

    @Override
    public void finisher() {
        System.out.println("\n***KNOCKOUT!!!***\n...It happened so fast you could hardly see 'em.");
    }

    @Override
    public void combo1() {
        System.out.println("\nLeft hook! Right hook! Chair!");
    }

    @Override
    public void combo2() {
        System.out.println("\nRight punch! Body slam!");
    }
}