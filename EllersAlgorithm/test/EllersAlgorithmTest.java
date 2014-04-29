import org.junit.Assert;
import org.junit.Test;
import com.seroperson.generator.EllersAlgorithm;

public class EllersAlgorithmTest extends Assert {

        @Test
        public void testCases() {
                testCreating(0, 0);
                System.out.println("Created 0; 0;");
                testCreating(1, 1);
                System.out.println("Created 1; 1;");
                testCreating(1, 10);
                System.out.println("Created 1; 10;");
                testCreating(10, 1);
                System.out.println("Created 10; 1;");
                testCreating(10, 10);
                System.out.println("Created 10; 10;");
                testCreating(100, 100);
                System.out.println("Created 100; 100;");
                testCreating(1000, 1000);
                System.out.println("Created 1000; 1000;");
        }

        private void testCreating(int w, int h) {
                EllersAlgorithm ea = new EllersAlgorithm(w, h, false);
                for(int i = 0; i < w; i++) ea.step(i);
        }

}
