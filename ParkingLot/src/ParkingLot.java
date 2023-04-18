import java.time.LocalTime;

public class ParkingLot {

    private Integer [][] matrix;
    private Integer m;
    private Integer n;

    public ParkingLot(int m, int n)
    {
        matrix = new Integer[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
                matrix[i][j] = 0;
        }
        this.m = m;
        this.n = n;
    }

    public <T extends Number> Pair<T> carIn()
    {
        for(Integer row = 0; row < m; row++)
        {
            for(Integer column = 0; column < n ; column++)
            {
                if(matrix[row][column] == 0)
                {
                    matrix[row][column] = 1;
                    Pair <T> tmp = new Pair<T>((T)row, (T)column);
                    return tmp;
                }
            }
        }
        return null;
    }

    public <T extends Number> int carOut(Pair<T> posizione)
    {
        this.matrix[posizione.getX().intValue()][posizione.getY().intValue()] = 0;
        return LocalTime.now().getSecond() - posizione.getLocalTimeSeconds();
    }
}
