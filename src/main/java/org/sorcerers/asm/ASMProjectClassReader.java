package org.sorcerers.asm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Opcodes;
import org.sorcerers.data.ASMAPIClass;

public class ASMProjectClassReader {
	public ASMAPIClass readClass(String path) {
		ASMAPIClass projectClass = new ASMAPIClass(path);
		try {
			
			ClassReader reader = new ClassReader(new FileInputStream(path));
			ASMProjectClassVisitor visitor = new ASMProjectClassVisitor(
					Opcodes.ASM5);
			reader.accept(visitor, 0);
			projectClass = visitor.getProjectClass();
			int version = BytecodeVersionChecker.checkClassVersion(path);
			projectClass.setPath(path);
			projectClass.setBytecodeVersion(version);
			return projectClass;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return projectClass;
	}
}
