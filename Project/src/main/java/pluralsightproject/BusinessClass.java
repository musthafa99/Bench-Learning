package pluralsightproject;

public class BusinessClass extends Flight {
	public BusinessClass(String id) {
		super(id);
	}

	@Override
	public boolean addPassenger(Passenger passenger) {
		if (passenger.isvip()) {
			return passengersList.add(passenger);
		}
		return false;
	}

	@Override
	public boolean removePassenger(Passenger passenger) {
		return false;
	}
}
