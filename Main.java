package assignment2;

import java.util.Arrays;
import java.util.HashMap;
import java.io.*;

class file {
	void printCharCount() {
		try {
			FileReader fr = new FileReader("/home/zadmin/Desktop/aaa/testfileinput.txt");
			HashMap<Character, Integer> characters = new HashMap<Character, Integer>();
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
			File newTextFile = new File("/home/zadmin/Desktop/aaa/testfileoutput.txt");
			FileWriter fw = new FileWriter(newTextFile);
			fw.write(characters.toString());
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Main {

	public static void main(String[] args) {
		file f = new file();
		f.printCharCount();
	}
}