package net.ivoa.dm.dali;
/*
 * Created on 10/05/2023 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */

import net.ivoa.dm.dali.test.ATest;
import net.ivoa.dm.dali.test.DalitestModel;
import org.ivoa.vodml.testing.AutoDBRoundTripTest;
import org.ivoa.vodml.testing.AutoRoundTripWithValidationTest;

import java.util.List;

/**
 * This will run a XML and JSON round trip test on the model inst.
 */
public class DALITypesModelTest extends AutoDBRoundTripTest<DalitestModel, Long, ATest> {

   private ATest aTest;

   @Override
    public DalitestModel createModel() {
        // create the model instance here.
        DalitestModel retval = new DalitestModel();
      aTest = ATest.createATest(
            t -> {
               t.acircle = new Circle(new Point(1.1, 2.4), 4.0);
               t.aninterval = new Interval(4.5, 7.1);
               t.apoint = new Point(5.0, 6.0);
               t.apoly = new Polygon(new Point[]{new Point(5.0, 6.0), new Point(5.0, 7.0), new Point(6.0, 8.0)});
               t.amultishape = new MultiShape(List.of(
                     new Circle(new Point(1.1, 2.4), 4.0), new Circle(new Point(2.4, 4.4), 2.1)
               ));
            }
      );
      retval.addContent(aTest);
        return retval;
    }

    @Override
    public void testModel(DalitestModel daliModel) {
        //this could do specialized testing on the model instance
    }

   @Override
   public ATest entityForDb() {
      return aTest;
   }

   @Override
   public void testEntity(ATest aTest) {

   }
}
