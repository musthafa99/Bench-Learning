package pluralsightproject;

public class Airport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight EconomyFlight=new EconomyClass("1");
		Flight BussinessFlight=new BusinessClass("2");
		
		Passenger first=new Passenger("Shahanshah",true);
		Passenger second=new Passenger("Ryaan",false);
		
		EconomyFlight.addPassenger(second);
		BussinessFlight.addPassenger(first);
		
		System.out.println("Ecomony Class Passengers List: ");
		for(Passenger passenger:EconomyFlight.getPassengersList())
		{
			System.out.println(passenger.getName());
		}
		System.out.println("Business Class Passengers List: ");
		for(Passenger passenger:BussinessFlight.getPassengersList())
		{
			System.out.println(passenger.getName());
		}
		System.out.println("Premium Class Passengers List: ");
		for(Passenger passenger:BussinessFlight.getPassengersList())
		{
			System.out.println(passenger.getName());
		}


		
	}

}
