import java.util.Arrays;

// Класс семимерного вектора
public class Vector7d extends Vector {

    // Инициализация вектора с помощью семи переменных
    public Vector7d(double x1, double x2, double x3, double x4, double x5, double x6, double x7){
        arrayVector = new double[7];
        arrayVector[0] = x1;
        arrayVector[1] = x2;
        arrayVector[2] = x3;
        arrayVector[3] = x4;
        arrayVector[4] = x5;
        arrayVector[5] = x6;
        arrayVector[6] = x7;
    }

    // Инициализация вектора с помощью массива
    public Vector7d(double[] array) throws Exception {
        if (array.length == 7)
            arrayVector = array;
        else
            throw new Exception("Неверно задана длина вектора");
    }

    //Складывает два семимерных вектора и выводит вектор суммы
    public Vector7d Plus(Vector7d vector) throws Exception {
        var result = this.plus(vector);
        return (Vector7d) result;
    }

    //Вычитает два семимерных вектора и выводит вектор разности
    public Vector7d Minus(Vector7d vector) throws Exception {
        var result = this.minus(vector);
        return (Vector7d) result;
    }

    //Скалярное произведение между двумя векторами
    public double Scalar(Vector7d vector, double angle){
        return (double) Math.round(vector.GetLength() * this.GetLength() * Math.cos(angle));
    }

    //Находит длину вектора
    public double GetLength() {
        return getLength();
    }

    //Сравнивает два вектора по координатам
    @Override
    public boolean equals(Object o) {
        var vector = (Vector7d) o;
        if (vector != null)
            return this.Equals(vector);
        return false;
    }

    @Override
    public String toString() {
        return ToString();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(arrayVector);
        return result;
    }
}
