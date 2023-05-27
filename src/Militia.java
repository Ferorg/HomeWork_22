import java.util.ArrayList;
import java.util.List;

public class Militia implements EventProdyser {
    private static Militia militia;
    Observer observer;
    private List<Observer> observerList = new ArrayList<>();
    private static String massageMilitia1 = "МВД.Осторожно при Проведении праздников";
    private static String massageMilitia2 = "При нахождении безхозной сумки обращаться в Милицию";
    private static String massageMilitia3 = "МВД предупраждает о мошейниках";

    private Militia() {
    }

    public static Militia getInstans() {
        if (militia == null) {
            militia = new Militia();
        }
        return militia;
    }

    @Override
    public void event(String message) {
        if (message.equals("праздник")) {
            for (Observer o : observerList) {
                o.attention(massageMilitia1);
            }
        } else if (message.equals("сумка")) {
            for (Observer o : observerList) {
                o.attention(massageMilitia2);
            }
        } else if (message.equals("телефон")) {
            for (Observer o : observerList) {
                o.attention(massageMilitia3);
            }
        } else {
            System.out.println("Все спокойной");
        }
    }


    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }
}
