package src.ucam.edu;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerAtributos {
    public static void main(String[] args) {
        Result resultEdad = JUnitCore.runClasses(TestAtributoEdad.class);
        for (Failure failure : resultEdad.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Tests Atributo Edad successful: " + resultEdad.wasSuccessful());

    }
}
