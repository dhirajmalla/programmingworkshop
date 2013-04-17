/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacewar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author ioanajuja
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({spacewar.SouthTest.class, spacewar.picture.PictureSuite.class, spacewar.FantasiaTest.class, spacewar.GameLoaderTest.class, spacewar.AlienTest.class, spacewar.NorthTest.class, spacewar.BulletTest.class, spacewar.ShipTest.class})
public class SpacewarSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
