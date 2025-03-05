	package LamdaFunction;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class local_example {
	public static void main(String[] args) {
		LocalDate l1 = LocalDate.now();
		LocalDate l2 = LocalDate.of(2000, 04, 05);
		System.out.println(l1);
		
		Period p = Period.between(l2, l1);
		System.out.println(p);

		System.out.println(p.getDays());
		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		
		//Duration d1 = Duration.between(l2, l1);
		//System.out.println(d1);
		
	}

}
