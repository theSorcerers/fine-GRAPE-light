package org.sorcerers.runner;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.sorcerers.asm.ASMProjectClassReader;
import org.sorcerers.data.ASMAPIClass;
import org.sorcerers.util.FileExplorer;
import org.sorcerers.util.JarExtractor;

public class APIParsingRunner {
	public static void main(String args[]) {
		String APIName = "jboss-logging";
		JarExtractor.extractFilesFromJar(APIName);
		File dir = new File("./" + APIName + "-folders");
		if (dir.exists()) {
			String[] fileFolder = dir.list(DirectoryFileFilter.INSTANCE);
			for (int i = 0; i < fileFolder.length; i++) {
				String version = fileFolder[i].replace(APIName + "-", "");
				FileExplorer explorer = new FileExplorer();
				Collection<File> files = explorer.listFiles("./" + APIName + "-folders/" + APIName + "-" + version);
				ASMProjectClassReader reader = new ASMProjectClassReader();
				List<ASMAPIClass> classes = files.parallelStream().map((f) -> {
					return reader.readClass(f.getPath());
				}).collect(Collectors.toList());
				for (ASMAPIClass c : classes) {
					c.setClassName(c.getClassName().replace("/", "."));
				}
				// At this point you have the API classes.
				// These can be stored in a database or to file depending on
				// your preference.
			}
		}
	}

}