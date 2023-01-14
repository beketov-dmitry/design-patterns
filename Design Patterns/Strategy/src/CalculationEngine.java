public class CalculationEngine {
    private IStrategy strategy;
    private ICollection<Integer> list;

    public CalculationEngine(ICollection<Integer> list)
    {
        this.list = list;
        strategy = new AscendingSortStrategy();
    }

    public void SetStrategy(IStrategy strategy)
    {
        this.strategy = strategy;
    }

    public void Sort()
    {
        list = strategy.Sort(list);
    }

    public void Print()
    {
       list
    }
}
