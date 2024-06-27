package priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Vehicle {

	String vType;
	int priority;
	
	public Vehicle(String vType, int priority) {
		
		this.vType = vType;
		this.priority = priority;
		
	}
	
}

class TrafficPriorityQueue extends PriorityQueue<Vehicle>
{
	public TrafficPriorityQueue(Comparator<Vehicle>comparator) {
		super(comparator);
	}
	@Override
	public boolean offer(Vehicle vehicle)
	{
		return super.offer(vehicle);
	}
	
	@Override
	public Vehicle poll()
	{
		return super.poll();
	}
}

public class TrafficManagements {

	public static void main(String[] args) {
	
		// custom comparator for priority queue
		   Comparator<Vehicle> comparator = new Comparator<Vehicle>() {
					
			@Override
		    public int compare(Vehicle o1, Vehicle o2) {
						
			  return Integer.compare(o1.priority, o2.priority);
			}
		};
				
		TrafficPriorityQueue queue = new TrafficPriorityQueue(comparator);
		// Add vehicles to queue
		queue.offer(new Vehicle("Ambulance",1));
		queue.offer(new Vehicle("Fire truck", 2));
		queue.offer(new Vehicle("Police car", 1));
		queue.offer(new Vehicle("Car", 4));
		queue.offer(new Vehicle("Truck", 4));
				
		while(!queue.isEmpty())
			{
					Vehicle vehicle = queue.poll();
					System.out.println("Vehicle type : "+vehicle.vType+"\n priority : " +vehicle.priority);
			}

	}
	
}


