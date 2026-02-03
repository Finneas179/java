import java.util.*;
class Solution {
    public List<List<String>>/*一个list包裹一个list*/ groupAnagrams(String[] strs) {
        Map<String ,List<String>>map = new HashMap<>();
        //创建一个哈希表，前面的string是key，后面的是value值，就是说右边的申请一块内存来存储这个哈希表，然后
        for(String s : strs){//这就是游历所有的strs所有值
            char[]chars=s.toCharArray();//把每一个字符串分来成char
            Arrays.sort(chars);//按照abcde的顺序排列
            String key = new String (chars);//弄成一个新的然后赋值
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());//没有就新建一个
            }
            map.get(key).add(s);//在对应的key添加对应的s
        }
        return new ArrayList <>(map.values());//返回return
    }
}