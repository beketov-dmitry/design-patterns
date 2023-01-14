import java.util.ArrayList;

public class Program {
    public static void Main()
    {
        var list = new ArrayList<Integer>;

        var calculationEngine = new CalculationEngine(list);

        calculationEngine.Sort();
        calculationEngine.Print();

        var strategy = new DescendingSortStrategy();
        calculationEngine.SetStrategy(strategy);

        calculationEngine.Sort();
        calculationEngine.Print();
    }
}
