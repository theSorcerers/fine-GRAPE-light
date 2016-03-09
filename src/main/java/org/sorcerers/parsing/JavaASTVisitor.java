package org.sorcerers.parsing;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.sorcerers.data.JavaMethodInvocation;

public class JavaASTVisitor extends ASTVisitor {
	private List<JavaMethodInvocation> methodInvocations;

	public JavaASTVisitor() {
		methodInvocations = new ArrayList<JavaMethodInvocation>();
	}

	@Override
	public boolean visit(MethodInvocation mi) {
		if (mi.getExpression() != null) {
			ITypeBinding b = mi.getExpression().resolveTypeBinding();
			if (b != null) {
				methodInvocations.add(new JavaMethodInvocation(mi.getName().toString(), b.getQualifiedName()));
			}
		}
		super.visit(mi);
		return true;
	}

	@Override
	public boolean visit(NormalAnnotation an) {
		ITypeBinding b = an.resolveTypeBinding();
		if (b != null) {
			this.methodInvocations.add(new JavaMethodInvocation(an.toString(), b.getQualifiedName()));
		}
		return true;
	}

	@Override
	public boolean visit(MarkerAnnotation an) {
		ITypeBinding b = an.resolveTypeBinding();
		if (b != null) {
			this.methodInvocations.add(new JavaMethodInvocation(an.toString(), b.getQualifiedName()));
		}
		return true;
	}

	@Override
	public boolean visit(SingleMemberAnnotation an) {
		ITypeBinding b = an.resolveTypeBinding();
		if (b != null) {
			this.methodInvocations.add(new JavaMethodInvocation(an.toString(), b.getQualifiedName()));
		}
		return true;
	}

	public List<JavaMethodInvocation> getMethodInvocations() {
		return this.methodInvocations;
	}

}