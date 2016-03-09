package org.sorcerers.asm;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BytecodeVersionChecker {

	public static int checkClassVersion(String filename) throws IOException {
		DataInputStream in = new DataInputStream(new FileInputStream(filename));

		int magic = in.readInt();
		if (magic != 0xcafebabe) {
			System.out.println(filename + " is not a valid class!");
		}
		in.readUnsignedShort();
		int major = in.readUnsignedShort();
		in.close();
		return major;
	}
}
