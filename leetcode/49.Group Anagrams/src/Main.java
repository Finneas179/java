import java.util.List;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public static void main(String[] args) {
    Solution demo = new Solution();
    String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> result = demo.groupAnagrams(input);

    System.out.println("分组后的结果是：");
    System.out.println(result);
}

