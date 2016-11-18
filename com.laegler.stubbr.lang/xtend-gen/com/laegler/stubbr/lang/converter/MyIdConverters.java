package com.laegler.stubbr.lang.converter;

import com.google.common.base.Objects;
import javax.inject.Inject;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.conversion.impl.AbstractIDValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class MyIdConverters extends AbstractDeclarativeValueConverterService {
  public static class PropertyValueConverter extends AbstractLexerBasedConverter<String> {
    @Override
    protected String toEscapedString(final String value) {
      String _convertToJavaString = Strings.convertToJavaString(value, false);
      return (" = " + _convertToJavaString);
    }
    
    @Override
    public String toValue(final String string, final INode node) {
      boolean _equals = Objects.equal(string, null);
      if (_equals) {
        return null;
      }
      try {
        String _substring = string.substring(1);
        String value = _substring.trim();
        boolean _endsWith = value.endsWith(";");
        if (_endsWith) {
          int _length = value.length();
          int _minus = (_length - 1);
          String _substring_1 = value.substring(0, _minus);
          value = _substring_1;
        }
        return value;
      } catch (final Throwable _t) {
        if (_t instanceof IllegalArgumentException) {
          final IllegalArgumentException e = (IllegalArgumentException)_t;
          String _message = e.getMessage();
          throw new ValueConverterException(_message, node, e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
  }
  
  @Inject
  private AbstractIDValueConverter idValueConverter;
  
  @ValueConverter(rule = "ID")
  public IValueConverter<String> ID() {
    return this.idValueConverter;
  }
  
  @Inject
  private MyIdConverters.PropertyValueConverter propertyValueConverter;
  
  @ValueConverter(rule = "MY_ID")
  public IValueConverter<String> PropertyValue() {
    return this.propertyValueConverter;
  }
}
