import java.util.Arrays;

// Класс пятимерного вектора
public class Vector5d extends Vector {

    // Инициализация вектора с помощью пяти переменных
    public Vector5d(double x1, double x2, double x3, double x4, double x5){
        arrayVector = new double[5];
        arrayVector[0] = x1;
        arrayVector[1] = x2;
        arrayVector[2] = x3;
        arrayVector[3] = x4;
        arrayVector[4] = x5;
    }

    // Инициализация вектора с помощью массива
    public Vector5d(double[] array) throws Exception {
        if (array.length == 5)
            arrayVector = array;
        else
            throw new Exception("Неверно задана длина вектора");
    }

    @Override
    protected Vector CreateVector(double[] array) {
        return null;
    }

    //Складывает два пятимерных вектора и выводит вектор суммы
    public Vector5d Plus(Vector5d vector) throws Exception {
        var result = this.plus(vector);
        return (Vector5d) result;
    }

    //Вычитает два пятимерных вектора и выводит вектор разности
    public Vector5d Minus(Vector5d vector) throws Exception {
        var result = this.minus(vector);
        return (Vector5d) result;
    }

    //Скалярное произведение между двумя векторами
    public double Scalar(Vector5d vector, double angle){
        return (double) Math.round(vector.GetLength() * this.GetLength() * Math.cos(angle));
    }
    //Находит длину вектора
    public double GetLength() {
        return getLength();
    }

    //Сравнивает два вектора по координатам
    @Override
    public boolean equals(Object o) {
        var vector = ((Vector5d) o);
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
