public class MTC implements Observer {
    @Override
    public void attention(String massage) {
        System.out.println("MTC:  " + massage);
    }
}
