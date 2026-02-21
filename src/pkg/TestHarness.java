package pkg;

public class TestHarness {

    private int passed = 0;
    private int failed = 0;

    public boolean checkEqual(int actual, int expected) {
        if (actual == expected) {
            System.out.println("PASS: expected " + expected + ", got " + actual);
            passed++;
            return true;
        } else {
            System.out.println("FAIL: expected " + expected + ", got " + actual);
            failed++;
            return false;
        }
    }

    public boolean checkEqual(double actual, double expected) {
        if (actual == expected) {
            System.out.println("PASS: expected " + expected + ", got " + actual);
            passed++;
            return true;
        } else {
            System.out.println("FAIL: expected " + expected + ", got " + actual);
            failed++;
            return false;
        }
    }

    public void printSummary() {
        System.out.println("Results: " + passed + " passed, " + failed + " failed.");
    }
}