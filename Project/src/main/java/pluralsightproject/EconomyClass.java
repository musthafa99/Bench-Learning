package pluralsightproject;

public class EconomyClass extends Flight {

	public EconomyClass(String id) {
		super(id);
	}

	@Override
	public boolean addPassenger(Passenger passenger) {
		return passengersList.add(passenger);
	}

	@Override
	public boolean removePassenger(Passenger passenger) {
		if (!passenger.isvip()) {
			return passengersList.remove(passenger);
		}
		return false;
	}

}
