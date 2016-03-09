package org.sorcerers.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;

public class FileExplorer {
	public Collection<File> listFiles(String path) {
		Collection<File> collection = new ArrayList<File>();
		try {
		collection = FileUtils.listFiles(new File(path),
				new SuffixFileFilter(".class"), TrueFileFilter.INSTANCE);
		} catch(Exception e) {
			
		}
		return collection;
		
	}
	
	public Collection<File> listJavaFiles(String path) {
		Collection<File> collection = FileUtils.listFiles(new File(path),
				new SuffixFileFilter(".java"), TrueFileFilter.INSTANCE);
		return collection;
	}
	
	public Collection<File> listXMLFiles(String path) {
		Collection<File> collection = FileUtils.listFiles(new File(path),
				new SuffixFileFilter(".xml"), TrueFileFilter.INSTANCE);
		return collection;
	}
}