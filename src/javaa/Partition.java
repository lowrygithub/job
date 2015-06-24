package javaa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Partition {
	/*public static void main(String[] args){
		Map<String,Set<String>> map = new HashMap<String,Set<String>>();
		
		Set<String> s1 = new HashSet<String>();
		s1.add("2");s1.add("3");map.put("1", s1);

		Set<String> s2 = new HashSet<String>();
		s2.add("1");s2.add("3");map.put("2", s2);

		Set<String> s3 = new HashSet<String>();
		s3.add("1");s3.add("2");map.put("3", s3);

		Set<String> s4 = new HashSet<String>();
		s4.add("5");			map.put("4", s4);

		Set<String> s5 = new HashSet<String>();
		s5.add("4");s5.add("6");map.put("5", s5);

		Set<String> s6 = new HashSet<String>();
		s6.add("5");			map.put("6", s6);
		
		
		
		Partition p = new Partition();
		p.output(map);
		p.output(p.partition(map));
		
	}
	public void output(Map partition) {
		for(Object key: partition.keySet()){
			System.out.println(key+":"+partition.get(key));
		}
	}*/
	
	/**
	 * 输入邻接表（Map格式），输出联通社团（Map格式）
	 * @param Map<String,Set<String>>
	 * @return Map<Integer, Set<String>>
	 */
	public Map<Integer, Set<String>> partition(Map<String,Set<String>> map) {
		Set<String> set = new HashSet<String>(map.keySet());
		Map<Integer, Set<String>> resultMap = new HashMap<Integer, Set<String>>();
		int gId = 1;
		while (!set.isEmpty()) {
			Iterator<String> itrBegin = set.iterator();
			Set<String> queueSet = new HashSet<String>();
			String next = itrBegin.next();
			queueSet.add(next);
			set.remove(next);
			Set<String> groupSet = new HashSet<String>();
			groupSet.add(next);
			while (!queueSet.isEmpty()) {
				Iterator<String> itrQueueSet = queueSet.iterator();
				String queueSetNext = itrQueueSet.next();
				queueSet.remove(queueSetNext);
				Set<String> adjSet = new HashSet<String>();
				System.out.println("queueSetNext:"+queueSetNext);
				System.out.println("map.get(queueSetNext) : "+map.get(queueSetNext));
				adjSet.addAll(map.get(queueSetNext));

				adjSet.retainAll(set);
				queueSet.addAll(adjSet);
				groupSet.addAll(adjSet);
				set.removeAll(adjSet);
			}
			resultMap.put(gId, groupSet);
			gId ++;
		}
		return resultMap;
	}
}
