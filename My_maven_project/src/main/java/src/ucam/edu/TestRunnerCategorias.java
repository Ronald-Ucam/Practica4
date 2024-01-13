package src.ucam.edu;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerCategorias {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestCategorias.class);
        
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Tests successful: " + result.wasSuccessful());
    }
}
