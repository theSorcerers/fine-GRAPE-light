package org.sorcerers.util;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JarExtractor {
	public static void extractFilesFromJar(String apiName) {
		File folder = new File("./jar-" + apiName);
		if (folder.exists()) {
			File destFolder = new File("./" + apiName + "-folders/");
			if (!destFolder.exists()) {
				destFolder.mkdir();
			}
			File[] list = folder.listFiles();
			List<File> files = Arrays.asList(list);
			for (File f : files) {
				String version = f.getName().replace(".jar", "").replace(apiName + "-", "");
				try {
					Runtime.getRuntime().exec("unzip " + f.getAbsolutePath() + " -d ./" + apiName + "-folders/"
							+ apiName + "-" + version);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
