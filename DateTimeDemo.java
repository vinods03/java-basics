package oops;


import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateTimeDemo {

	public static void main(String[] args) {
		
		System.out.println("*******************LocalTime*********************");
		LocalTime t = LocalTime.now();
		System.out.println("The local time is: " + t);
		
		System.out.println("*******************LocalDateTime*********************");
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("The local date time is: " + dt);
				
		System.out.println("*******************LocalDateTime with formatter*********************");
		LocalDateTime dt1 = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		System.out.println("The local date time formatted is: " + df.format(dt1));
		
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("The local date time formatted is: " + df1.format(dt1));
				
		System.out.println("*******************LocalDate & Period*********************");
		LocalDate d = LocalDate.now();
		System.out.println("The local date is: " + d);
		
		Period p = Period.of(2, 2, 10);
		System.out.println("Period added: " + p.addTo(LocalDate.now()));
		
		System.out.println("*******************ZonedDateTime*********************");
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println("The zoned date time is: " + zdt);
		
		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm:ss z Z");
		System.out.println("The zoned date time formatted is: " + df2.format(zdt));
		
		System.out.println("*******************ZonedDateTimeLA*********************");
		ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("The zoned date time LA is: " + zdt1);
		
		System.out.println("*******************OffsetDateTime*********************");
		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println("The offset date time is: " + odt);
		
		System.out.println(dt.getDayOfMonth());
		System.out.println(dt.getDayOfWeek());
		System.out.println(dt.getDayOfYear());
		System.out.println(dt.getMonth());
		System.out.println(dt.getMonthValue());
		System.out.println(dt.getNano());
		System.out.println(dt.get(ChronoField.MINUTE_OF_HOUR)); // Chronofield has some useful functions which you can explore
		
		LocalTime t1 = t.minusHours(5);
		System.out.println("The current time minus 5 hours is: " + t1);
		
//	    Below is deprecated
		
		System.out.println("*******************Date*********************");
		Date d1 = new Date();
		System.out.println(d1);
		
		System.out.println("*******************DateModified*********************");
		d1.setHours(20); // Note that date object is allowed to be changed, which is actually not a good idea. hence deprecated.
		System.out.println(d1);

	}

}
