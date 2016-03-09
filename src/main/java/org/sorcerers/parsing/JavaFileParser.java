package org.sorcerers.parsing;

import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.sorcerers.data.JavaMethodInvocation;

public class JavaFileParser {
	public List<JavaMethodInvocation> parseFile(String libSource, String fileName, char[] source) {
		ASTParser parser = ASTParser.newParser(AST.JLS8); 
		parser.setResolveBindings(true);
		parser.setBindingsRecovery(true);
		parser.setSource(source);
		parser.setEnvironment(new String[] {libSource}, new String[] { "." },
				new String[] { "UTF-8" }, true);
		parser.setUnitName(fileName);
		
		@SuppressWarnings("rawtypes")
		Map options = JavaCore.getOptions();
		JavaCore.setComplianceOptions(JavaCore.VERSION_1_8, options);
		parser.setCompilerOptions(options);
		CompilationUnit result = (CompilationUnit) parser.createAST(null);
		JavaASTVisitor visitor = new JavaASTVisitor();
		result.accept(visitor);
		List<JavaMethodInvocation> invocations = visitor.getMethodInvocations();
		return invocations;
	}

	

}