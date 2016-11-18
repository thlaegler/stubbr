package com.laegler.stubbr.lang.adapter.cucumber;

import java.util.List;

public class XtendSnippet implements Snippet {
	
	private String getArgType(Class<?> argType) {
		return argType.getSimpleName();
	}

	@Override
	public String template() {
		return "@{0}(\"{1}\")\n" + "public def void {2}({3}) throws Throwable '{'\n" + "    // {4}\n"
				+ "{5}    throw new PendingException()\n" + "'}'\n";
	}

	@Override
	public String arguments(List<Class<?>> argumentTypes) {
		StringBuilder sb = new StringBuilder();
		int n = 1;
		for (Class<?> argType : argumentTypes) {
			if (n > 1) {
				sb.append(", ");
			}
			sb.append(getArgType(argType)).append(" ").append("arg").append(n++);
		}
		return sb.toString();
	}

	@Override
	public String tableHint() {
		return "    // For automatic transformation, change DataTable to one of\n"
				+ "    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.\n"
				+ "    // E,K,V must be a scalar (String, Integer, Date, enum etc)\n";
	}

	@Override
	public String namedGroupStart() {
		return null;
	}

	@Override
	public String namedGroupEnd() {
		return null;
	}

	@Override
	public String escapePattern(String pattern) {
		return pattern.replace("\\", "\\\\").replace("\"", "\\\"");
	}

}
