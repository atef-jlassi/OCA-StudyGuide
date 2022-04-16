package b.oca.chapter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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

		System.out.println("### Formatting Dtes and Times ###");
		LocalDate date4 = LocalDate.of(2022, Month.APRIL, 16);
		System.out.println(date4.getDayOfWeek());

		LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println(date3.getDayOfWeek());
		System.out.println(date3.getMonth());
		System.out.println(date3.getDayOfMonth());
		System.out.println(date3.getYear());
		System.out.println(date3.getDayOfYear());

		System.out.println("------");
		LocalTime time3 = LocalTime.of(11, 12, 34);

		LocalDateTime dateTime3 = LocalDateTime.of(date3, time3);
		System.out.println(date3.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time3.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime3.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

		System.out.println("------");
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(dateTime3));
		System.out.println(shortDateTime.format(date3));
		// System.out.println(shortDateTime.format(time3)); : time connot formatted as date
		// String format = shortDateTime.format(dateTime3);

	}

	private static void calculatePeriodTwo(LocalDate start, LocalDate end, Period period) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period);
		}

	}

	private static void calculatePeriodOne(LocalDate start, LocalDate end) { // CAN'T BE REUSED
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plusMonths(1);
		}

	}

}
