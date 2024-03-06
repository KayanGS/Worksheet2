package DefaultPackage;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Geometry3DTest {

    /**
     * Test of cuboidVolume method, of class Geometry3D.
     */
    @Test
    public void testCuboidVolume(){
        //Declare variables
        double length = 2.0, width = 2.0, height = 2.0, expectedVolume = 8.0;
        //Call the cuboidVolume method and set the result to a variable
        double actualVolume = Geometry3D.cuboidVolume(length, width, height);
        //Compare the expected value with the actual value
        assertEquals(expectedVolume, actualVolume, 0.001);
    }
    
    /**
     * Test of cuboidSurface method, of the class Geometry3D
     */
    @Test
    public void testCuboidSurface(){
        //Declare Variables
        double length = 2.0, width = 2.0, height = 2.0, expectedSurface = 12.0;
        //Call the cuboidSurface method and set the result to a variable 
        double actualSurface = Geometry3D.cuboidSurface(length, width, height);
        //Compare the expected value with the actual value
        assertEquals(expectedSurface, actualSurface, 0.001);
    }

    /**
     *  Test of squareBasedPyramidVolume method, of the class Geometry3D
     */
    @Test   
    public void testSquareBasedPyramidVolume(){
        //Declare Variables
        double squareSideLength = 2.0, height = 2.0;
        double expectedPyramidVolume = 2.66;

        //Call the squareBasedPyramidVolume method and set the result to a variable
        double actualPyramidVolume = Geometry3D.squareBasedPyramidVolume
                                                    (squareSideLength, height);

        //Compare the expected value with the actual value
        assertEquals(expectedPyramidVolume, actualPyramidVolume, 0.01);
    }

    /**
     * Test the squareBasedPyramidSurface method, of the class Geometry3D
     */
    @Test
    public void testSquareBasedPyramidSurface(){
        //Declare Variables
        double squareSideLength = 2.0, triangleHeight = 2.0;
        double expectedPyramidSurface = 12.48;
        //Call the squareBasedPyramidVolume method and set the result to a variable
        double actualPyramidSurface = Geometry3D.squareBasedPyramidSurface
                                             (squareSideLength, triangleHeight);
        //Compare the expected value with the actual value
        assertEquals(expectedPyramidSurface, actualPyramidSurface, 0.1);
    }

    /** 
     * Test the TetrahedronVolume method, of the class Geometry3D
     */
    @Test
    public void testTetrahedronVolume(){
        //Declare Variables
        double sideLength = 2.0, expectedTetrahedronVolume = 0.94;
        //Call the tetrahedronVolume method and set the result to a variable
        double actualTetrahedronVolume = Geometry3D.tetrahedronVolume
                                                                (sideLength);
        //Compare the expected value with the actual value 
        assertEquals(expectedTetrahedronVolume, actualTetrahedronVolume, 0.1);
    }

    /**
     * Test the TetrahedronSurface method, of the class Geometry3D
     */
    @Test
    public void testTetrahedronSurface(){
        //Declare Variables
        double sideLength = 2.0, expectedTetrahedronSurface = 3.46;
        //Call the TetrahedronSurface method and set the result to a variable
        double actualTetrahedronSurface = Geometry3D.tetrahedronSurface
                                                                (sideLength);
        //Compare the expected value with the actual value
        assertEquals(expectedTetrahedronSurface, actualTetrahedronSurface, 0.1);

    }

}