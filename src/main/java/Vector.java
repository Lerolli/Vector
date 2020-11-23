abstract class Vector{
    public double[] arrayVector;

    private Vector(double[] a){
        arrayVector = a;
    }

    protected Vector() {
    }

    protected abstract Vector CreateVector(double[] array);

    public Vector plus(Vector vector) throws Exception {
        var arrayVector1 = vector.arrayVector;
        var resultArray = new double[arrayVector1.length];
        for (int i = 0; i < arrayVector1.length; i++)
            resultArray[i] = arrayVector1[i] + arrayVector[i];
        return CreateVector(resultArray);
    }


    public Vector minus(Vector vector) throws Exception {
        var resultArray = new double[arrayVector.length];
        for (int i = 0; i < arrayVector.length; i++)
            resultArray[i] = arrayVector[i] - vector.arrayVector[i];
        return CreateVector(resultArray);
    }

    public boolean Equals(Vector vector) {
        for (int i = 0; i < arrayVector.length; i++) {
            if (arrayVector[i] != vector.arrayVector[i])
                return false;
        }
        return true;
    }

    public int hashCode() {
        return (int) (arrayVector[0] * 223 - 90*444 + 2211 - arrayVector[1]);
    }


    public String ToString() {
        var stringBuilder = new StringBuilder();
        stringBuilder.append('{');
        for (int i = 0; i < arrayVector.length; i++) {
            if (i == arrayVector.length - 1)
                stringBuilder.append("x").append(i + 1).append("=").append(arrayVector[i]);
            else
                stringBuilder.append("x").append(i + 1).append("=").append(arrayVector[i]).append(",").append(" ");
        }
        stringBuilder.delete(arrayVector.length , arrayVector.length);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public double getLength() {
        var sum = 0;
        for (double x : arrayVector) {
            sum += x * x;
        }
        return Math.sqrt(sum);
    }
}

