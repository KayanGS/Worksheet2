package DefaultPackage;

public class Geometry3D {
    
    /**
     * @param length
     * @param width
     * @param height
     * @return the volume of a cuboid
     */
    public static double cuboidVolume(double length, double width, double height){
        return length * width * height; //############### RETURN ###############
    }    

    /**
     * @param length
     * @param width
     * @param height
     * @return the surface of a cuboid
     */
    public static double cuboidSurface(double length, double width, double height){
        return 2.0 * (length + width + height); //########### RETURN ###########

    }

    /**
     * @param baseArea
     * @param height
     * @return the volume of a square based pyramid
     */
    public static double squareBasedPyramidVolume(double squareSideLength, double height){
        //Formula = (1/3) * SquareSideLength ^ 2 * height
        return ((1.0/3.0) * Math.pow(squareSideLength, 2) * height); //############## RETURN ##############
    }
 
    /**
     * @param squareSideLength
     * @param triangleHeight
     * @return the surface of a square based pyramid
     */
    public static double squareBasedPyramidSurface(double squareSideLength, double triangleHeight){
    //Formula = SquareSideLength^2 + 2 * SquareSideLength * Slant Height
    //Slant Height Formula = SquareSideLength * SquareRoot(SquareSideLength^2 + 4 * triangleHeight^2)
    //Simplifying = a^2 + a * SquareRoot(a^2 + 4 * h^2)
    return Math.pow(squareSideLength, 2) 
                + squareSideLength 
                * Math.sqrt(squareSideLength 
                        + 4 
                        * Math.pow(triangleHeight, 2)); //############## RETURN ##############
    }  
    
    /**
     * @param sideLength
     * @return the volume of a tetrahedron
     */
    public static double tetrahedronVolume(double sideLength){
        return Math.pow(sideLength, 3) / (6 * Math.sqrt(2)); //############## RETURN ##############
    }

    /**
     * @param sideLength
     * @return the volume of a tetrahedron
     */
    public static double tetrahedronSurface(double sideLength){
        return Math.sqrt(3 * Math.pow(sideLength, 2));
    }
}