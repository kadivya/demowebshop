package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author DIVYA GOWDA
 *
 */
public class PropertyUtility  implements IAutoConstants{
	//store constants of project-
	//we can fetch  only one value at a time
	/**
	 * This method  is developed to read the data from Property File.
	 * This method accept key of which parameter you want to fetch
	 * @param key
	 * @return value of the key
	 */
	public String getDataFromPropertyFile(String key) {
		FileInputStream  fis=null;
		
		try {
			 	fis=new FileInputStream(PROPERTY_FILE_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties property=new Properties();	
				try {
					property.load(fis);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				return property.getProperty(key);

			
		




		
	}
}
