public class Main {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};

        MinhaThreadCalculadora t1 = new MinhaThreadCalculadora("1", vetor);
        MinhaThreadCalculadora t2 = new MinhaThreadCalculadora("2", vetor);

    }
}
