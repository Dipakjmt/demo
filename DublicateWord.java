import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DublicateWord {

	public static void main(String[] args) {
		 
        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
     
        
     
		

	


     
        
         
        HashMap<String, Integer> wordCountMap1 = new HashMap<String, Integer>();
     
      
        
              
            
             
                
                 
                String[] words={"AAA","AAA","BBB","BBB","BBB","CC","CC","XXX","XXX","PP","QQ","XXX","XXX"};
                 
                
                 
                for (String word : words)
                {
                    //if word is already present in wordCountMap, updating its count
                     
                    if(wordCountMap1.containsKey(word))
                    {    
                        wordCountMap1.put(word, wordCountMap1.get(word)+1);
                    }
                     
                    //otherwise inserting the word as key and 1 as its value
                    else
                    {
                        wordCountMap1.put(word, 1);
                    }
                }
                 
                
             
            
             
            String most5RepeatedWord = null;
             
            int count = 0;
             
            Set<Entry<String, Integer>> entrySet = wordCountMap1.entrySet();
             
            for (Entry<String, Integer> entry : entrySet)
            {
                if(entry.getValue() > count)
                {
                	
                    most5RepeatedWord = entry.getKey();
                     
                    count = entry.getValue();
                    System.out.println(most5RepeatedWord +"\t"+count);
                }
            }
             
           // System.out.println("The most repeated word in input file is : "+most5RepeatedWord);
             
            System.out.println("Number Of Occurrences : "+count);
        } 
        
            
        
    }    

