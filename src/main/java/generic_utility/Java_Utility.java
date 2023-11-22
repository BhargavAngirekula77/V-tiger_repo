package generic_utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import net.bytebuddy.asm.Advice.Return;

public class Java_Utility {

	public int ram() {
		Random ram= new Random();
		int num=ram.nextInt(100);
		return num;
	}
	public String getDate() {
	Calendar cal=	Calendar.getInstance();
	Date d=cal.getTime();
	SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/YYYY");
	String modDate= sdf.format(d);
	return modDate;
	}
}
