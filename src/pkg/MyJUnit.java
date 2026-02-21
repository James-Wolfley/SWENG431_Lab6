package pkg;

public class MyJUnit extends TestHarness {

    public static void main(String[] args) {
        MyJUnit tool = new MyJUnit();

        for (String className : args) {
            System.out.println("\nRunning: " + className);
            try {
                Class<?> c = Class.forName("pkg." + className);
                TestletIF testlet = (TestletIF) c.getDeclaredConstructor().newInstance();
                testlet.runTest(tool);
            } catch (Exception e) {
                System.out.println("ERROR: Could not load or run " + className + ": " + e.getMessage());
            }
        }

        System.out.println("\nSummary");
        tool.printSummary();
    }
}