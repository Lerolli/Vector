import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VectorTest {

    Vector3d vector3d = new Vector3d(1,1,1);
    Vector3d another3d = new Vector3d(2,4,6);

    Vector5d vector5d = new Vector5d(1,1,1,1,1);
    Vector5d another5d = new Vector5d(2,2,2,2,2);

    Vector7d vector7d = new Vector7d(1,1,1,1,1,1,1);
    Vector7d another7d = new Vector7d(2,2,2,2,2,2,2);

    VectorNd vectorNd = new VectorNd(1,1,1,1,1,1,1,1,1,1);
    VectorNd anotherNd = new VectorNd(2,2,2,2,2,2,2,2,2,2);

    @Test
    public void plus3d() throws Exception {
        assertEquals("Проверка трехмерного вектора", new Vector3d(3,5,7), vector3d.Plus(another3d));
    }

    @Test
    public void plus5d() throws Exception {
        assertEquals("Проверка пятимерного вектора", new Vector5d(3,3,3,3,3), vector5d.Plus(another5d));
    }

    @Test
    public void plus7d() throws Exception {
        assertEquals("Проверка семимерного вектора", new Vector7d(3,3,3,3,3,3,3), vector7d.Plus(another7d));
    }
    @Test
    public void plusNd() throws Exception {
        assertEquals("Проверка n-мерного вектора", new VectorNd(3,3,3,3,3,3,3,3,3), vectorNd.Plus(anotherNd));
    }

    @Test
    public void minus() throws Exception {
        assertEquals("Проверка трехмерного вектора", new Vector3d(-1,-3,-5), vector3d.Minus(another3d));
        assertEquals("Проверка пятимерного вектора", new Vector5d(-1,-1,-1,-1,-1), vector5d.Minus(another5d));
        assertEquals("Проверка семимерного вектора", new Vector7d(-1,-1,-1,-1,-1,-1,-1), vector7d.Minus(another7d));
        assertEquals("Проверка n-мерного вектора", new VectorNd(-1,-1,-1,-1,-1,-1,-1,-1,-1), vectorNd.Minus(anotherNd));

    }



    @Test
    public void TestScalar() throws Exception {
        assertEquals("Проверка трехмерного вектора", -3.0, vector3d.Scalar(vector3d, Math.PI), 0.001);
        assertEquals("Проверка пятимерного вектора", -5, vector5d.Scalar(vector5d, Math.PI), 0.001);
        assertEquals("Проверка семимерного вектора", -7, vector7d.Scalar(vector7d, Math.PI), 0.001);
        assertEquals("Проверка n-мерного вектора", -vectorNd.arrayVector.length, vectorNd.Scalar(vectorNd, Math.PI), 0.001);
    }

    @Test
    public void VectorWork(){
        assertEquals("Проверка трехмерного вектора на векторное произведение, если i,j,k = 1",
                new Vector3d(0,0,0), vector3d.VectorWork(new Vector3d(2,2,2)));
    }

    @Test
    public void testEquals() {
        assertEquals("Проверка трехмерного вектора", vector3d, vector3d);
        assertEquals("Проверка пятимерного вектора", vector5d, vector5d);
        assertEquals("Проверка семимерного вектора", vector7d, vector7d);
        assertEquals("Проверка n-мерного вектора", vectorNd, vectorNd);
    }

    @Test
    public void testHashCode() {
    }

    @Test
    public void testToString() {
        assertEquals("{x1=1.0, x2=1.0, x3=1.0}", vector3d.toString());
        assertEquals("{x1=1.0, x2=1.0, x3=1.0, x4=1.0, x5=1.0}", vector5d.toString());
        assertEquals("{x1=1.0, x2=1.0, x3=1.0, x4=1.0, x5=1.0, x6=1.0, x7=1.0}", vector7d.toString());
        assertEquals("{x1=1.0, x2=1.0, x3=1.0, x4=1.0, x5=1.0, x6=1.0, x7=1.0, x8=1.0, x9=1.0, x10=1.0}", vectorNd.toString());

    }
}