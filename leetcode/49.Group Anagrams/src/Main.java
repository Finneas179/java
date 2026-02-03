import java.util.List;
public static void main(String[] args) {
    Solution demo = new Solution();
    String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> result = demo.groupAnagrams(input);

    System.out.println("分组后的结果是：");
    System.out.println(result);
}

