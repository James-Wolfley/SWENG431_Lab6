package pkg;

public class BoxTestlet implements TestletIF {

    Box b = new Box();

    @Override
    public void runTest(TestHarness harness) {
        System.out.println("Boundary Value Analysis for Box.getVolume(l, w, h)");
        System.out.println("Input range: [1, 10]");

        harness.checkEqual(b.getVolume(1,  5, 5),  25.0);
        harness.checkEqual(b.getVolume(2,  5, 5),  50.0);
        harness.checkEqual(b.getVolume(5,  5, 5), 125.0);
        harness.checkEqual(b.getVolume(9,  5, 5), 225.0);
        harness.checkEqual(b.getVolume(10, 5, 5), 250.0);

        harness.checkEqual(b.getVolume(5, 1,  5),  25.0);
        harness.checkEqual(b.getVolume(5, 2,  5),  50.0);
        harness.checkEqual(b.getVolume(5, 5,  5), 125.0);
        harness.checkEqual(b.getVolume(5, 9,  5), 225.0);
        harness.checkEqual(b.getVolume(5, 10, 5), 250.0);

        harness.checkEqual(b.getVolume(5, 5, 1),   25.0);
        harness.checkEqual(b.getVolume(5, 5, 2),   50.0);
        harness.checkEqual(b.getVolume(5, 5, 5),  125.0);
        harness.checkEqual(b.getVolume(5, 5, 9),  225.0);
        harness.checkEqual(b.getVolume(5, 5, 10), 250.0);
    }
}