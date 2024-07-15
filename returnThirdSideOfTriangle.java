package practice;
public class returnThirdSideOfTriangle{
    public static void main(String[]args) throws Exception
    {
        returnThirdSideOfTriangle r = new returnThirdSideOfTriangle();
        int s3= r.thirdSide(20,18);
        System.out.println(s3);
    }

    int thirdSide(int side1,int side2)
    {
        int side3 = 180-(side1 +side2);
        return side3;
    }
    multiTablePrint m = new multiTablePrint();
    
}
