package assignment11;

import java.util.HashMap;
import java.io.*;

class FileManager {
	/*hash map of all the characters with frequencies as key value pairs*/
	HashMap<Character, Integer> characters = new HashMap<Character, Integer>();
	
	/*writes the hashmap in to a textfile*/
	void writeToFile() {
		try {
			File textFile = new File("/home/zadmin/Desktop/aaa/testfileoutput.txt");
			FileWriter fw = new FileWriter(textFile);
			fw.write(characters.toString());
			fw.close();
			System.out.println("character frequency printed to the file")
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*get tha data from  text file and counts frequency of all characters*/
	void getCharCount() {
		try {
			FileReader fr = new FileReader("/home/zadmin/Desktop/aaa/testfileinput.txt");
			int i;
			while ((i = fr.read()) != -1) {
				if (!Character.isWhitespace((char) i)) {
					if (characters.containsKey((char) i)) {
						characters.put((char) i, characters.get((char) i) + 1);
					} else {
						characters.put((char) i, 1);
					}
				}
			}
			writeToFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
