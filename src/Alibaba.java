import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: woody
 * Date: 7/14/14
 * Time: 12:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
	private static class Trie {
		public int count;
		public Map<Character, Trie> children;

		public Trie() {
			this.count = 0;
			this.children = new TreeMap<Character, Trie>();
		}

		public void insert(String word) {
			Trie trie = this;
			trie.count++;
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (!trie.children.containsKey(ch)) {
					trie.children.put(ch, new Trie());
				}
				trie.children.get(ch).count++;
				trie = trie.children.get(ch);
			}
		}

		public int getCountByPrefix(String prefix) {
			Trie trie = this;
			for (int i = 0; i < prefix.length(); i++) {
				char ch = prefix.charAt(i);
				if (!trie.children.containsKey(ch)) {
					return 0;
				}
				trie = trie.children.get(ch);
			}
			return trie.count;
		}
	}

	public static void main(String[] args) {
		Trie trie = new Trie();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			trie.insert(scanner.next());
		}

		int m = scanner.nextInt();
		for (int i = 0; i < m; i++) {
			String prefix = scanner.next();
			System.out.println(trie.getCountByPrefix(prefix));
		}
	}
}
