import java.util.ArrayList;
import java.util.List;

public class MCHS implements EventProdyser {
    Observer observer;
    private static MCHS mchs;
    private static String messageMCHS1 = "На улице аномальная жара. Не выходите из дома";
    private static String messageMCHS2 = "МЧС информирует об осторожности при купании";
    private static String messageMCHS3 = "МЧС информирует об гололеде";
    List<Observer> observerList = new ArrayList<>();

    @Override
    public void event(String message) {
        if (message.equals("жара")) {
            for (Observer o : observerList) {
                o.attention(messageMCHS1);
            }

        } else if (message.equals("вода")) {
            for (Observer o : observerList) {
                o.attention(messageMCHS2);
            }
        } else if (message.equals("лед")) {
            for (Observer o : observerList) {
                o.attention(messageMCHS3);
            }
        } else {
            System.out.println("Все спокойной");
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    private MCHS() {
    }

    public static MCHS getInstans() {
        if (mchs == null) {
            mchs = new MCHS();
        }
        return mchs;
    }
}
