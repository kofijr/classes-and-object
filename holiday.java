public class Holiday {
	  private String name;
  	private int day;
		private String month;

	public Holiday(String NAME, int DAY, String MONTH) {
	   name = NAME;
		 day = DAY;
		 month = MONTH;
	 }
	 public boolean inSameMonth(Holiday holiday){
		  return this.month.equals(holiday.month);
	 }

	 public static double avgDate(Holiday[] holiday){
		  int sum = 0;

		 for(int i = 0; i < holiday.length; i++){
			 sum = sum + holiday[i].day;
		 }

		 return ((double) sum)/holiday.length;
	 }


	 Holiday holiday = new Holiday ("Independence Day", 4, "July");
}
