public class DescendingSortStrategy extends IStrategy
{
    public ICollection<Integer> Sort(ICollection<Integer> list) {
        return list.OrderByDescending(i => i).ToList();
    }
}