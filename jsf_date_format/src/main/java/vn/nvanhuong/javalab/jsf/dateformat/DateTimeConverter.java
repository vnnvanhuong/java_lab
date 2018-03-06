package vn.nvanhuong.javalab.jsf.dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import org.apache.commons.lang3.StringUtils;

@FacesConverter("myDateTimeConverter")
public class DateTimeConverter implements Converter {

	private static final String DD_MM_YY = "dd.MM.yy";
	private static final String DD_MM_YYYY = "dd.MM.yyyy";
	
	public Object getAsObject(FacesContext context, UIComponent component, String value) throws ConverterException {
		if (StringUtils.isEmpty(value)) {
			return null;
		}

		SimpleDateFormat formatter = new SimpleDateFormat(DD_MM_YY);
		Date parsedObject = null;
		try {
			parsedObject = formatter.parse(value);
		} catch (ParseException e) {
			throw new ConverterException(e);
		}
		return parsedObject;
	}
	
	public String getAsString(FacesContext context, UIComponent component, Object value) throws ConverterException {
		if (value == null) {
			return null;
		}

		SimpleDateFormat formatter = new SimpleDateFormat(DD_MM_YYYY);
		return formatter.format(value);
	}

}
