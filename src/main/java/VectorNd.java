import java.util.Arrays;

// Класс пятимерного вектора
public class VectorNd extends Vector {

    // Инициализация вектора с помощью пяти переменных
    public VectorNd(double ... array){
        arrayVector = array;
    }

    //Складывает два n-мерных вектора и выводит вектор суммы
    public VectorNd Plus(VectorNd vector) throws Exception {
        if (this.arrayVector.length != vector.arrayVector.length)
            throw new Exception("Длины векторов различные");
        var result = this.plus(vector);
        return (VectorNd) result;
    }

    //Вычитает два n-мерных вектора и выводит вектор разности
    public VectorNd Minus(VectorNd vector) throws Exception {
        if (this.arrayVector.length != vector.arrayVector.length)
            throw new Exception("Длины векторов различные");
        var result = this.minus(vector);
        return (VectorNd) result;
    }

    //Скалярное произведение между двумя векторами
    public double Scalar(VectorNd vector, double angle) throws Exception {
        if (this.arrayVector.length != vector.arrayVector.length)
            throw new Exception("Длины векторов различные");
        return (double) Math.round(vector.GetLength() * this.GetLength() * Math.cos(angle));
    }
    //Находит длину вектора
    public double GetLength() {
        return getLength();
    }

    //Сравнивает два вектора по координатам
    @Override
    public boolean equals(Object o) {
        var vectorNd = (VectorNd) o;
        if (vectorNd != null)
            return this.Equals(vectorNd);
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
