package net.ivoa.dm.dali;
/*
 * Created on 10/05/2023 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */

import org.ivoa.vodml.testing.AutoRoundTripWithValidationTest;

/**
 * This will run a XML and JSON round trip test on the model inst.
 */
public class DALITypesModelTest extends AutoRoundTripWithValidationTest<DaliModel> {
    @Override
    public DaliModel createModel() {
        // create the model instance here.
        DaliModel retval = new DaliModel();

//TODO really need to create another model that imports and does things with DALI one to do useful tests
        return retval;
    }

    @Override
    public void testModel(DaliModel daliModel) {
        //this could do specialized testing on the model instance
    }
}
