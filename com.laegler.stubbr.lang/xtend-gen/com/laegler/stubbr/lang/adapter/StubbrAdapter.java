package com.laegler.stubbr.lang.adapter;

import com.laegler.stubbr.lang.genmodel.Project;
import java.util.Map;

@SuppressWarnings("all")
public interface StubbrAdapter<T extends Object> {
  public abstract T parse(final String fileLocation);
  
  public abstract String generate(final Project project, final String fileLocation);
  
  public abstract String generate(final Project project, final String fileLocation, final Map<String, Object> params);
}
