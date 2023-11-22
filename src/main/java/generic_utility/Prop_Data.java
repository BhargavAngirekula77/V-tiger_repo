package generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Prop_Data {
	
	public String getPro_Data(String arg) throws Exception {
		FileInputStream fish= new FileInputStream(IConstant_utility.prop);
		Properties prop= new Properties();
		prop.load(fish);
		String data=prop.getProperty(arg);
		return data;
	}

}
