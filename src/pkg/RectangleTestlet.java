package pkg;

public class RectangleTestlet implements TestletIF {

    Rectangle r = new Rectangle();

    @Override
    public void runTest(TestHarness harness) {
        System.out.println("Boundary Value Analysis for Rectangle.getArea(w, h)");
        System.out.println("Input range: [1, 10]");

        harness.checkEqual(r.getArea(1, 5),   5);
        harness.checkEqual(r.getArea(2, 5),   10);
        harness.checkEqual(r.getArea(5, 5),   25);
        harness.checkEqual(r.getArea(9, 5),   45);
        harness.checkEqual(r.getArea(10, 5),  50);

        harness.checkEqual(r.getArea(5, 1),   5);
        harness.checkEqual(r.getArea(5, 2),   10);
        harness.checkEqual(r.getArea(5, 5),   25);
        harness.checkEqual(r.getArea(5, 9),   45);
        harness.checkEqual(r.getArea(5, 10),  50);
    }
}