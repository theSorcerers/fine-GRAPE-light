package org.sorcerers.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class FileWriter {

	public static void writeCollection(String fileName, List<?> collection) {
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					new FileOutputStream(fileName));
			objectOutputStream.writeObject(collection);
			objectOutputStream.flush();
			objectOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
}