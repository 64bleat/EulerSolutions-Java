package problems;

import java.util.*;

import supplemental.FileLoader;

public class P_008 extends P_0
{ 
  public long run()
  {
    FileLoader fl = new FileLoader();
    LinkedList<LinkedList<Integer>> n = fl.loadIntArray("/files/P_8.txt");
    LinkedList<Integer> nList = new LinkedList<Integer>();
    long answer = 0;
    
    for(LinkedList<Integer> y: n)
      for(Integer x: y)
        nList.add(x);
    
    for(int i = 0; i < nList.size() -13; i++)
    {
      long candidate = 1;
      
      for(int x = i; x - i < 13; x++)
        candidate *= nList.get(x);
      
      if(candidate > answer)
        answer = candidate;
    }
    
    return answer;
  }
}
