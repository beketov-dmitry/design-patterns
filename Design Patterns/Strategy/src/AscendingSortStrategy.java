public class AscendingSortStrategy extends IStrategy
{
   public ICollection<Integer> Sort(ICollection<Integer> list) {
        return list.OrderBy(i => i).ToList();
   }
}