package com.sda.patterns.visitor;

public interface ComputerPart {
	
	void accept(ComputerPartVisitor computerPartVisitor);

}
