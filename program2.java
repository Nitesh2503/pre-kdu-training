import java.util.*;
class program2 {
    public static void main(String[] args) {
        String[] str_arr=new String[3];
        ArrayList<String> str_list=new ArrayList<String>();
        HashSet<String> str_set=new HashSet<String>();
        HashMap<String,Integer> str_map=new HashMap<String,Integer>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
              str_arr[i]=sc.nextLine();
              str_list.add(str_arr[i]);
              str_set.add(str_arr[i]);
              
              if (str_map.containsKey(str_arr[i]))
                str_map.put(str_arr[i], str_map.get(str_arr[i]) + 1);
 
            else
                str_map.put(str_arr[i], 1);
        }
        System.out.println("\nList Contains: ");
        for(int i=0;i<str_list.size();i++)
        {
              System.out.println(str_list.get(i));
        }
        System.out.println("\nSet Contains: ");
        Iterator<String> itr=str_set.iterator();  
        while(itr.hasNext())  
        {  
           System.out.println(itr.next());  
        }  
        
        System.out.println("\nFrequency of the words: ");
        for (HashMap.Entry<String,Integer> element : str_map.entrySet()) 
            System.out.println("Word = " + element.getKey() +
                             ", Frequency = " + element.getValue());
    }
}