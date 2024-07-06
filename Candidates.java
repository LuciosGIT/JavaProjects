package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Candidates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> votes = new HashMap<>();
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while (line!=null) {
				String [] fields = line.split(",");
				String name = fields[0];
				Integer vote = Integer.parseInt(fields[1]);
				line = br.readLine();
				if(votes.containsKey(name)){
					Integer votesSoFar = votes.get(name);
					votes.put(name, vote+votesSoFar);
				}
				else {
					votes.put(name, vote);
				}
			}
				for(String key : votes.keySet()) {
					System.out.println(key + ": " + votes.get(key));
				}
			}
		
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
}
}