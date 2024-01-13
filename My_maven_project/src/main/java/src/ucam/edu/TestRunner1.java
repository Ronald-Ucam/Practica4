package src.ucam.edu;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner1 {
    public static void main(String[] args) {
        Result resultM = JUnitCore.runClasses(TestPartitionM.class);
        for (Failure failure : resultM.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Tests M successful: " + resultM.wasSuccessful());

        Result resultNM = JUnitCore.runClasses(TestPartitionNM.class);
        for (Failure failure : resultNM.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Tests NM successful: " + resultNM.wasSuccessful());
    }
}
