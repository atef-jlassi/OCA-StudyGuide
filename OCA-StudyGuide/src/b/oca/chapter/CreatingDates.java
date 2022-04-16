package b.oca.chapter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class CreatingDates {

	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		LocalDate date1 = LocalDate.of(2022, Month.FEBRUARY, 20);
		System.out.println(date1);
		
		System.out.println("#### Manipulating Dates and Times ####");
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date);
		date = date.plusDays(2);
		System.out.println(date);
		date = date.plusWeeks(1);
		System.out.println(date);
		date = date.plusMonths(1);
		System.out.println(date);
		date = date.plusYears(5);
		System.out.println(date);
		
		System.out.println("######");
		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date2, time);
		System.out.println(dateTime);
		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime);
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime);
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime);
		
		System.out.println("### Working with periods ###");
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		
		calculatePeriodOne(start, end); 
		
		System.out.println("-----");
		Period period = Period.ofMonths(1); // create a period
		calculatePeriodTwo(start, end, period);
		
		System.out.println();
		
	}

	private static void calculatePeriodTwo(LocalDate start, LocalDate end, Period period) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: "+ upTo);
			upTo = upTo.plus(period);
		}
		
	}

	private static void calculatePeriodOne(LocalDate start, LocalDate end) { // CAN'T BE REUSED
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: "+ upTo);
			upTo = upTo.plusMonths(1);
		}
		
	}

}
