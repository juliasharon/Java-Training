import java.util.ArrayList;

public class F1 
{

		public static void main(String[] args) 
		{
			//Array consisting of all theatres
			ArrayList<String> theatre = new ArrayList<>();

			theatre.add("Theatre 1");

			theatre.add("Theatre 2");

			theatre.add("Theatre 3");

			theatre.add("Theatre 4");

			theatre.add("Theatre 5");

			theatre.add("Theatre 6");

			theatre.add("Theatre 7");

			//Array consisting of all closed  theatres
			ArrayList<String> closedTheatre = new ArrayList<>();

			closedTheatre.add("Theatre 1");

			closedTheatre.add("Theatre 6");

			closedTheatre.add("Theatre 7");

			System.out.println("Open theatres: " + theatre.removeAll(closedTheatre));

			System.out.println(theatre.toString());

		}



}