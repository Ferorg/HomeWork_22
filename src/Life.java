public class Life implements Observer {
    @Override
    public void attention(String massage) {
        System.out.println("Life. "+massage);
    }
}
