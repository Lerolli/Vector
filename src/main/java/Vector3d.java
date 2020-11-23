import java.util.Arrays;

// Класс трехмерного вектора
public class Vector3d extends Vector {

    // Инициализация вектора с помощью трех переменных
    public Vector3d(double x, double y, double z){
        arrayVector = new double[3];
        arrayVector[0] = x;
        arrayVector[1] = y;
        arrayVector[2] = z;
    }

    // Инициализация вектора с помощью массива
    private Vector3d (double[] array) {
            arrayVector = array;
    }

    @Override
    protected Vector CreateVector(double[] array) {
        return new Vector3d(array);
    }

    //Складывает два трехмерных вектора и выводит вектор суммы
    public Vector3d Plus(Vector3d vector) throws Exception {
        var result = this.plus(vector);
        return (Vector3d) result;
    }

    //Вычитает два трехмерных вектора и выводит вектор разности
    public Vector3d Minus(Vector3d vector) throws Exception {
        var result = this.minus(vector);
        return (Vector3d) result;
    }

    //Скалярное произведение между двумя векторами
    public double Scalar(Vector3d vector, double angle){
        return (double) Math.round(vector.GetLength() * this.GetLength() * Math.cos(angle));
    }
    //Находит длину вектора
    public double GetLength() {
        return this.getLength();
    }

    //Векторное произведение между двумя векторами
    public Vector3d VectorWork(Vector3d vector){
        return new Vector3d(arrayVector[1] * vector.arrayVector[2] - vector.arrayVector[1] * arrayVector[2],
                arrayVector[0] * vector.arrayVector[2] - vector.arrayVector[0] * arrayVector[2],
                arrayVector[0] * vector.arrayVector[1] - arrayVector[1] * vector.arrayVector[0]);
    }

    //Сравнивает два вектора по координатам
    @Override
    public boolean equals(Object o) {
        var Vector = ((Vector3d) o);
        if (Vector != null)
            return this.Equals(Vector);
        return false;
    }

    @Override
    public String toString(){
        return ToString();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(arrayVector);
        return result;
    }
}
