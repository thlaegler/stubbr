package com.laegler.stubbr.lang.converter

import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode
import javax.inject.Inject
import org.eclipse.xtext.conversion.impl.AbstractIDValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.util.Strings

class MyIdConverters extends AbstractDeclarativeValueConverterService {
	@Inject
	private AbstractIDValueConverter idValueConverter;

	@ValueConverter(rule="ID")
	def public IValueConverter<String> ID() {
		return idValueConverter
	}

	@Inject
	private PropertyValueConverter propertyValueConverter;

	@ValueConverter(rule="MY_ID")
	def public IValueConverter<String> PropertyValue() {
		return propertyValueConverter
	}

	public static class PropertyValueConverter extends AbstractLexerBasedConverter<String> {

		override protected String toEscapedString(String value) {
			return " = " + Strings.convertToJavaString(value, false);
		}

		override public String toValue(String string, INode node) {
			if (string == null)
				return null
			try {
				var String value = string.substring(1).trim();
				if (value.endsWith(";")) {
					value = value.substring(0, value.length() - 1);
				}
				return value;
			} catch (IllegalArgumentException e) {
				throw new ValueConverterException(e.getMessage(), node, e)
			}
		}
	}
}
