package Model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import View.ConsoleView;

/**
 * Class: RoomLibrary_HashMap
 * 
 * @author Katrina Smith, Tobin Crone 
 * @version 1.1 
 * Course : ITEC 3860 Spring 2017
 * Written: April 4, 2017
 *
 *  This class – Establishes 30 Room objects along with their hard-coded room descriptions
 *          
 *  Purpose: – To establish the map functionality to all 30 Room Objects associate with the game. Utilizing the Model, View architecture style, we import the ConsoleView class to update the view with the Room class commands that the controller class with access. 
 **/
public class RoomLibrary_HashMap extends Room {

	private Map<String,Room> roomsAL = new HashMap<String,Room>();
	protected String rmDescript;
	ConsoleView console = new ConsoleView();


	/**
	 * Constructor Method: RoomLibray_HashMap() 
	 * Utilizes an ArrayList of Room objects to map the room identifier to the rooms complete list of attributes
	 */
	public RoomLibrary_HashMap(int rmLevel, String rmId, String rmDoor, String rmName, Monster monsterObj, Puzzle puzzleObj, Artifact artifactObj, Player playerID)
	{
		super(rmLevel, rmId, rmDoor, rmName, monsterObj, puzzleObj, artifactObj, playerID);
		/*super.getRmLevel();
		super.getRmId();
		super.getRmName();
		super.getRmDoor();*/
		this.roomsAL = roomsAL();

	}
	/**
	 * Default Constructor
	 * 
	 */
	public RoomLibrary_HashMap()
	{
		this.roomsAL = roomsAL();
	}

	/**
	 * Method: roomsAL()
	 * 
	 * Holds all the Room Objects.  Room Object has a level, room ID, list of doors, name of the room, Monster Object ID, Puzzle Object ID, and Artifact Object ID
	 * 
	 * @return an ArrayList of Room Objects
	 */
	public Map<String, Room> roomsAL() {


		//LEVEL ONE ROOMS ADD TO ARRAY --> 7 Rooms
		roomsAL.put("RM101", (new Room(1, "RM101", "DR101 and DR102", "Entrance", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("HW_L1", (new Room(1, "HW_L1", "DR101, DR102,DR103, DR104, DR105, DR106, DR107, DR108", "Hallway Level 1", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM102", (new Room(1, "RM102", "DR103", "Greeting Area", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM103", (new Room(1, "RM103", "DR104", "Living Room", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM104", (new Room(1, "RM104", "DR105", "Game Room", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM105", (new Room(1, "RM105", "DR106", "Kitchen", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM106", (new Room(1, "RM106", "DR107", "Dining Room", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM107", (new Room(1, "RM107", "DR108", "Landing", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));

		//LEVEL TWO ROOMS ADDED TO ARRAY  --> 7 Rooms
		roomsAL.put("HW_L2", (new Room(2, "HW_L2", "DR201, DR202, DR203, DR205, DR208, DR209, DR211, DR212", "Hallway Level 2", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM201", (new Room(2, "RM201", "DR 201, DR202, DR203, DR204", "Waiting Room", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM202", (new Room(2, "RM202", "DR205", "Supply Room", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM203", (new Room(2, "RM203", "DR206, DR207", "Bedroom", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM204", (new Room(2, "RM204", "DR207, DR208", "Cleaning Supply Room", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM205", (new Room(2, "RM205", "DR209, DR206", "Music Room", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM206", (new Room(2, "RM206", "DR210, DR211", "Wine Cellar", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM207", (new Room(2, "RM207", "DR204, DR212", "Library", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));

		//LEVEL THREE ROOMS ADDED TO ARRAY --> 6 Rooms
		roomsAL.put("HW_L3", (new Room(3, "HW_L3", "DR300, DR301, DR302, DR303, DR304, DR306, DR307", "Hallway Level 3", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM301", (new Room(3, "RM301", "DR300, DR301", "Colorful Room", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM302", (new Room(3, "RM302", "DR302, DR303", "Library", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM303", (new Room(3, "RM303", "DR306, DR307", "Work Room", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM304", (new Room(3, "RM304", "DR304, DR305", "TV Room", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM305", (new Room(3, "RM305", "DR315, DR316", "Red Chest Room", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));

		//LEVEL FOUR ROOMS ADDED TO ARRAY --> 8 Rooms
		roomsAL.put("HW_L4", (new Room(4, "HW_L4", "DR401, DR402, DR403, DR405, DR407, DR408, DR409", "Hallway Level 4", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM401", (new Room(4, "RM401", "DR401", "Game Room", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM402", (new Room(4, "RM402", "DR402", "Study Room", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM403", (new Room(4, "RM403", "DR403, DR404", "Dream Room", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM404", (new Room(4, "RM404", "DR405, DR406", "Garden Room", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM405", (new Room(4, "RM405", "DR406, DR407", "Theater Room", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM406", (new Room(4, "RM406", "DR408", "Dining Room", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));
		roomsAL.put("RM407", (new Room(4, "RM407", "DR409", "Dark Room", super.getMonsterObj(), super.getPuzzleObj(), super.getArtifactObj(), super.getPlayerID())));

		return roomsAL; //Returns 30 Rooms
	}

	/**
	 * Method: getRmDescript() Getter method for the rmDescript attribute
	 * @param String rmId room identification to call for a particular room description
	 * @return room description in the form of a long String
	 */
	public String getRmDescript(String rmId) {

		//rmDescript = "";
		if(rmId.equalsIgnoreCase("RM101"))
		{
			rmDescript = "The pink double doors in the middle of the south wall open to the main entry point to the mansion. "
					+ "\nThis area is a full of bright colors, giving visitors a taste of the rest of the mansion. "
					+ "\nOn west wall is a grand doorway leading to the rest of the rooms on the first level. A bright blue couch "
					+ "\nalong the north wall faces the room. The walls are painted in a rainbow pattern with the colors Red, Orange, Yellow, Green, Blue, and Purple.";
		}

		if(rmId.equalsIgnoreCase("HW_L1"))
		{
			rmDescript = "You have entered the hallway to the mansion’s lower level.  "
					+ "\nThere are several rooms in which you can freely roam on your quest.  "
					+ "\nThe hallway walls are adorned with a mosaic gold leaf design. "
					+ "\nThe doors that lead to various rooms are various shades of the rainbow.  Choose wisely!";
		}

		if(rmId.equalsIgnoreCase("RM102"))
		{
			rmDescript = "This room is full of comfy chairs and tables. The door on the north wall towards the east end of the room is solid pink. "
					+ "\nThe chairs are colored Red, Orange, and Yellow. The Tables are colored Green, Blue, and Purple.";
		}

		if(rmId.equalsIgnoreCase("RM103"))
		{
			rmDescript = "This large room is the entertainment center. "
					+ "\nThe door on the south wall of the room is bright blue and is directly in the middle of the wall. "
					+ "\nOn the east end of the room is a stage with a television screen on the wall. Cabinets cover the north side of the room."
					+ "\nIn these cabinets are chairs, tables, Dvds, video games, and other entertainment items.";
		}

		if(rmId.equalsIgnoreCase("RM104"))
		{
			rmDescript = "This rectangular room is full of all sorts of arcade games. "
					+ "\nA burnt sienna door is on the south wall towards the west end of the room. "
					+ "\nThere are always loud noises and lots of activities going on. This is where the kids hang out while the adults talk.";
		}

		if(rmId.equalsIgnoreCase("RM105"))
		{
			rmDescript = "This rectangular room is the best kitchen you’ll find in the land. A dark yellow door stands on the north wall. \nThis room contains any cooking appliance or utensil one will ever need. One can often find cooks rushing back and forth preparing food.";
		}

		if(rmId.equalsIgnoreCase("RM106"))
		{
			rmDescript = "This large L-shaped room has a large dining table in the middle. A door on the south wall is a colored Burnt Sienna. \nThis room is used for all the meals and anytime someone needs to eat. The large table can seat up to 20 and is surrounded by comfy chairs.";
		}

		if(rmId.equalsIgnoreCase("RM107"))
		{
			rmDescript = "This area is used as a staging area. A door on the north wall is light green. \nClosets in the west and south walls store food for the cooks.";
		}
		//end of Level One Room Descriptions

		if(rmId.equalsIgnoreCase("HW_L2"))
		{
			rmDescript = "You managed to reach this floor along the western side of the house, but the tiny hallway is deceiving.  \nYou actually have a plethora of decorated rooms to choose from. As you look around the corner on this level you realize this floor\n has a massive open space with two narrow hallways on both side of the space. It also seems to have been recently renovated… Something is odd about this floor. The primitive looking revolving door catches your eye because it smells like it was freshly painted, a very hot maroon color. You aren’t sure whether the lighting is coming from hidden light bulbs or from sunlight. You’re also not sure if you hear a piano being played in the distance or if your mind is playing tricks on you. The East hallway seems to be very clean and well lit, and the West hallway appears to have less light, and the further into it you look, the darker it seems. You browse around and notice both hallways have doors, and there are nine total doors in this space. One way or another, you judge that going north to the room with the revolving door is the best step to take.  The choice is yours!\n";
		}

		if(rmId.equalsIgnoreCase("RM201"))
		{
			rmDescript = "As you enter this room from the west, right away you notice that it’s simply an eye pleaser. "
					+ "It feels cozy, kind like a waiting area. There are cabinets and furniture that remind you of a coffeehouse. "
					+ "There are old magazines lying atop the few circular tables laid out throughout the room. "
					+ "There are lamps, fans, a stove; you are oddly attracted to this room. "
					+ "Something tells you you’ll be coming back to this room later on, as there are four doors.";
		}

		if(rmId.equalsIgnoreCase("RM202"))
		{
			rmDescript = "You walk in from the east side of the hallway. This is the smallest room on this level. It’s poorly lit and almost pitch black. \n Your eyes eventually adjust to the lighting and you start to notice things around you. \nThe room reminds you a large walk-in closet. It’s almost like an extension of the previous room. There are a lot of boxes and racks used for storage. It is simply a supply room filled with different kitchen-like utensils, neatly organized. You get the feeling that someone was here recently. That someone was anticipating you. There is simply an eerie feeling when you walk into this room.";
		}

		if(rmId.equalsIgnoreCase("RM203"))
		{
			rmDescript = "You walk in from the east side of the hallway into the west-facing door. A moderately sized room, this is the only bedroom on this level. \nThere is a twin sized bed, a desk, an armoire, and other furniture. The bed is neatly organized. \nYou’re not sure if someone uses it or if it hasn’t been touched in years. You notice though that there is no dust whatsoever. There is another door the west wall located at the south end of the room that leads to the cleaning supply room. Overall the room is very modest, and it seems like the person that lived here was more than likely a housemaid ";
		}

		if(rmId.equalsIgnoreCase("RM204"))
		{
			rmDescript = "You enter from the north door from the hallway or from the maid’s quarters. You notice this room is full of cleaning supplies. \nAll sorts of chemicals stored in plastic gallon containers fill up the room in to the ceiling. \nYou see a little of every cleaning agent imaginable, ranging from ammonia to all sorts of acids. One spill and you could be in big trouble.";
		}

		if(rmId.equalsIgnoreCase("RM205"))
		{
			rmDescript = "You have entered the music room from one of two ways: either the door on the north wall positioned on the eastern side of the room\n or from western side of the room that is connected to the wine cellar. This music room has fairly sized dance floor. \nThere is a lone grand piano sitting there. It looks as if it was recently played. You take some time to inspect the piano. You sit down to play it and you notice the bench is warm, as if someone was recently on it playing the piano. You exit through the eastern door.";
		}

		if(rmId.equalsIgnoreCase("RM206"))
		{
			rmDescript = "Ah, the wine cellar.  You enter from the east or south door. As you noticed, this house doesn’t appear to have a basement. \nThis possibly explains why the owner decided to have this room on the second floor be the wine cellar. \nSo many wines, so little time. Things keep getting interesting as traverse through this level.  You exit through the east door back into the hallway where the stairs are to the next level.";
		}

		if(rmId.equalsIgnoreCase("RM207"))
		{
			rmDescript = "This room is at the top of the stairs. It is located on the western side of the hallway. This room is simply huge! \nYou feel as if you just walked into a library. Thousands upon thousands of books piled up on the dozens of bookshelves \ncover all the walls all the way to the tall ceiling. As you sort through some of the books to read the title, you notice that all of the books seem to be nonfiction, scientific, or educational in some way. It seems like the owner of this house was some sort of Doctor or academic. You find a book on western civilization that grabs your interest. You sit down in one of the several recliners across the room and have a nice read. If it’s a bit crowded for your liking, you can also access the waiting room along the south wall in the middle of the room. Otherwise the southeastern door leads back to the hallway along the staircase.";
		}
		//End of Level Two Room Descriptions

		if(rmId.equalsIgnoreCase("HW_L3"))
		{
			rmDescript = "Your have reached the creative level of the mansion.  This is a four-way hallway with 5 rooms to rummage through.  \nEach with their own flare and inspirations. But wait, this is no ordinary hallway. \nThere are two rooms on the West side and 2 rooms on the East side, but the East side has a hidden gem of a room further down the hallway. The carpet is blood red, and the hallway smells of old popcorn.\n";
		}

		if(rmId.equalsIgnoreCase("RM301"))
		{
			rmDescript = "You have entered the room from either the east door or the south door. Each wall is a different color, \nand it’s very different from the room that smelled a lot like popcorn. Instead, this room smells like lavender. \nOn the west wall of the room you will see a king-sized bed with two nightstands to its left and right. The nightstands were filled with various candles and they also had drawers filled with knick-knacks. The north wall inside the room was decorated with a lot of abstract paintings, and in the middle of the wall was a big mural of the haunted mansion.  On the opposite end, to the south, is the south door that leads to a narrow hallway.";
		}

		if(rmId.equalsIgnoreCase("RM302"))
		{
			rmDescript = "The ambiance of the third level library is much more relaxing than the one on the second level. \nThere is only one wall, the north wall, of books lining the mahogany stained shelves. The books didn’t have any writing on them and all seemed blank. \nMaybe there’s a rare item in this room. On the south wall, there was another door that leads back out to the hallway. ";
		}

		if(rmId.equalsIgnoreCase("RM303"))
		{
			rmDescript = "The entryway sits on a slight angle in between two other rooms. Like the adjacent room, there isn’t much in it. \nThere’s one slanted picture on the South wall of the room and there appears to be something behind the picture. \nThe floor has carpet and it has various stains on it. It was very dirty, and looks like it hasn’t been cleaned in years. Besides the picture on the wall, there seems to be a desk with a dimly lit lamp on it facing the Corner of the North wall. On the desk, there are several crumpled papers on it.  In the southwestern wall is a second door that leads to entryway leading to the second hallway. There are also two doors leading to other rooms on the East wall of this room.";
		}

		if(rmId.equalsIgnoreCase("RM304"))
		{
			rmDescript = "In the middle of the room, there was a leather U-shaped couch facing the north wall. \nAlso on the north wall, was a TV mounted to it. This TV had heavy amounts of dust on it, and various spider webs. \nDirectly behind the U-shaped couch in the middle of the room. This room has a very luxurious rug on the floor with two shrines filled with antiques on the West wall too. There are two doors in this room. The entry door leads out the hallway while the second for is connected to the workroom.";
		}

		if(rmId.equalsIgnoreCase("RM305"))
		{
			rmDescript = "This room was very cold due to having nothing inside except for the one red chest of drawers on the west wall. \nThe walls however are plaster with old Hollywood black and white movie posters.  \nThe posters are framed in exotic African Ivory tusks. \nAs you look closer at the chest you notice it has an unlocked pad lock latched to it. Which seems pretty unusual for such an elaborately decorated room.";
		}
		//End of Level Three Room Descriptions


		if(rmId.equalsIgnoreCase("HW_L4"))
		{
			rmDescript = "The walls are higher than 7 foot, there is a big mirror on the right side of the hall and on the other side is a dark room. \nThe only light in this wide landing is coming from the window above the landing that overlooks the garden. \nIn the southeastern corner of the landing is a colorful Tiffany lamp that’s dimly lit.  As you look around the last level of the mansion there is one long hallway leading to several other rooms.  In the middle of the hall is a big round table, which is covered by a silk cover, and there is one big flowerpot full of flowers on the table. The floor is all wooden. The color of the walls is yellowish white. On the floor, there is handcrafted carpet.   So many rooms to explore.\n";
		}

		if(rmId.equalsIgnoreCase("RM401"))
		{
			rmDescript = "This room is carpet floor with no window to the outside, on the northern side of the room is a beautiful standing lamp. \nThere is a 60-inch TV next to the lamp, in front of a TV you will see a comfortable chair. There is a \nbox full of games next to the window on the floor.";
		}

		if(rmId.equalsIgnoreCase("RM402"))
		{
			rmDescript = "This room is small and unassuming. As soon as you walk to the room you will see a beautiful picture of the \nEverest mountain hanging on the south wall. A desk will be on your left-hand side. Next to the desk it will be a \nwindow with the view of the prosperous hills.";
		}

		if(rmId.equalsIgnoreCase("RM403"))
		{
			rmDescript = "The room is not that big the shape is like L, wooden floor, and the walls are painted in yellow. \nThere is a queen size bed in the right-hand side of the entrance. The French doors located on the east wall leads out to the \nGarden Room. The sunlight floods the room and you get lost in the glow.";
		}

		if(rmId.equalsIgnoreCase("RM404"))
		{
			rmDescript = "This room has a good light, shine through your face. There are pots with different plants around the room. \nThere are two large windows from the top to the bottom on the north wall. Black and white tiles cover the floor.";
		}

		if(rmId.equalsIgnoreCase("RM405"))
		{
			rmDescript = "This room includes 2 rows of black home theater recliner. The movies are played on north wall.  \nThe wall is painted with a special white projection paint to give the fill of a real theater. The floor is a light gray carpet. \n When not watching movies, the double doors on the east wall lead to the Garden room to let in some fresh air or take in the scenery. On the northwestern wall is the main entry door to the room; it leads back out to the hallway.";
		}

		if(rmId.equalsIgnoreCase("RM406"))
		{
			rmDescript = "The room has a big table with eight chairs around it. The floor is wooden and a red carpet covered the area under the table. \nOn the top of the table there are wine glasses, white china plates, and silverware for each eight seats. \nOne of the wall is just window that is covered on the side with silk caramel color curtain. Tucked away in the western corner of the room is a curio cabinet filled with rare china and oriental boxes.";
		}

		if(rmId.equalsIgnoreCase("RM407"))
		{
			rmDescript = "This room has a little small window on the northern side of the room. The glass of the window is mix of blue, green, and red. \nEverywhere in this room is full of old and unique furniture and decoration stuff.";
		}

		return rmDescript;
	}
}



