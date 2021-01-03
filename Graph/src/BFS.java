import java.util.*;

public class BFS {
	Map<String, List<String>> myMaps = new HashMap<String, List<String>>();
	Map<String, List<List<Integer>>> myMapsWeighted = new HashMap<String, List<List<Integer>>>();

	Queue<String> queue = new LinkedList<String>();
	Stack<String> stack = new Stack<String>();

	void addEdge(String key, String value) {
		if (!myMaps.containsKey(key)) {
			myMaps.put(key, new ArrayList<>());
		}
		myMaps.get(key).add(value);

	}

	void traversalBFS(String start) {
		ArrayList<String> visited = new ArrayList<String>();

		visited.add(start);
		queue.add(start);
		while (queue.size() != 0) {
			String node = queue.poll();
			System.out.print(node + " --> ");
			List<String> st = myMaps.get(node);
			for (String string : st) {
				if (!visited.contains(string)) {
					visited.add(string);
					queue.add(string);
				}

			}

		}
	}

	void traversalDFS(String start) {
		ArrayList<String> visited = new ArrayList<String>();

		visited.add(start);
		stack.push(start);
		while (stack.size() != 0) {
			String node = stack.pop();
			System.out.print(node + " --> ");
			List<String> st = myMaps.get(node);
			for (String string : st) {
				if (!visited.contains(string)) {
					visited.add(string);
					stack.push(string);
				}

			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFS bfs = new BFS();
		bfs.addEdge("A", "B");
		bfs.addEdge("A", "C");
		bfs.addEdge("B", "C");
		bfs.addEdge("C", "A");
		bfs.addEdge("C", "D");
		bfs.addEdge("D", "D");

		bfs.traversalBFS("C");
		System.out.println();
		bfs.traversalDFS("C");
	}

}
