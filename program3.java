import java.io.*;  
import java.util.*;  
public class program3  
{  
     public static void main(String[] args) throws Exception
     {  
         Scanner sc = new Scanner(new File("Words.csv"));  
         Map<String,Integer> mp = new HashMap<String,Integer>();
         sc.useDelimiter(","); 
         while (sc.hasNext())    
         { 
             mp.put(sc.next(),mp.getOrDefault(sc.next(),0)+1);  
         }   
        int k=0;
        List<String> top_words=new ArrayList<String>();
        List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >( mp.entrySet());
        Collections.sort(list,(i1,i2) -> i2.getValue().compareTo(i1.getValue()));
        for (Map.Entry<String, Integer> aa : list) 
        {
            if(k<=3)
            {
                top_words.add(aa.getKey());
                k++;
            }
            else
                break;
        }
        System.out.println(top_words.get(0)+"\n"+top_words.get(1)+"\n"+top_words.get(2)+"\n");
        sc.close();   
     }
}  