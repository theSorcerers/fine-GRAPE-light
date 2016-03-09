package org.sorcerers.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.sorcerers.data.JavaMethodInvocation;
import org.sorcerers.parsing.JavaFileParser;
import org.sorcerers.util.FileWriter;

public class JavaInvocationRunner {
	public static void main(String args[]) {
		File javaFileFolder = new File("./javaFiles");
		String APIname = "jboss-logging";
		//This version has to be determined from the POM of the project.
		//Here we only show a sample for one file.
		String version = "3.0.0.GA";
		File[] fileList = javaFileFolder.listFiles();
		for(int i = 0; i < fileList.length; i++) {
			File f = fileList[i];
			try {
				FileInputStream input = new FileInputStream(f);
				String file = IOUtils.toString(input);
				JavaFileParser parser = new JavaFileParser();
				List<JavaMethodInvocation> methods = parser.parseFile("jar-" + APIname + "/" + APIname + version + ".jar", f.getName(), file.toCharArray());
				//At this stage you have the method invocations and can do what you like with it.
				//In this sample we choose to write the object to an object file.
				//However, the most desirable output would be a database.
				FileWriter.writeCollection(f.getName() + "_output", methods);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
