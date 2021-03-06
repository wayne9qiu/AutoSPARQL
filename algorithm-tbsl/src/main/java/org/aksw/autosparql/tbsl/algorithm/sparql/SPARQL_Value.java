package org.aksw.autosparql.tbsl.algorithm.sparql;

import java.io.Serializable;

public class SPARQL_Value implements Serializable,Cloneable{

	private static final long serialVersionUID = -3733491240975566183L;

	protected String name;
	private boolean isVariable = false;

	@Override public SPARQL_Value clone()
	{
		SPARQL_Value value = new SPARQL_Value(name);
		value.setIsVariable(isVariable());
		return value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIsVariable(boolean b) {
		isVariable = b;
	}

	public boolean isVariable(){
		return isVariable;
	}

	public SPARQL_Value(String name) {
		super();
		this.name = name;
	}

	public SPARQL_Value() {
	}

	public String toString() {
		if (isVariable) {
			return "?"+name.toLowerCase();
		} else {
			return name;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isVariable ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SPARQL_Value other = (SPARQL_Value) obj;
		if (isVariable != other.isVariable)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



}
