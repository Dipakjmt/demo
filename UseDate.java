/*
 . Write a function that has two Date parameters as inputs, say fromdate and todate, and the function returns the first day of the fromdate's month and last day of todate's month.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UseDate {
	static SimpleDateFormat dateformat = new SimpleDateFormat("MM-DD-YYYY");
	static Date todaydate;
	static Date ReturnDate[]=new Date[2];
	static Date[] Datefunction(Date fromdate,Date todate) throws ParseException
	{
			
		if(fromdate.before(todate)||fromdate.equals(todate))
		{
			
			int fmm=fromdate.getMonth();
			int fyy=fromdate.getYear()+1901;
			int tdd=todate.getDay();
	
			int tmm=todate.getMonth();
			int tyy=todate.getYear()+1901;
			
			int td=todate.getDay();
			int tm=todate.getMonth()-2;
			int ty=todate.getMonth()+1901;
			ReturnDate[0]=dateformat.parse(fmm+"-"+fyy+"-01");
			if(tdd==td&&tmm==tm&&tyy==ty)
			ReturnDate[1]=dateformat.parse(tmm+"-"+tyy+"-"+td);
			else
			ReturnDate[1]=dateformat.parse(tmm+"-"+tyy+"-"+tdd);
			return ReturnDate;
			

		}
		return ReturnDate;
		
		
	}

	public static void main(String[] args) 
	{
		 
		 Date fromdate;
		try {
			System.out.println();
			todaydate=dateformat.parse("14-110-2016");
			
			fromdate = dateformat.parse("11-09-2016");
			Date todate = dateformat.parse("11-10-2016");
			
			//fromdate = dateformat.parse("12-11-2016");
			//Date todate = dateformat.parse("2016-10-06");
			
			//fromdate = dateformat.parse("2016-09-11");
			//Date todate = dateformat.parse("2016-10-06");
			
			
			//System.out.println(fromdate);
			ReturnDate=Datefunction(fromdate, todate);
		} catch (ParseException e) {
			
			
		}
		System.out.println("Return Data:");
		for(Date r:ReturnDate)
			System.out.println(r);
		
		

	}

}
