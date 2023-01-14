public class Program
{
    public static void Main(String[] args)
    {
        var dbConnection = new DbConnection();

        String str = "SELECT * FROM ...";

        dbConnection.Open();
        dbConnection.Process(str);
        dbConnection.Close();
    }
}