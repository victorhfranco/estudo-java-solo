package solo;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimes {
	
	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2202-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2202-07-20T01:30:26");
		Instant d06 = Instant.parse("2202-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2202-07-20T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/01/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/01/2022 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
		
		System.out.println("\nConvertendo data/hora p/texto:");
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d04 = " + d04.format(fmt3));
		System.out.println("d04 = " + fmt3.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d05 = " + d05.format(fmt3));
		System.out.println("d05 = " + d05.format(fmt4));
		System.out.println("d05 = " + d05.format(fmt6));
		
		System.out.println("d06 = " + fmt5.format(d06)); //GMT PADR�O DO COMPUTADOR UTILIZADO.
		System.out.println("d06 = " + fmt7.format(d06));
		
		System.out.println("\nConvertendo datas para local/global:");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1); //FUSO BRASIL 
		System.out.println("r2 = " + r2); //FUSO PORTUGAL
		System.out.println("r3 = " + r3); //FUSO BRASIL
		System.out.println("r4 = " + r4); //FUSO PORTUGAL
		
		System.out.println("d04 Dia = " + d04.getDayOfMonth());
		System.out.println("d04 M�s = " + d04.getMonthValue());
		System.out.println("d04 Ano = " + d04.getYear());
		
		System.out.println("d05 Hora = " + d05.getHour());
		System.out.println("d05 Minuto = " + d05.getMinute());
		System.out.println("d05 Segundo = " + d05.getSecond());
		
		System.out.println("\nCalculos com data/hora:");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("t1 Dias = " + t1.toDays());
		System.out.println("t2 Dias = " + t2.toDays());
		System.out.println("t3 Dias = " + t3.toDays());
		System.out.println("t4 Dias = " + t4.toDays());
 	}

}
