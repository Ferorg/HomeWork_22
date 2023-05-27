public class Main {
    public static void main(String[] args) {
        MCHS mchs=MCHS.getInstans();
        Militia militia=Militia.getInstans();
        Observer life = new Life();
        Observer mtc=new MTC();
        Observer beltelecom=new Beltelecom();
        Observer velcome= new Velcome();

        mchs.addObserver(life);
        mchs.addObserver(mtc);
        mchs.addObserver(beltelecom);
        mchs.addObserver(velcome);

        mchs.event("хорошо");
        mchs.event("вода");
        mchs.event("жара");
        mchs.event("лед");

        militia.addObserver(life);
        militia.addObserver(mtc);
        militia.addObserver(beltelecom);
        militia.addObserver(velcome);

        militia.event("хорошо");
        militia.event("праздник");
        militia.event("сумка");
        militia.event("телефон");
    }
}