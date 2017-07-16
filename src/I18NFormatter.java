import static java.util.ResourceBundle.getBundle;

import java.sql.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class I18NFormatter {

	private static String LANGUAGE = getBundle("config").getString("language_code");
	private static String COUNTRY = getBundle("config").getString("country_code");
	
	private static Locale locale = new Locale(LANGUAGE, COUNTRY);
	
	public static String getTimeInstance(Date date){
		return DateFormat.getTimeInstance(DateFormat.DEFAULT, locale).format(date);
	}
	
	public static String getDateInstance(Date date){
		return DateFormat.getDateInstance(DateFormat.DEFAULT, locale).format(date);
	}
	
	public static String getCurrencyInstance(double currency){
		return NumberFormat.getCurrencyInstance(locale).format(currency);
	}
}
