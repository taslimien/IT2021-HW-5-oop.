package enumhomework;

public class Year {
	
	Month month;
	
	public Year() {}
	
	public Year(Month month) {
		this.month = month;
		
	}

	public void whatIsTheWeather() {
		switch(month) {
		
		case January:
			System.out.println("January is the coldest month in New York.");
			break;
			
		case February:
			System.out.println("February sees temperatures on the rise. Pack your heavy parka and coats, scarves, and gloves.");
			break;
			
		case March:
			System.out.println("March is getting warmer and the weather changes dramatically.");
			break;
			
		case April:
			System.out.println("April heralds the onset of spring in New York.");
			break;
			
		case May:
			System.out.println("May is a delightful time to visit New York as the city is in its full spring bloom.");
			break;
			
		case June:
			System.out.println("June allows you to experience pleasant weather throughout the month before it begins warming up for the summer.");
			break;
			
		case July:
			System.out.println("July is full summer in New York, which of course means hot. In fact, this is the hottest month of the year.");
			break;
			
		case August:
			System.out.println("August is at its warmest.");
			break;
			
		case September:
			System.out.println("September is pleasant and brings a bit of autumn color.");
			break;
			
		case October:
			System.out.println("October autumn season kicks in, the days are sufficiently warm and the nights are reasonably chilly.");
			break;
			
		case November:
			System.out.println("Timing is everything. Most decorations, lights, and window displays start going up in late November.");
			break;
			
		case December:
			System.out.println("December in New York City means sumptuous Christmas trees, fabulous light displays, and fun-filled holiday markets.");
			break;
			
		default:
			System.out.println("Not a valid Month");
			break;
			
		}
	}


}
