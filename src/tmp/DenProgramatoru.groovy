Calendar cal = new GregorianCalendar(2011, 0, 1);
println cal.getTime()
cal.set(Calendar.DAY_OF_YEAR, 256);
println "\nDen programatoru je:"
println cal.getTime()
