// import Scanner
import java.util.Scanner;

// declare class 
class PlaceScr
{
	// create gridCell object as 2D array
	private static String[][] gridCell = new String[10][10];
	
    // variables
    private static String ship_1;
    private static String ship_2;
    private static String ship_3;
    private static String ship_4;
    private static String ship_5;
    
    private static String positionAship;
    
    private static boolean aircraftCarrierPositioned = false;
    private static boolean battleshipPositioned = false;
    private static boolean destroyerPositioned = false;
    private static boolean submarinePositioned = false;
    private static boolean torpedoBoatPositioned = false;
    private static int numberOfShipsPositioned = 0;
    private static int max = 5;

    // constructor
    public PlaceScr()
    {
        this.ship_1 = "AIRCRAFT CARRIER";
        this.ship_2 = "BATTLESHIP";
        this.ship_3 = "DESTROYER";
        this.ship_4 = "SUBMARINE";
        this.ship_5 = "TORPEDO BOAT";

    }
    
    // getters
    public static String getShip1()
    {
        return ship_1;
    }

    public static String getShip2()
    {
        return ship_2;
    }

    public static String getShip3()
    {
        return ship_3;
    }

    public static String getShip4()
    {
        return ship_4;
    }

    public static String getShip5()
    {
        return ship_5;
    }

    public static void placeShips()
    {
        // create Scanner object
        Scanner keyInput = new Scanner(System.in);

        // position ships on grid until user handsoff or total of 5 ships have been placed 
        do
        {
            // prompt user for ship positioning
            System.out.println("Enter type of ship (e.g. Battleship), start coords (e.g. A7) and orienation (e.g. Right) "); 
            positionAship = keyInput.nextLine();

            // change user input to capital letters
            String chosenCoords = positionAship.toUpperCase();
            
            // System.out.println(positionAship);

            // position an Aircraft Carrier
            if ((chosenCoords.indexOf(getShip1()) != -1) && !(aircraftCarrierPositioned))
            {
                placeAircraftCarrier(chosenCoords);

                // debug statement
                System.out.println("Got inside ship1 method - " + chosenCoords); 
            }

            // position a Battleship
            else if ((chosenCoords.indexOf(getShip2()) != -1) && !(battleshipPositioned))
            {
                placeBattleship(chosenCoords);

                // debug statement
                System.out.println("Got inside ship2 method - " + chosenCoords);
            }

            // position a Destroyer
            else if ((chosenCoords.indexOf(getShip3()) != -1) && !(destroyerPositioned))
            {
                placeDestroyer(chosenCoords);

                // debug statement
                System.out.println("Got inside ship3 method - " + chosenCoords);
            }

            // position a Submarine
            else if ((chosenCoords.indexOf(getShip4()) != -1) && !(submarinePositioned))
            {
                placeSubmarine(chosenCoords);

                // debug statement
                System.out.println("Got inside ship4 method - " + chosenCoords);
            }

            // position a Torpedo Boat
            else if ((chosenCoords.indexOf(getShip5()) != -1) && !(torpedoBoatPositioned))
            {
                placeTorpedoBoat(chosenCoords);

                // debug statement
                System.out.println("Got inside ship5 method - " + chosenCoords);
            }

            // invalid entry
            else
            {
                System.out.println("Invalid entry! Try again.");
            }
            
            // debug print statements - monitor ship status and number of ships positioned
            System.out.println("\naircraft carrier positioned - " + aircraftCarrierPositioned);
            System.out.println("battleship positioned - " + battleshipPositioned);
            System.out.println("destroyer positioned - " + destroyerPositioned);
            System.out.println("submarine positioned - " + submarinePositioned);
            System.out.println("torpedo boat positioned - " + torpedoBoatPositioned);
            
            System.out.println("\ntotal no. of ships positioned - " + numberOfShipsPositioned);
            

        }while (numberOfShipsPositioned < max); 

        // check if maximum allowable ships reached and pplace ships
        if (numberOfShipsPositioned == max)
        {
        	
        	System.out.println("\n/** paint grids here showing ship positions */");
        	
        	System.out.println("\nMaximum number of ships positioned, please handoff to the next player.");
        	
        }
    }

    // method that places an Aircraft Carrier
    public static void placeAircraftCarrier(String coords)
    {
            // in cell A1 
            if (coords.indexOf("A1") != -1)
            {
            	// debug print-string tests
            	System.out.println("Got this far alright...");
            	
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][0] = "o";
                	gridCell[1][0] = "o";
                	gridCell[2][0] = "o";
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";                    
                    
                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// debug print-string tests
                    System.out.println("Got this far alright...");
                    
                    // initialize cells
                	gridCell[0][0] = "o";
                	gridCell[0][1] = "o";
                	gridCell[0][2] = "o";
                	gridCell[0][3] = "o";
                	gridCell[0][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell A2
            else if (coords.indexOf("A2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][0] = "o";
                	gridCell[2][0] = "o";
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][0] = "o";
                	gridCell[1][1] = "o";
                	gridCell[1][2] = "o";
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A3
            else if (coords.indexOf("A3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][0] = "o";
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][0] = "o";
                	gridCell[2][1] = "o";
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A4
            else if (coords.indexOf("A4") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";
                	gridCell[7][0] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][0] = "o";
                	gridCell[3][1] = "o";
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell A5
            else if (coords.indexOf("A5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][0] = "o";
                	gridCell[1][0] = "o";
                	gridCell[2][0] = "o";
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";
                	gridCell[7][0] = "o";
                	gridCell[8][0] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][0] = "o";
                	gridCell[4][1] = "o";
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A6
            else if (coords.indexOf("A6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][0] = "o";
                	gridCell[2][0] = "o";
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";
                	gridCell[7][0] = "o";
                	gridCell[8][0] = "o";
                	gridCell[9][0] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][0] = "o";
                	gridCell[5][1] = "o";
                	gridCell[5][2] = "o";
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A7
            else if (coords.indexOf("A7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][0] = "o";
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][0] = "o";
                	gridCell[6][1] = "o";
                	gridCell[6][2] = "o";
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A8
            else if (coords.indexOf("A8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";
                	gridCell[7][0] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][0] = "o";
                	gridCell[7][1] = "o";
                	gridCell[7][2] = "o";
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A9
            else if (coords.indexOf("A9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";
                	gridCell[7][0] = "o";
                	gridCell[8][0] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][0] = "o";
                	gridCell[8][1] = "o";
                	gridCell[8][2] = "o";
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A10
            else if (coords.indexOf("A10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";
                	gridCell[7][0] = "o";
                	gridCell[8][0] = "o";
                	gridCell[9][0] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][0] = "o";
                	gridCell[9][1] = "o";
                	gridCell[9][2] = "o";
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B1
            else if (coords.indexOf("B1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][1] = "o";
                	gridCell[1][1] = "o";
                	gridCell[2][1] = "o";
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][1] = "o";
                	gridCell[0][2] = "o";
                	gridCell[0][3] = "o";
                	gridCell[0][4] = "o";
                	gridCell[0][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell B2
            else if (coords.indexOf("B2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][1] = "o";
                	gridCell[2][1] = "o";
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][1] = "o";
                	gridCell[1][2] = "o";
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B3
            else if (coords.indexOf("B3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][1] = "o";
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][1] = "o";
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B4
            else if (coords.indexOf("B4") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";
                	gridCell[7][1] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][1] = "o";
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell B5
            else if (coords.indexOf("B5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][1] = "o";
                	gridCell[1][1] = "o";
                	gridCell[2][1] = "o";
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";
                	gridCell[7][1] = "o";
                	gridCell[8][1] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][1] = "o";
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B6
            else if (coords.indexOf("B6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][1] = "o";
                	gridCell[2][1] = "o";
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";
                	gridCell[7][1] = "o";
                	gridCell[8][1] = "o";
                	gridCell[9][1] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][1] = "o";
                	gridCell[5][2] = "o";
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B7
            else if (coords.indexOf("B7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][1] = "o";
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][1] = "o";
                	gridCell[6][2] = "o";
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";
                	gridCell[6][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B8
            else if (coords.indexOf("B8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";
                	gridCell[7][1] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][1] = "o";
                	gridCell[7][2] = "o";
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B9
            else if (coords.indexOf("B9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";
                	gridCell[7][1] = "o";
                	gridCell[8][1] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][1] = "o";
                	gridCell[8][2] = "o";
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B10
            else if (coords.indexOf("B10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";
                	gridCell[7][1] = "o";
                	gridCell[8][1] = "o";
                	gridCell[9][1] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][1] = "o";
                	gridCell[9][2] = "o";
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
            
            // in cell C1 
            else if (coords.indexOf("C1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][2] = "o";
                	gridCell[1][2] = "o";
                	gridCell[2][2] = "o";
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][2] = "o";
                	gridCell[0][3] = "o";
                	gridCell[0][4] = "o";
                	gridCell[0][5] = "o";
                	gridCell[0][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell C2
            else if (coords.indexOf("C2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][2] = "o";
                	gridCell[2][2] = "o";
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][2] = "o";
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C3
            else if (coords.indexOf("C3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][2] = "o";
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C4
            else if (coords.indexOf("C4") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";
                	gridCell[7][2] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell C5
            else if (coords.indexOf("C5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][2] = "o";
                	gridCell[1][2] = "o";
                	gridCell[2][2] = "o";
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";
                	gridCell[7][2] = "o";
                	gridCell[8][2] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C6
            else if (coords.indexOf("C6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][2] = "o";
                	gridCell[2][2] = "o";
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";
                	gridCell[7][2] = "o";
                	gridCell[8][2] = "o";
                	gridCell[9][2] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][2] = "o";
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C7
            else if (coords.indexOf("C7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][2] = "o";
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C8
            else if (coords.indexOf("C8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";
                	gridCell[7][2] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][2] = "o";
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C9
            else if (coords.indexOf("C9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][2] = "o";
                	gridCell[4][2] = "o";
                	gridCell[4][2] = "o";
                	gridCell[4][2] = "o";
                	gridCell[4][2] = "o"; 

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C10
            else if (coords.indexOf("C10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";
                	gridCell[7][2] = "o";
                	gridCell[8][2] = "o";
                	gridCell[9][2] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][2] = "o";
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D1
            else if (coords.indexOf("D1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][3] = "o";
                	gridCell[1][3] = "o";
                	gridCell[2][3] = "o";
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][3] = "o";
                	gridCell[0][4] = "o";
                	gridCell[0][5] = "o";
                	gridCell[0][6] = "o";
                	gridCell[0][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell D2
            else if (coords.indexOf("D2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][3] = "o";
                	gridCell[2][3] = "o";
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D3
            else if (coords.indexOf("D3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][3] = "o";
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";
                	gridCell[2][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D4
            else if (coords.indexOf("D4") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";
                	gridCell[7][3] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";
                	gridCell[3][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell D5
            else if (coords.indexOf("D5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][3] = "o";
                	gridCell[1][3] = "o";
                	gridCell[2][3] = "o";
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";
                	gridCell[7][3] = "o";
                	gridCell[8][3] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";
                	gridCell[4][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D6
            else if (coords.indexOf("D6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][3] = "o";
                	gridCell[2][3] = "o";
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";
                	gridCell[7][3] = "o";
                	gridCell[8][3] = "o";
                	gridCell[9][3] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";
                	gridCell[5][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D7
            else if (coords.indexOf("D7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][3] = "o";
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";
                	gridCell[6][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D8
            else if (coords.indexOf("D8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";
                	gridCell[7][3] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";
                	gridCell[7][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D9
            else if (coords.indexOf("D9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";
                	gridCell[7][3] = "o";
                	gridCell[8][3] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";
                	gridCell[8][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D10
            else if (coords.indexOf("D10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";
                	gridCell[7][3] = "o";
                	gridCell[8][3] = "o";
                	gridCell[9][3] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";
                	gridCell[9][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E1
            else if (coords.indexOf("E1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][4] = "o";
                	gridCell[1][4] = "o";
                	gridCell[2][4] = "o";
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][0] = "o";
                	gridCell[0][1] = "o";
                	gridCell[0][2] = "o";
                	gridCell[0][3] = "o";
                	gridCell[0][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][4] = "o";
                	gridCell[0][5] = "o";
                	gridCell[0][6] = "o";
                	gridCell[0][7] = "o";
                	gridCell[0][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell E2
            else if (coords.indexOf("E2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][4] = "o";
                	gridCell[2][4] = "o";
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][0] = "o";
                	gridCell[1][1] = "o";
                	gridCell[1][2] = "o";
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";
                	gridCell[1][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E3
            else if (coords.indexOf("E3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][4] = "o";
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][0] = "o";
                	gridCell[2][4] = "o";
                	gridCell[2][4] = "o";
                	gridCell[2][4] = "o";
                	gridCell[2][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";
                	gridCell[2][7] = "o";
                	gridCell[2][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E4
            else if (coords.indexOf("E4") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";
                	gridCell[7][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][0] = "o";
                	gridCell[3][1] = "o";
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";
                	gridCell[3][7] = "o";
                	gridCell[3][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell E5
            else if (coords.indexOf("E5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][4] = "o";
                	gridCell[1][4] = "o";
                	gridCell[2][4] = "o";
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";
                	gridCell[7][4] = "o";
                	gridCell[8][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][0] = "o";
                	gridCell[4][1] = "o";
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";
                	gridCell[4][7] = "o";
                	gridCell[4][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E6
            else if (coords.indexOf("E6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][4] = "o";
                	gridCell[2][4] = "o";
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";
                	gridCell[7][4] = "o";
                	gridCell[8][4] = "o";
                	gridCell[9][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][0] = "o";
                	gridCell[5][1] = "o";
                	gridCell[5][2] = "o";
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";
                	gridCell[5][7] = "o";
                	gridCell[5][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E7
            else if (coords.indexOf("E7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][4] = "o";
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][0] = "o";
                	gridCell[6][1] = "o";
                	gridCell[6][2] = "o";
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][4] = "o";
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";
                	gridCell[6][7] = "o";
                	gridCell[6][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E8
            else if (coords.indexOf("E8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";
                	gridCell[7][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][0] = "o";
                	gridCell[7][1] = "o";
                	gridCell[7][2] = "o";
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";
                	gridCell[7][7] = "o";
                	gridCell[7][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E9
            else if (coords.indexOf("E9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";
                	gridCell[7][4] = "o";
                	gridCell[8][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][0] = "o";
                	gridCell[8][1] = "o";
                	gridCell[8][2] = "o";
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";
                	gridCell[8][7] = "o";
                	gridCell[8][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E10
            else if (coords.indexOf("E10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";
                	gridCell[7][4] = "o";
                	gridCell[8][4] = "o";
                	gridCell[9][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][0] = "o";
                	gridCell[9][1] = "o";
                	gridCell[9][2] = "o";
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";
                	gridCell[9][7] = "o";
                	gridCell[9][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell F1 
            else if (coords.indexOf("F1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][5] = "o";
                	gridCell[1][5] = "o";
                	gridCell[2][5] = "o";
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][1] = "o";
                	gridCell[0][2] = "o";
                	gridCell[0][3] = "o";
                	gridCell[0][4] = "o";
                	gridCell[0][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][5] = "o";
                	gridCell[0][6] = "o";
                	gridCell[0][7] = "o";
                	gridCell[0][8] = "o";
                	gridCell[0][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell F2
            else if (coords.indexOf("F2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][5] = "o";
                	gridCell[2][5] = "o";
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][1] = "o";
                	gridCell[1][2] = "o";
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";
                	gridCell[1][8] = "o";
                	gridCell[1][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F3
            else if (coords.indexOf("F3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][5] = "o";
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][1] = "o";
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";
                	gridCell[2][7] = "o";
                	gridCell[2][8] = "o";
                	gridCell[2][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F4
            else if (coords.indexOf("F4") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";
                	gridCell[7][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][1] = "o";
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";
                	gridCell[3][7] = "o";
                	gridCell[3][8] = "o";
                	gridCell[3][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell F5
            else if (coords.indexOf("F5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][5] = "o";
                	gridCell[1][5] = "o";
                	gridCell[2][5] = "o";
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";
                	gridCell[7][5] = "o";
                	gridCell[8][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][1] = "o";
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";
                	gridCell[4][7] = "o";
                	gridCell[4][8] = "o";
                	gridCell[4][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F6
            else if (coords.indexOf("F6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][5] = "o";
                	gridCell[2][5] = "o";
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o"; 

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";
                	gridCell[7][5] = "o";
                	gridCell[8][5] = "o";
                	gridCell[9][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][1] = "o";
                	gridCell[5][2] = "o";
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";
                	gridCell[5][7] = "o";
                	gridCell[5][8] = "o";
                	gridCell[5][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F7
            else if (coords.indexOf("F7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][5] = "o";
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][1] = "o";
                	gridCell[6][2] = "o";
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";
                	gridCell[6][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";
                	gridCell[6][7] = "o";
                	gridCell[6][8] = "o";
                	gridCell[6][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F8
            else if (coords.indexOf("F8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";
                	gridCell[7][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][1] = "o";
                	gridCell[7][2] = "o";
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";
                	gridCell[7][7] = "o";
                	gridCell[7][8] = "o";
                	gridCell[7][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F9
            else if (coords.indexOf("F9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";
                	gridCell[7][5] = "o";
                	gridCell[8][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][1] = "o";
                	gridCell[8][2] = "o";
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";
                	gridCell[8][7] = "o";
                	gridCell[8][8] = "o";
                	gridCell[8][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F10
            else if (coords.indexOf("F10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";
                	gridCell[7][5] = "o";
                	gridCell[8][5] = "o";
                	gridCell[9][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][1] = "o";
                	gridCell[9][2] = "o";
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";
                	gridCell[9][7] = "o";
                	gridCell[8][8] = "o";
                	gridCell[9][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G1
            else if (coords.indexOf("G1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][6] = "o";
                	gridCell[0][6] = "o";
                	gridCell[0][6] = "o";
                	gridCell[0][6] = "o";
                	gridCell[0][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][2] = "o";
                	gridCell[0][6] = "o";
                	gridCell[0][6] = "o";
                	gridCell[0][6] = "o";
                	gridCell[0][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell G2
            else if (coords.indexOf("G2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][6] = "o";
                	gridCell[2][6] = "o";
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][2] = "o";
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G3
            else if (coords.indexOf("G3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][6] = "o";
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G4
            else if (coords.indexOf("G4") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";
                	gridCell[7][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell G5
            else if (coords.indexOf("G5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][6] = "o";
                	gridCell[1][6] = "o";
                	gridCell[2][6] = "o";
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";
                	gridCell[7][6] = "o";
                	gridCell[8][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G6
            else if (coords.indexOf("G6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][6] = "o";
                	gridCell[2][6] = "o";
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";
                	gridCell[7][6] = "o";
                	gridCell[8][6] = "o";
                	gridCell[9][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][2] = "o";
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";
                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G7
            else if (coords.indexOf("G7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][6] = "o";
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][2] = "o";
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G8
            else if (coords.indexOf("G8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";
                	gridCell[7][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][2] = "o";
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G9
            else if (coords.indexOf("G9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";
                	gridCell[7][6] = "o";
                	gridCell[8][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][2] = "o";
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G10
            else if (coords.indexOf("G10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";
                	gridCell[7][6] = "o";
                	gridCell[8][6] = "o";
                	gridCell[9][6] = "o"; 

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][2] = "o";
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H1
            else if (coords.indexOf("H1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][7] = "o";
                	gridCell[1][7] = "o";
                	gridCell[2][7] = "o";
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][3] = "o";
                	gridCell[0][4] = "o";
                	gridCell[0][5] = "o";
                	gridCell[0][6] = "o";
                	gridCell[0][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell H2
            else if (coords.indexOf("H2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][7] = "o";
                	gridCell[2][7] = "o";
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H3
            else if (coords.indexOf("H3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][7] = "o";
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";
                	gridCell[2][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H4
            else if (coords.indexOf("H4") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";
                	gridCell[7][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";
                	gridCell[3][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell H5
            else if (coords.indexOf("H5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][7] = "o";
                	gridCell[1][7] = "o";
                	gridCell[2][7] = "o";
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";
                	gridCell[7][7] = "o";
                	gridCell[8][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";
                	gridCell[4][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H6
            else if (coords.indexOf("H6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][7] = "o";
                	gridCell[2][7] = "o";
                	gridCell[3][7] = "o";
                	gridCell[48][7] = "o";
                	gridCell[5][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";
                	gridCell[7][7] = "o";
                	gridCell[8][7] = "o";
                	gridCell[9][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";
                	gridCell[5][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H7
            else if (coords.indexOf("H7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][7] = "o";
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";
                	gridCell[6][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H8
            else if (coords.indexOf("H8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";
                	gridCell[7][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";
                	gridCell[7][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H9
            else if (coords.indexOf("H9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";
                	gridCell[7][7] = "o";
                	gridCell[8][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";
                	gridCell[8][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H10
            else if (coords.indexOf("H10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";
                	gridCell[7][7] = "o";
                	gridCell[8][7] = "o";
                	gridCell[9][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";
                	gridCell[9][7] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I1
            else if (coords.indexOf("I1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][8] = "o";
                	gridCell[1][8] = "o";
                	gridCell[2][8] = "o";
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][4] = "o";
                	gridCell[0][5] = "o";
                	gridCell[0][6] = "o";
                	gridCell[0][7] = "o";
                	gridCell[0][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell I2
            else if (coords.indexOf("I2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][8] = "o";
                	gridCell[2][8] = "o";
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";
                	gridCell[1][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I3
            else if (coords.indexOf("I3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][8] = "o";
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";
                	gridCell[2][7] = "o";
                	gridCell[2][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I4
            else if (coords.indexOf("I4") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";
                	gridCell[7][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";
                	gridCell[3][7] = "o";
                	gridCell[3][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell I5
            else if (coords.indexOf("I5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][8] = "o";
                	gridCell[1][8] = "o";
                	gridCell[2][8] = "o";
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";
                	gridCell[7][8] = "o";
                	gridCell[8][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";
                	gridCell[4][7] = "o";
                	gridCell[4][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I6
            else if (coords.indexOf("I6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][8] = "o";
                	gridCell[2][8] = "o";
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";
                	gridCell[7][8] = "o";
                	gridCell[8][8] = "o";
                	gridCell[9][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";
                	gridCell[5][7] = "o";
                	gridCell[5][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I7
            else if (coords.indexOf("I7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][8] = "o";
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][4] = "o";
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";
                	gridCell[6][7] = "o";
                	gridCell[6][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I8
            else if (coords.indexOf("I8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";
                	gridCell[7][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";
                	gridCell[7][7] = "o";
                	gridCell[7][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I9
            else if (coords.indexOf("I9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";
                	gridCell[7][8] = "o";
                	gridCell[8][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";
                	gridCell[8][7] = "o";
                	gridCell[8][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I10
            else if (coords.indexOf("I10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";
                	gridCell[7][8] = "o";
                	gridCell[8][8] = "o";
                	gridCell[9][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";
                	gridCell[9][7] = "o";
                	gridCell[9][8] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J1
            else if (coords.indexOf("J1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][9] = "o";
                	gridCell[1][9] = "o";
                	gridCell[2][9] = "o";
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][5] = "o";
                	gridCell[0][6] = "o";
                	gridCell[0][7] = "o";
                	gridCell[0][8] = "o";
                	gridCell[0][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell J2
            else if (coords.indexOf("J2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][9] = "o";
                	gridCell[2][9] = "o";
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";
                	gridCell[1][8] = "o";
                	gridCell[1][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J3
            else if (coords.indexOf("J3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][9] = "o";
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";
                	gridCell[2][7] = "o";
                	gridCell[2][8] = "o";
                	gridCell[2][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J4
            else if (coords.indexOf("J4") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";
                	gridCell[3][7] = "o";
                	gridCell[3][8] = "o";
                	gridCell[3][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell J5
            else if (coords.indexOf("J5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][9] = "o";
                	gridCell[1][9] = "o";
                	gridCell[2][9] = "o";
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";
                	gridCell[8][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";
                	gridCell[4][7] = "o";
                	gridCell[4][8] = "o";
                	gridCell[9][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J6
            else if (coords.indexOf("J6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][9] = "o";
                	gridCell[2][9] = "o";
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";
                	gridCell[8][9] = "o";
                	gridCell[9][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";
                	gridCell[5][7] = "o";
                	gridCell[5][8] = "o";
                	gridCell[5][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J7
            else if (coords.indexOf("J7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][9] = "o";
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";
                	gridCell[6][7] = "o";
                	gridCell[6][8] = "o";
                	gridCell[6][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J8
            else if (coords.indexOf("J8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";
                	gridCell[7][7] = "o";
                	gridCell[7][8] = "o";
                	gridCell[7][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J9
            else if (coords.indexOf("J9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";
                	gridCell[8][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";
                	gridCell[8][7] = "o";
                	gridCell[8][8] = "o";
                	gridCell[8][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J10
            else if (coords.indexOf("J10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";
                	gridCell[8][9] = "o";
                	gridCell[9][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";
                	gridCell[9][7] = "o";
                	gridCell[9][8] = "o";
                	gridCell[9][9] = "o";

                    // set aircraftCarrierPositioned flag to true
                    aircraftCarrierPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
        }




        // method that places a Battleship
        public static void placeBattleship(String coords)
        {
            // in cell A1 
            if (coords.indexOf("A1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][0] = "o";
                	gridCell[1][0] = "o";
                	gridCell[2][0] = "o";
                	gridCell[3][0] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][0] = "o";
                	gridCell[0][1] = "o";
                	gridCell[0][2] = "o";
                	gridCell[0][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell A2
            else if (coords.indexOf("A2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][0] = "o";
                	gridCell[2][0] = "o";
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][0] = "o";
                	gridCell[1][1] = "o";
                	gridCell[1][2] = "o";
                	gridCell[1][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A3
            else if (coords.indexOf("A3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][0] = "o";
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][0] = "o";
                	gridCell[2][1] = "o";
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A4
            else if (coords.indexOf("A4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][0] = "o";
                	gridCell[1][0] = "o";
                	gridCell[2][0] = "o";
                	gridCell[3][0] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][0] = "o";
                	gridCell[3][1] = "o";
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell A5
            else if (coords.indexOf("A5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][0] = "o";
                	gridCell[2][0] = "o";
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";
                	gridCell[7][0] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][0] = "o";
                	gridCell[4][1] = "o";
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A6
            else if (coords.indexOf("A6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][0] = "o";
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";
                	gridCell[7][0] = "o";
                	gridCell[8][0] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][0] = "o";
                	gridCell[5][1] = "o";
                	gridCell[5][2] = "o";
                	gridCell[5][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A7
            else if (coords.indexOf("A7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][0] = "o";
                	gridCell[7][0] = "o";
                	gridCell[8][0] = "o";
                	gridCell[9][0] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][0] = "o";
                	gridCell[6][1] = "o";
                	gridCell[6][2] = "o";
                	gridCell[6][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A8
            else if (coords.indexOf("A8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";
                	gridCell[7][0] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][0] = "o";
                	gridCell[7][1] = "o";
                	gridCell[7][2] = "o";
                	gridCell[7][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A9
            else if (coords.indexOf("A9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";
                	gridCell[7][0] = "o";
                	gridCell[8][0] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][0] = "o";
                	gridCell[8][1] = "o";
                	gridCell[8][2] = "o";
                	gridCell[8][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A10
            else if (coords.indexOf("A10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][0] = "o";
                	gridCell[7][0] = "o";
                	gridCell[8][0] = "o";
                	gridCell[9][0] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][0] = "o";
                	gridCell[9][1] = "o";
                	gridCell[9][2] = "o";
                	gridCell[9][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B1
            else if (coords.indexOf("B1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][1] = "o";
                	gridCell[0][1] = "o";
                	gridCell[0][1] = "o";
                	gridCell[0][1] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][1] = "o";
                	gridCell[0][2] = "o";
                	gridCell[0][3] = "o";
                	gridCell[0][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell B2
            else if (coords.indexOf("B2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][1] = "o";
                	gridCell[2][1] = "o";
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][1] = "o";
                	gridCell[1][2] = "o";
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B3
            else if (coords.indexOf("B3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][1] = "o";
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][1] = "o";
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B4
            else if (coords.indexOf("B4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][1] = "o";
                	gridCell[1][1] = "o";
                	gridCell[2][1] = "o";
                	gridCell[3][1] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][1] = "o";
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell B5
            else if (coords.indexOf("B5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][1] = "o";
                	gridCell[2][1] = "o";
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";
                	gridCell[7][1] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][1] = "o";
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B6
            else if (coords.indexOf("B6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][1] = "o";
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";
                	gridCell[7][1] = "o";
                	gridCell[8][1] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][1] = "o";
                	gridCell[5][2] = "o";
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B7
            else if (coords.indexOf("B7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][1] = "o";
                	gridCell[7][1] = "o";
                	gridCell[8][1] = "o";
                	gridCell[9][1] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][1] = "o";
                	gridCell[6][2] = "o";
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B8
            else if (coords.indexOf("B8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";
                	gridCell[7][1] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][1] = "o";
                	gridCell[7][2] = "o";
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B9
            else if (coords.indexOf("B9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";
                	gridCell[7][1] = "o";
                	gridCell[8][1] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][1] = "o";
                	gridCell[8][2] = "o";
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B10
            else if (coords.indexOf("B10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][1] = "o";
                	gridCell[7][1] = "o";
                	gridCell[8][1] = "o";
                	gridCell[9][1] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][1] = "o";
                	gridCell[9][2] = "o";
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
            
            // in cell C1 
            else if (coords.indexOf("C1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][2] = "o";
                	gridCell[1][2] = "o";
                	gridCell[2][2] = "o";
                	gridCell[3][2] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][2] = "o";
                	gridCell[0][3] = "o";
                	gridCell[0][4] = "o";
                	gridCell[0][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell C2
            else if (coords.indexOf("C2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][2] = "o";
                	gridCell[2][2] = "o";
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][2] = "o";
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C3
            else if (coords.indexOf("C3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][2] = "o";
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C4
            else if (coords.indexOf("C4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][2] = "o";
                	gridCell[1][2] = "o";
                	gridCell[2][2] = "o";
                	gridCell[3][2] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell C5
            else if (coords.indexOf("C5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][2] = "o";
                	gridCell[2][2] = "o";
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";
                	gridCell[7][2] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C6
            else if (coords.indexOf("C6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][2] = "o";
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";
                	gridCell[7][2] = "o";
                	gridCell[8][2] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][2] = "o";
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C7
            else if (coords.indexOf("C7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][2] = "o";
                	gridCell[7][2] = "o";
                	gridCell[8][2] = "o";
                	gridCell[9][2] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][2] = "o";
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";
            	gridCell[6][5 ] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C8
            else if (coords.indexOf("C8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";
                	gridCell[7][2] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][2] = "o";
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C9
            else if (coords.indexOf("C9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";
                	gridCell[7][2] = "o";
                	gridCell[8][2] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][2] = "o";
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C10
            else if (coords.indexOf("C10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][2] = "o";
                	gridCell[7][2] = "o";
                	gridCell[8][2] = "o";
                	gridCell[9][2] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][2] = "o";
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D1
            else if (coords.indexOf("D1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][3] = "o";
                	gridCell[1][3] = "o";
                	gridCell[2][3] = "o";
                	gridCell[3][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][0] = "o";
                	gridCell[0][1] = "o";
                	gridCell[0][2] = "o";
                	gridCell[0][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][3] = "o";
                	gridCell[0][4] = "o";
                	gridCell[0][5] = "o";
                	gridCell[0][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell D2
            else if (coords.indexOf("D2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][3] = "o";
                	gridCell[2][3] = "o";
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][0] = "o";
                	gridCell[1][1] = "o";
                	gridCell[1][2] = "o";
                	gridCell[1][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D3
            else if (coords.indexOf("D3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][3] = "o";
                	gridCell[3][3] = "o";
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][0] = "o";
                	gridCell[2][1] = "o";
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D4
            else if (coords.indexOf("D4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][3] = "o";
                	gridCell[1][3] = "o";
                	gridCell[2][3] = "o";
                	gridCell[3][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][0] = "o";
                	gridCell[3][1] = "o";
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][0] = "o";
                	gridCell[3][1] = "o";
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell D5
            else if (coords.indexOf("D5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][3] = "o";
                	gridCell[2][3] = "o";
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";
                	gridCell[7][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][0] = "o";
                	gridCell[4][1] = "o";
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D6
            else if (coords.indexOf("D6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][3] = "o";
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";
                	gridCell[7][3] = "o";
                	gridCell[8][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][0] = "o";
                	gridCell[5][1] = "o";
                	gridCell[5][2] = "o";
                	gridCell[5][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D7
            else if (coords.indexOf("D7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][3] = "o";
                	gridCell[7][3] = "o";
                	gridCell[8][3] = "o";
                	gridCell[9][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][0] = "o";
                	gridCell[6][1] = "o";
                	gridCell[6][2] = "o";
                	gridCell[6][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D8
            else if (coords.indexOf("D8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";
                	gridCell[7][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][0] = "o";
                	gridCell[7][1] = "o";
                	gridCell[7][2] = "o";
                	gridCell[7][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D9
            else if (coords.indexOf("D9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";
                	gridCell[7][3] = "o";
                	gridCell[8][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][0] = "o";
                	gridCell[8][1] = "o";
                	gridCell[8][2] = "o";
                	gridCell[8][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D10
            else if (coords.indexOf("D10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][3] = "o";
                	gridCell[7][3] = "o";
                	gridCell[8][3] = "o";
                	gridCell[9][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][0] = "o";
                	gridCell[9][1] = "o";
                	gridCell[9][2] = "o";
                	gridCell[9][3] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E1
            else if (coords.indexOf("E1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][4] = "o";
                	gridCell[1][4] = "o";
                	gridCell[2][4] = "o";
                	gridCell[3][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][1] = "o";
                	gridCell[0][2] = "o";
                	gridCell[0][3] = "o";
                	gridCell[0][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][4] = "o";
                	gridCell[0][5] = "o";
                	gridCell[0][6] = "o";
                	gridCell[0][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell E2
            else if (coords.indexOf("E2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][4] = "o";
                	gridCell[2][4] = "o";
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][1] = "o";
                	gridCell[1][2] = "o";
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E3
            else if (coords.indexOf("E3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][4] = "o";
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][1] = "o";
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";
                	gridCell[2][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E4
            else if (coords.indexOf("E4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][4] = "o";
                	gridCell[1][4] = "o";
                	gridCell[2][4] = "o";
                	gridCell[3][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][1] = "o";
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";
                	gridCell[3][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell E5
            else if (coords.indexOf("E5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][4] = "o";
                	gridCell[2][4] = "o";
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";
                	gridCell[7][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][1] = "o";
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";
                	gridCell[4][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E6
            else if (coords.indexOf("E6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][4] = "o";
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";
                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";
                	gridCell[7][4] = "o";
                	gridCell[8][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][1] = "o";
                	gridCell[5][2] = "o";
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";
                	gridCell[5][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E7
            else if (coords.indexOf("E7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][4] = "o";
                	gridCell[7][4] = "o";
                	gridCell[8][4] = "o";
                	gridCell[9][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][1] = "o";
                	gridCell[6][2] = "o";
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][4] = "o";
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";
                	gridCell[6][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E8
            else if (coords.indexOf("E8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";
                	gridCell[7][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][1] = "o";
                	gridCell[7][2] = "o";
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";
                	gridCell[7][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E9
            else if (coords.indexOf("E9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";
                	gridCell[7][4] = "o";
                	gridCell[8][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][1] = "o";
                	gridCell[8][2] = "o";
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";
                	gridCell[8][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E10
            else if (coords.indexOf("E10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][4] = "o";
                	gridCell[7][4] = "o";
                	gridCell[8][4] = "o";
                	gridCell[9][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][1] = "o";
                	gridCell[9][2] = "o";
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";
                	gridCell[9][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell F1 
            else if (coords.indexOf("F1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][5] = "o";
                	gridCell[1][5] = "o";
                	gridCell[2][5] = "o";
                	gridCell[3][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][2] = "o";
                	gridCell[0][3] = "o";
                	gridCell[0][4] = "o";
                	gridCell[0][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][5] = "o";
                	gridCell[0][6] = "o";
                	gridCell[0][7] = "o";
                	gridCell[0][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell F2
            else if (coords.indexOf("F2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][5] = "o";
                	gridCell[2][5] = "o";
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][2] = "o";
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";
                	gridCell[1][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F3
            else if (coords.indexOf("F3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][5] = "o";
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";
                	gridCell[2][7] = "o";
                	gridCell[2][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F4
            else if (coords.indexOf("F4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][5] = "o";
                	gridCell[1][5] = "o";
                	gridCell[2][5] = "o";
                	gridCell[3][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";
                	gridCell[3][7] = "o";
                	gridCell[3][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell F5
            else if (coords.indexOf("F5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][5] = "o";
                	gridCell[2][5] = "o";
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";
                	gridCell[7][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";
                	gridCell[4][7] = "o";
                	gridCell[4][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F6
            else if (coords.indexOf("F6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][5] = "o";
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";
                	gridCell[7][5] = "o";
                	gridCell[8][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][2] = "o";
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";
                	gridCell[5][7] = "o";
                	gridCell[5][85] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F7
            else if (coords.indexOf("F7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][5] = "o";
                	gridCell[7][5] = "o";
                	gridCell[8][5] = "o";
                	gridCell[9][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][2] = "o";
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";
                	gridCell[6][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {        	
                	// debug print-string tests
                    System.out.println("Yes, got here too...");
                    
                    // initialize cells
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";
                	gridCell[6][7] = "o";
                	gridCell[6][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F8
            else if (coords.indexOf("F8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";
                	gridCell[7][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][2] = "o";
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";
                	gridCell[7][7] = "o";
                	gridCell[7][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F9
            else if (coords.indexOf("F9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";
                	gridCell[7][5] = "o";
                	gridCell[8][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][2] = "o";
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";
                	gridCell[8][7] = "o";
                	gridCell[8][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F10
            else if (coords.indexOf("F10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][5] = "o";
                	gridCell[7][5] = "o";
                	gridCell[8][5] = "o";
                	gridCell[9][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][2] = "o";
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";
                	gridCell[9][7] = "o";
                	gridCell[9][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G1
            else if (coords.indexOf("G1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][6] = "o";
                	gridCell[1][6] = "o";
                	gridCell[2][6] = "o";
                	gridCell[3][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";
                	gridCell[1][8] = "o";
                	gridCell[1][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell G2
            else if (coords.indexOf("G2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][6] = "o";
                	gridCell[2][6] = "o";
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o"; 

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";
                	gridCell[1][8] = "o";
                	gridCell[1][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G3
            else if (coords.indexOf("G3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][6] = "o";
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][6] = "o";
                	gridCell[2][7] = "o";
                	gridCell[2][8] = "o";
                	gridCell[2][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G4
            else if (coords.indexOf("G4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][6] = "o";
                	gridCell[1][6] = "o";
                	gridCell[2][6] = "o";
                	gridCell[3][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][6] = "o";
                	gridCell[3][7] = "o";
                	gridCell[3][8] = "o";
                	gridCell[3][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell G5
            else if (coords.indexOf("G5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][6] = "o";
                	gridCell[2][6] = "o";
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";
                	gridCell[7][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][6] = "o";
                	gridCell[4][7] = "o";
                	gridCell[4][8] = "o";
                	gridCell[4][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G6
            else if (coords.indexOf("G6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][6] = "o";
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";
                	gridCell[7][6] = "o";
                	gridCell[8][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][6] = "o";
                	gridCell[5][7] = "o";
                	gridCell[5][8] = "o";
                	gridCell[5][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G7
            else if (coords.indexOf("G7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells up
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][6] = "o";
                	gridCell[7][6] = "o";
                	gridCell[8][6] = "o";
                	gridCell[9][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][6] = "o";
                	gridCell[6][7] = "o";
                	gridCell[6][8] = "o";
                	gridCell[6][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G8
            else if (coords.indexOf("G8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";
                	gridCell[7][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][6] = "o";
                	gridCell[7][7] = "o";
                	gridCell[7][8] = "o";
                	gridCell[7][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G9
            else if (coords.indexOf("G9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";
                	gridCell[7][6] = "o";
                	gridCell[8][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][6] = "o";
                	gridCell[8][7] = "o";
                	gridCell[8][8] = "o";
                	gridCell[8][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G10
            else if (coords.indexOf("G10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][6] = "o";
                	gridCell[7][6] = "o";
                	gridCell[8][6] = "o";
                	gridCell[9][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][6] = "o";
                	gridCell[9][7] = "o";
                	gridCell[9][8] = "o";
                	gridCell[9][9] = "o"; 

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H1
            else if (coords.indexOf("H1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][7] = "o";
                	gridCell[1][7] = "o";
                	gridCell[2][7] = "o";
                	gridCell[3][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][4] = "o";
                	gridCell[0][5] = "o";
                	gridCell[0][6] = "o";
                	gridCell[0][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell H2
            else if (coords.indexOf("H2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][7] = "o";
                	gridCell[2][7] = "o";
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H3
            else if (coords.indexOf("H3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][7] = "o";
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";
                	gridCell[2][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H4
            else if (coords.indexOf("H4") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][7] = "o";
                	gridCell[1][7] = "o";
                	gridCell[2][7] = "o";
                	gridCell[3][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";
                	gridCell[3][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell H5
            else if (coords.indexOf("H5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][7] = "o";
                	gridCell[2][7] = "o";
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";
                	gridCell[7][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";
                	gridCell[4][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H6
            else if (coords.indexOf("H6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][7] = "o";
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";
                	gridCell[7][7] = "o";
                	gridCell[8][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";
                	gridCell[5][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H7
            else if (coords.indexOf("H7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells up
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][7] = "o";
                	gridCell[7][7] = "o";
                	gridCell[8][7] = "o";
                	gridCell[9][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][4] = "o";
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";
                	gridCell[6][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H8
            else if (coords.indexOf("H8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";
                	gridCell[7][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";
                	gridCell[7][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H9
            else if (coords.indexOf("H9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";
                	gridCell[7][7] = "o";
                	gridCell[8][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";
                	gridCell[8][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H10
            else if (coords.indexOf("H10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][7] = "o";
                	gridCell[7][7] = "o";
                	gridCell[8][7] = "o";
                	gridCell[9][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";
                	gridCell[9][7] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I1
            else if (coords.indexOf("I1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][8] = "o";
                	gridCell[1][8] = "o";
                	gridCell[2][8] = "o";
                	gridCell[3][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][5] = "o";
                	gridCell[0][6] = "o";
                	gridCell[0][7] = "o";
                	gridCell[0][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell I2
            else if (coords.indexOf("I2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][8] = "o";
                	gridCell[2][8] = "o";
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";
                	gridCell[1][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I3
            else if (coords.indexOf("I3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][8] = "o";
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";
                	gridCell[2][7] = "o";
                	gridCell[2][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I4
            else if (coords.indexOf("I4") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][8] = "o";
                	gridCell[1][8] = "o";
                	gridCell[2][8] = "o";
                	gridCell[3][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells up
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";
                	gridCell[3][7] = "o";
                	gridCell[3][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell I5
            else if (coords.indexOf("I5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][8] = "o";
                	gridCell[2][8] = "o";
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";
                	gridCell[7][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";
                	gridCell[4][7] = "o";
                	gridCell[4][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I6
            else if (coords.indexOf("I6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][8] = "o";
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";
                	gridCell[7][8] = "o";
                	gridCell[8][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";
                	gridCell[5][7] = "o";
                	gridCell[5][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I7
            else if (coords.indexOf("I7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells up
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][8] = "o";
                	gridCell[7][8] = "o";
                	gridCell[8][8] = "o";
                	gridCell[9][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";
                	gridCell[6][7] = "o";
                	gridCell[6][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I8
            else if (coords.indexOf("I8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";
                	gridCell[7][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";
                	gridCell[7][7] = "o";
                	gridCell[7][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I9
            else if (coords.indexOf("I9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";
                	gridCell[7][8] = "o";
                	gridCell[8][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";
                	gridCell[8][7] = "o";
                	gridCell[8][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I10
            else if (coords.indexOf("I10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";
                	gridCell[8][9] = "o";
                	gridCell[9][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";
                	gridCell[9][7] = "o";
                	gridCell[9][8] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J1
            else if (coords.indexOf("J1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][9] = "o";
                	gridCell[1][9] = "o";
                	gridCell[2][9] = "o";
                	gridCell[3][9] = "o"; 

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][6] = "o";
                	gridCell[0][7] = "o";
                	gridCell[0][8] = "o";
                	gridCell[0][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell J2
            else if (coords.indexOf("J2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][9] = "o";
                	gridCell[2][9] = "o";
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";
                	gridCell[1][8] = "o";
                	gridCell[1][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J3
            else if (coords.indexOf("J3") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][9] = "o";
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][6] = "o";
                	gridCell[2][7] = "o";
                	gridCell[2][8] = "o";
                	gridCell[2][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J4
            else if (coords.indexOf("J4") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][9] = "o";
                	gridCell[1][9] = "o";
                	gridCell[2][9] = "o";
                	gridCell[3][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][6] = "o";
                	gridCell[3][7] = "o";
                	gridCell[3][8] = "o";
                	gridCell[3][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell J5
            else if (coords.indexOf("J5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][9] = "o";
                	gridCell[2][9] = "o";
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][6] = "o";
                	gridCell[4][7] = "o";
                	gridCell[4][8] = "o";
                	gridCell[4][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J6
            else if (coords.indexOf("J6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][9] = "o";
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";
                	gridCell[8][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][6] = "o";
                	gridCell[5][7] = "o";
                	gridCell[5][8] = "o";
                	gridCell[5][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J7
            else if (coords.indexOf("J7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells up
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";
                	gridCell[8][9] = "o";
                	gridCell[9][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][6] = "o";
                	gridCell[6][7] = "o";
                	gridCell[6][8] = "o";
                	gridCell[6][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J8
            else if (coords.indexOf("J8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][6] = "o";
                	gridCell[7][7] = "o";
                	gridCell[7][8] = "o";
                	gridCell[7][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J9
            else if (coords.indexOf("J9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";
                	gridCell[8][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][6] = "o";
                	gridCell[8][7] = "o";
                	gridCell[8][8] = "o";
                	gridCell[8][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J10
            else if (coords.indexOf("J10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";
                	gridCell[8][9] = "o";
                	gridCell[9][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][6] = "o";
                	gridCell[9][7] = "o";
                	gridCell[9][8] = "o";
                	gridCell[9][9] = "o";

                    // set battleshipPositioned flag to true
                    battleshipPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
        }




        // method that places a Destroyer
        public static void placeDestroyer(String coords)
        {
            // in cell A1 
            if (coords.indexOf("A1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][0] = "o";
                	gridCell[1][0] = "o";
                	gridCell[2][0] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][0] = "o";
                	gridCell[0][1] = "o";
                	gridCell[0][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell A2
            else if (coords.indexOf("A2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][0] = "o";
                	gridCell[2][0] = "o";
                	gridCell[3][0] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][0] = "o";
                	gridCell[1][1] = "o";
                	gridCell[1][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A3
            else if (coords.indexOf("A3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][0] = "o";
                	gridCell[1][0] = "o";
                	gridCell[2][0] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][0] = "o";
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][0] = "o";
                	gridCell[2][1] = "o";
                	gridCell[2][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A4
            else if (coords.indexOf("A4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][0] = "o";
                	gridCell[2][0] = "o";
                	gridCell[3][0] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][0] = "o";
                	gridCell[3][1] = "o";
                	gridCell[3][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell A5
            else if (coords.indexOf("A5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][0] = "o";
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][0] = "o";
                	gridCell[4][1] = "o";
                	gridCell[4][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A6
            else if (coords.indexOf("A6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o"; 

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";
                	gridCell[7][0] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][0] = "o";
                	gridCell[5][1] = "o";
                	gridCell[5][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A7
            else if (coords.indexOf("A7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][0] = "o";
                	gridCell[7][0] = "o";
                	gridCell[8][0] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][0] = "o";
                	gridCell[6][1] = "o";
                	gridCell[6][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A8
            else if (coords.indexOf("A8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";
                	gridCell[7][0] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][0] = "o";
                	gridCell[8][0] = "o";
                	gridCell[9][0] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][0] = "o";
                	gridCell[7][1] = "o";
                	gridCell[7][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A9
            else if (coords.indexOf("A9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][0] = "o";
                	gridCell[7][0] = "o";
                	gridCell[8][0] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][0] = "o";
                	gridCell[8][1] = "o";
                	gridCell[8][20] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A10
            else if (coords.indexOf("A10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][0] = "o";
                	gridCell[8][0] = "o";
                	gridCell[9][0] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][0] = "o";
                	gridCell[9][1] = "o";
                	gridCell[9][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B1
            else if (coords.indexOf("B1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][1] = "o";
                	gridCell[1][1] = "o";
                	gridCell[2][1] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][1] = "o";
                	gridCell[0][2] = "o";
                	gridCell[0][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell B2
            else if (coords.indexOf("B2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][1] = "o";
                	gridCell[2][1] = "o";
                	gridCell[3][1] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][1] = "o";
                	gridCell[1][2] = "o";
                	gridCell[1][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B3
            else if (coords.indexOf("B3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][1] = "o";
                	gridCell[1][1] = "o";
                	gridCell[2][1] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][1] = "o";
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][1] = "o";
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B4
            else if (coords.indexOf("B4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// debug print-string tests
                    System.out.println("True, got here as well..");
                    
                    // initialize cells
                	gridCell[1][1] = "o";
                	gridCell[2][1] = "o";
                	gridCell[3][1] = "o";
                	
                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][1] = "o";
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell B5
            else if (coords.indexOf("B5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][1] = "o";
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][1] = "o";
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B6
            else if (coords.indexOf("B6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";
                	gridCell[7][1] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][1] = "o";
                	gridCell[5][2] = "o";
                	gridCell[5][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B7
            else if (coords.indexOf("B7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][1] = "o";
                	gridCell[7][1] = "o";
                	gridCell[8][1] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][1] = "o";
                	gridCell[6][2] = "o";
                	gridCell[6][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B8
            else if (coords.indexOf("B8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";
                	gridCell[7][1] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][1] = "o";
                	gridCell[8][1] = "o";
                	gridCell[9][1] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][1] = "o";
                	gridCell[7][2] = "o";
                	gridCell[7][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B9
            else if (coords.indexOf("B9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][1] = "o";
                	gridCell[7][1] = "o";
                	gridCell[8][1] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][1] = "o";
                	gridCell[8][2] = "o";
                	gridCell[8][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B10
            else if (coords.indexOf("B10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][1] = "o";
                	gridCell[8][1] = "o";
                	gridCell[9][1] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][1] = "o";
                	gridCell[9][2] = "o";
                	gridCell[9][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
            
            // in cell C1 
            else if (coords.indexOf("C1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][2] = "o";
                	gridCell[1][2] = "o";
                	gridCell[2][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][0] = "o";
                	gridCell[0][1] = "o";
                	gridCell[0][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][2] = "o";
                	gridCell[0][3] = "o";
                	gridCell[0][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell C2
            else if (coords.indexOf("C2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][2] = "o";
                	gridCell[2][2] = "o";
                	gridCell[3][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][0] = "o";
                	gridCell[1][1] = "o";
                	gridCell[1][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][2] = "o";
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C3
            else if (coords.indexOf("C3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][2] = "o";
                	gridCell[1][2] = "o";
                	gridCell[2][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][2] = "o";
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][0] = "o";
                	gridCell[2][1] = "o";
                	gridCell[2][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C4
            else if (coords.indexOf("C4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][2] = "o";
                	gridCell[2][2] = "o";
                	gridCell[3][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][0] = "o";
                	gridCell[3][1] = "o";
                	gridCell[3][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell C5
            else if (coords.indexOf("C5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][2] = "o";
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][0] = "o";
                	gridCell[4][1] = "o";
                	gridCell[4][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C6
            else if (coords.indexOf("C6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";
                	gridCell[7][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][0] = "o";
                	gridCell[5][1] = "o";
                	gridCell[5][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][2] = "o";
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C7
            else if (coords.indexOf("C7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][2] = "o";
                	gridCell[7][2] = "o";
                	gridCell[8][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][0] = "o";
                	gridCell[6][1] = "o";
                	gridCell[6][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][2] = "o";
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C8
            else if (coords.indexOf("C8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";
                	gridCell[7][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][2] = "o";
                	gridCell[8][2] = "o";
                	gridCell[9][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][0] = "o";
                	gridCell[7][1] = "o";
                	gridCell[7][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][2] = "o";
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C9
            else if (coords.indexOf("C9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][2] = "o";
                	gridCell[7][2] = "o";
                	gridCell[8][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][0] = "o";
                	gridCell[8][1] = "o";
                	gridCell[8][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][2] = "o";
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C10
            else if (coords.indexOf("C10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][2] = "o";
                	gridCell[8][2] = "o";
                	gridCell[9][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][0] = "o";
                	gridCell[9][1] = "o";
                	gridCell[9][2] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][2] = "o";
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D1
            else if (coords.indexOf("D1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][3] = "o";
                	gridCell[1][3] = "o";
                	gridCell[2][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][1] = "o";
                	gridCell[0][2] = "o";
                	gridCell[0][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][3] = "o";
                	gridCell[0][4] = "o";
                	gridCell[0][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell D2
            else if (coords.indexOf("D2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][3] = "o";
                	gridCell[2][3] = "o";
                	gridCell[3][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][1] = "o";
                	gridCell[1][2] = "o";
                	gridCell[1][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D3
            else if (coords.indexOf("D3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][3] = "o";
                	gridCell[1][3] = "o";
                	gridCell[2][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][3] = "o";
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][1] = "o";
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D4
            else if (coords.indexOf("D4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][3] = "o";
                	gridCell[2][3] = "o";
                	gridCell[3][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o"; 

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][1] = "o";
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell D5
            else if (coords.indexOf("D5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][3] = "o";
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][1] = "o";
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D6
            else if (coords.indexOf("D6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";
                	gridCell[7][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][1] = "o";
                	gridCell[5][2] = "o";
                	gridCell[5][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D7
            else if (coords.indexOf("D7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][3] = "o";
                	gridCell[7][3] = "o";
                	gridCell[8][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][1] = "o";
                	gridCell[6][2] = "o";
                	gridCell[6][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";
                	gridCell[6][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D8
            else if (coords.indexOf("D8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";
                	gridCell[7][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][3] = "o";
                	gridCell[8][3] = "o";
                	gridCell[9][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][1] = "o";
                	gridCell[7][2] = "o";
                	gridCell[7][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D9
            else if (coords.indexOf("D9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][3] = "o";
                	gridCell[7][3] = "o";
                	gridCell[8][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][1] = "o";
                	gridCell[8][2] = "o";
                	gridCell[8][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D10
            else if (coords.indexOf("D10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][3] = "o";
                	gridCell[8][3] = "o";
                	gridCell[9][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][1] = "o";
                	gridCell[9][2] = "o";
                	gridCell[9][3] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E1
            else if (coords.indexOf("E1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][4] = "o";
                	gridCell[1][4] = "o";
                	gridCell[2][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][2] = "o";
                	gridCell[0][3] = "o";
                	gridCell[0][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][4] = "o";
                	gridCell[0][5] = "o";
                	gridCell[0][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell E2
            else if (coords.indexOf("E2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][4] = "o";
                	gridCell[2][4] = "o";
                	gridCell[3][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][2] = "o";
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E3
            else if (coords.indexOf("E3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][4] = "o";
                	gridCell[1][4] = "o";
                	gridCell[2][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][4] = "o";
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E4
            else if (coords.indexOf("E4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][4] = "o";
                	gridCell[2][4] = "o";
                	gridCell[3][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell E5
            else if (coords.indexOf("E5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][4] = "o";
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E6
            else if (coords.indexOf("E6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";
                	gridCell[7][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][2] = "o";
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E7
            else if (coords.indexOf("E7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][4] = "o";
                	gridCell[7][4] = "o";
                	gridCell[8][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][2] = "o";
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][4] = "o";
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E8
            else if (coords.indexOf("E8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";
                	gridCell[7][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][4] = "o";
                	gridCell[8][4] = "o";
                	gridCell[9][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][2] = "o";
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E9
            else if (coords.indexOf("E9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][4] = "o";
                	gridCell[7][4] = "o";
                	gridCell[8][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][2] = "o";
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E10
            else if (coords.indexOf("E10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][4] = "o";
                	gridCell[8][4] = "o";
                	gridCell[9][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][2] = "o";
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell F1 
            else if (coords.indexOf("F1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][5] = "o";
                	gridCell[1][5] = "o";
                	gridCell[2][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][3] = "o";
                	gridCell[0][4] = "o";
                	gridCell[0][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][5] = "o";
                	gridCell[0][6] = "o";
                	gridCell[0][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell F2
            else if (coords.indexOf("F2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][5] = "o";
                	gridCell[2][5] = "o";
                	gridCell[3][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F3
            else if (coords.indexOf("F3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][5] = "o";
                	gridCell[1][5] = "o";
                	gridCell[2][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][5] = "o";
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";
                	gridCell[2][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F4
            else if (coords.indexOf("F4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][5] = "o";
                	gridCell[2][5] = "o";
                	gridCell[3][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";
                	gridCell[3][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell F5
            else if (coords.indexOf("F5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][5] = "o";
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";
                	gridCell[4][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F6
            else if (coords.indexOf("F6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";
                	gridCell[7][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";
                	gridCell[5][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F7
            else if (coords.indexOf("F7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][5] = "o";
                	gridCell[7][5] = "o";
                	gridCell[8][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";
                	gridCell[6][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";
                	gridCell[6][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F8
            else if (coords.indexOf("F8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";
                	gridCell[7][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][5] = "o";
                	gridCell[8][5] = "o";
                	gridCell[9][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";
                	gridCell[7][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F9
            else if (coords.indexOf("F9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][5] = "o";
                	gridCell[7][5] = "o";
                	gridCell[8][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";
                	gridCell[8][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F10
            else if (coords.indexOf("F10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][5] = "o";
                	gridCell[8][5] = "o";
                	gridCell[9][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";
                	gridCell[9][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G1
            else if (coords.indexOf("G1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][6] = "o";
                	gridCell[1][6] = "o";
                	gridCell[2][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][4] = "o";
                	gridCell[0][5] = "o";
                	gridCell[0][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][6] = "o";
                	gridCell[0][7] = "o";
                	gridCell[0][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell G2
            else if (coords.indexOf("G2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][6] = "o";
                	gridCell[2][6] = "o";
                	gridCell[3][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";
                	gridCell[1][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G3
            else if (coords.indexOf("G3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][6] = "o";
                	gridCell[1][6] = "o";
                	gridCell[2][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][6] = "o";
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][6] = "o";
                	gridCell[2][7] = "o";
                	gridCell[2][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G4
            else if (coords.indexOf("G4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][6] = "o";
                	gridCell[2][6] = "o";
                	gridCell[3][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][6] = "o";
                	gridCell[3][7] = "o";
                	gridCell[3][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell G5
            else if (coords.indexOf("G5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][6] = "o";
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][6] = "o";
                	gridCell[4][7] = "o";
                	gridCell[4][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G6
            else if (coords.indexOf("G6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";
                	gridCell[7][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][6] = "o";
                	gridCell[5][7] = "o";
                	gridCell[5][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G7
            else if (coords.indexOf("G7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells up
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][6] = "o";
                	gridCell[7][6] = "o";
                	gridCell[8][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][4] = "o";
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][6] = "o";
                	gridCell[6][7] = "o";
                	gridCell[6][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G8
            else if (coords.indexOf("G8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";
                	gridCell[7][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][6] = "o";
                	gridCell[8][6] = "o";
                	gridCell[9][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][6] = "o";
                	gridCell[7][7] = "o";
                	gridCell[7][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G9
            else if (coords.indexOf("G9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][6] = "o";
                	gridCell[7][6] = "o";
                	gridCell[8][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][6] = "o";
                	gridCell[8][7] = "o";
                	gridCell[8][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G10
            else if (coords.indexOf("G10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][6] = "o";
                	gridCell[8][6] = "o";
                	gridCell[9][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][6] = "o";
                	gridCell[9][7] = "o";
                	gridCell[9][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H1
            else if (coords.indexOf("H1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][7] = "o";
                	gridCell[1][7] = "o";
                	gridCell[2][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][5] = "o";
                	gridCell[0][6] = "o";
                	gridCell[0][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][7] = "o";
                	gridCell[0][8] = "o";
                	gridCell[0][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell H2
            else if (coords.indexOf("H2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][7] = "o";
                	gridCell[2][7] = "o";
                	gridCell[3][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][7] = "o";
                	gridCell[1][8] = "o";
                	gridCell[1][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H3
            else if (coords.indexOf("H3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][7] = "o";
                	gridCell[1][7] = "o";
                	gridCell[2][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                  
                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][7] = "o";
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";
                	gridCell[2][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][7] = "o";
                	gridCell[2][8] = "o";
                	gridCell[2][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H4
            else if (coords.indexOf("H4") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][7] = "o";
                	gridCell[2][7] = "o";
                	gridCell[3][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";
                	gridCell[3][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][7] = "o";
                	gridCell[3][8] = "o";
                	gridCell[3][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell H5
            else if (coords.indexOf("H5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][7] = "o";
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";
                	gridCell[4][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                    

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H6
            else if (coords.indexOf("H6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";
                	gridCell[7][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";
                	gridCell[5][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][7] = "o";
                	gridCell[5][8] = "o";
                	gridCell[5][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H7
            else if (coords.indexOf("H7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells up
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][7] = "o";
                	gridCell[7][7] = "o";
                	gridCell[8][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";
                	gridCell[6][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][7] = "o";
                	gridCell[6][8] = "o";
                	gridCell[6][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H8
            else if (coords.indexOf("H8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";
                	gridCell[7][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][7] = "o";
                	gridCell[8][7] = "o";
                	gridCell[9][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";
                	gridCell[7][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][7] = "o";
                	gridCell[7][8] = "o";
                	gridCell[7][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                  

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H9
            else if (coords.indexOf("H9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][7] = "o";
                	gridCell[7][7] = "o";
                	gridCell[8][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";
                	gridCell[8][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][7] = "o";
                	gridCell[8][8] = "o";
                	gridCell[8][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H10
            else if (coords.indexOf("H10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][7] = "o";
                	gridCell[8][7] = "o";
                	gridCell[9][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";
                	gridCell[9][7] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][7] = "o";
                	gridCell[9][8] = "o";
                	gridCell[9][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I1
            else if (coords.indexOf("I1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][8] = "o";
                	gridCell[1][8] = "o";
                	gridCell[2][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                  

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][6] = "o";
                	gridCell[0][7] = "o";
                	gridCell[0][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell I2
            else if (coords.indexOf("I2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][8] = "o";
                	gridCell[2][8] = "o";
                	gridCell[3][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";
                	gridCell[1][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I3
            else if (coords.indexOf("I3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][8] = "o";
                	gridCell[1][8] = "o";
                	gridCell[2][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }                

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][8] = "o";
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][6] = "o";
                	gridCell[2][7] = "o";
                	gridCell[2][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I4
            else if (coords.indexOf("I4") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][8] = "o";
                	gridCell[2][8] = "o";
                	gridCell[3][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                 
                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][6] = "o";
                	gridCell[3][7] = "o";
                	gridCell[3][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell I5
            else if (coords.indexOf("I5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][8] = "o";
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                  

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][6] = "o";
                	gridCell[4][7] = "o";
                	gridCell[4][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I6
            else if (coords.indexOf("I6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";
                	gridCell[7][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][6] = "o";
                	gridCell[5][7] = "o";
                	gridCell[5][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I7
            else if (coords.indexOf("I7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells up
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][8] = "o";
                	gridCell[7][8] = "o";
                	gridCell[8][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                  

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][6] = "o";
                	gridCell[6][7] = "o";
                	gridCell[6][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I8
            else if (coords.indexOf("I8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";
                	gridCell[7][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][8] = "o";
                	gridCell[8][8] = "o";
                	gridCell[9][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][6] = "o";
                	gridCell[7][7] = "o";
                	gridCell[7][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I9
            else if (coords.indexOf("I9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][8] = "o";
                	gridCell[7][8] = "o";
                	gridCell[8][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][6] = "o";
            	gridCell[8][7 ] = "o";
                	gridCell[8][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I10
            else if (coords.indexOf("I10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][8] = "o";
                	gridCell[8][8] = "o";
                	gridCell[9][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][6] = "o";
                	gridCell[9][7] = "o";
                	gridCell[9][8] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J1
            else if (coords.indexOf("J1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][9] = "o";
                	gridCell[1][9] = "o";
                	gridCell[2][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][7] = "o";
                	gridCell[0][8] = "o";
                	gridCell[0][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell J2
            else if (coords.indexOf("J2") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][9] = "o";
                	gridCell[2][9] = "o";
                	gridCell[3][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][7] = "o";
                	gridCell[1][8] = "o";
                	gridCell[1][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J3
            else if (coords.indexOf("J3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][9] = "o";
                	gridCell[1][9] = "o";
                	gridCell[2][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][9] = "o";
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][7] = "o";
                	gridCell[2][8] = "o";
                	gridCell[3][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J4
            else if (coords.indexOf("J4") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][9] = "o";
                	gridCell[2][9] = "o";
                	gridCell[3][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][7] = "o";
                	gridCell[3][8] = "o";
                	gridCell[3][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell J5
            else if (coords.indexOf("J5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][9] = "o";
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][7] = "o";
                	gridCell[4][8] = "o";
                	gridCell[4][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J6
            else if (coords.indexOf("J6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o"; 

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][7] = "o";
                	gridCell[5][8] = "o";
                	gridCell[5][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J7
            else if (coords.indexOf("J7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells up
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";
                	gridCell[8][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][7] = "o";
                	gridCell[6][8] = "o";
                	gridCell[6][9] = "o";

                    // set destroyerPositioned flag to true
                	destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J8
            else if (coords.indexOf("J8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][9] = "o";
                	gridCell[8][9] = "o";
                	gridCell[9][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][7] = "o";
                	gridCell[7][8] = "o";
                	gridCell[7][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J9
            else if (coords.indexOf("J9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";
                	gridCell[8][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][7] = "o";
                	gridCell[8][8] = "o";
                	gridCell[8][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J10
            else if (coords.indexOf("J10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][9] = "o";
                	gridCell[8][9] = "o";
                	gridCell[9][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][7] = "o";
                	gridCell[9][8] = "o";
                	gridCell[9][9] = "o";

                    // set destroyerPositioned flag to true
                    destroyerPositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
        }




        // method that places a Submarine
        public static void placeSubmarine(String coords)
        {
            // in cell A1 
            if (coords.indexOf("A1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][0] = "o";
                	gridCell[1][0] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][0] = "o";
                	gridCell[0][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell A2
            else if (coords.indexOf("A2") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][0] = "o";
                	gridCell[1][0] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][0] = "o";
                	gridCell[2][0] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][0] = "o";
                	gridCell[1][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A3
            else if (coords.indexOf("A3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][0] = "o";
                	gridCell[2][0] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][0] = "o";
                	gridCell[3][0] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][0] = "o";
                	gridCell[2][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A4
            else if (coords.indexOf("A4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][0] = "o";
                	gridCell[3][0] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][0] = "o";
                	gridCell[3][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell A5
            else if (coords.indexOf("A5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][0] = "o";
                	gridCell[4][0] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][0] = "o";
                	gridCell[4][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A6
            else if (coords.indexOf("A6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][0] = "o";
                	gridCell[5][0] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][0] = "o";
                	gridCell[5][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A7
            else if (coords.indexOf("A7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][0] = "o";
                	gridCell[6][0] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][0] = "o";
                	gridCell[7][0] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][0] = "o";
                	gridCell[6][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A8
            else if (coords.indexOf("A8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][0] = "o";
                	gridCell[7][0] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][0] = "o";
                	gridCell[8][0] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][0] = "o";
                	gridCell[7][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A9
            else if (coords.indexOf("A9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][0] = "o";
                	gridCell[8][0] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[8][0] = "o";
                	gridCell[9][0] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][0] = "o";
                	gridCell[8][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell A10
            else if (coords.indexOf("A10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[8][0] = "o";
                	gridCell[9][0] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][0] = "o";
                	gridCell[9][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B1
            else if (coords.indexOf("B1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][1] = "o";
                	gridCell[1][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][0] = "o";
                	gridCell[0][1] = "o";

                    // set submarinePositioned flag to true
                	submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][1] = "o";
                	gridCell[0][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell B2
            else if (coords.indexOf("B2") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][1] = "o";
                	gridCell[1][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][1] = "o";
                	gridCell[2][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][0] = "o";
                	gridCell[1][1] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][1] = "o";
                	gridCell[1][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B3
            else if (coords.indexOf("B3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][1] = "o";
                	gridCell[2][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][1] = "o";
                	gridCell[3][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][0] = "o";
                	gridCell[2][1] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][1] = "o";
                	gridCell[2][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B4
            else if (coords.indexOf("B4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][1] = "o";
                	gridCell[3][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][0] = "o";
                	gridCell[4][1] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][1] = "o";
                	gridCell[4][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell B5
            else if (coords.indexOf("B5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][1] = "o";
                	gridCell[4][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][0] = "o";
                	gridCell[4][1] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][1] = "o";
                	gridCell[4][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                  

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B6
            else if (coords.indexOf("B6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][1] = "o";
                	gridCell[5][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][0] = "o";
                	gridCell[5][1] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][1] = "o";
                	gridCell[5][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B7
            else if (coords.indexOf("B7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][1] = "o";
                	gridCell[6][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][1] = "o";
                	gridCell[7][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][0] = "o";
                	gridCell[6][1] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][1] = "o";
                	gridCell[6][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B8
            else if (coords.indexOf("B8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][1] = "o";
                	gridCell[7][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][1] = "o";
                	gridCell[8][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][0] = "o";
                	gridCell[7][1] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][1] = "o";
                	gridCell[7][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B9
            else if (coords.indexOf("B9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][1] = "o";
                	gridCell[8][1] = "o"; 

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[8][1] = "o";
                	gridCell[9][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][0] = "o";
                	gridCell[8][1] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][1] = "o";
                	gridCell[8][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell B10
            else if (coords.indexOf("B10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[8][1] = "o";
                	gridCell[9][1] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][0] = "o";
                	gridCell[9][1] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][1] = "o";
                	gridCell[9][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
            
            // in cell C1 
            else if (coords.indexOf("C1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][2] = "o";
                	gridCell[1][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                  

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][1] = "o";
                	gridCell[0][2] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][2] = "o";
                	gridCell[0][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell C2
            else if (coords.indexOf("C2") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][2] = "o";
                	gridCell[1][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][2] = "o";
                	gridCell[2][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                  

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][1] = "o";
                	gridCell[1][2] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][2] = "o";
                	gridCell[1][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C3
            else if (coords.indexOf("C3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][2] = "o";
                	gridCell[2][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][2] = "o";
                	gridCell[3][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][1] = "o";
                	gridCell[2][2] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C4
            else if (coords.indexOf("C4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][2] = "o";
                	gridCell[3][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][1] = "o";
                	gridCell[3][2] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell C5
            else if (coords.indexOf("C5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][2] = "o";
                	gridCell[4][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][1] = "o";
                	gridCell[4][2] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C6
            else if (coords.indexOf("C6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][2] = "o";
                	gridCell[5][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][1] = "o";
                	gridCell[5][2] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][2] = "o";
                	gridCell[5][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                  

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C7
            else if (coords.indexOf("C7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][2] = "o";
                	gridCell[6][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][2] = "o";
                	gridCell[7][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][1] = "o";
                	gridCell[6][2] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][2] = "o";
                	gridCell[6][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C8
            else if (coords.indexOf("C8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][2] = "o";
                	gridCell[7][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][2] = "o";
                	gridCell[8][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][1] = "o";
                	gridCell[7][2] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][2] = "o";
                	gridCell[7][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C9
            else if (coords.indexOf("C9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][2] = "o";
                	gridCell[8][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[8][2] = "o";
                	gridCell[9][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][1] = "o";
                	gridCell[8][2] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][2] = "o";
                	gridCell[8][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell C10
            else if (coords.indexOf("C10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[8][2] = "o";
                	gridCell[9][2] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][1] = "o";
                	gridCell[9][2] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][2] = "o";
                	gridCell[9][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D1
            else if (coords.indexOf("D1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][3] = "o";
                	gridCell[1][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][2] = "o";
                	gridCell[0][3] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][3] = "o";
                	gridCell[0][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell D2
            else if (coords.indexOf("D2") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][3] = "o";
                	gridCell[1][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][3] = "o";
                	gridCell[2][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D3
            else if (coords.indexOf("D3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][3] = "o";
                	gridCell[2][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][3] = "o";
                	gridCell[3][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][2] = "o";
                	gridCell[2][3] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D4
            else if (coords.indexOf("D4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][3] = "o";
                	gridCell[3][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][2] = "o";
                	gridCell[3][3] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell D5
            else if (coords.indexOf("D5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][3] = "o";
                	gridCell[4][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                  

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][2] = "o";
                	gridCell[4][3] = "o";
         
                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D6
            else if (coords.indexOf("D6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][3] = "o";
                	gridCell[5][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][2] = "o";
                	gridCell[5][3] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D7
            else if (coords.indexOf("D7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][3] = "o";
                	gridCell[6][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][3] = "o";
                	gridCell[7][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][2] = "o";
                	gridCell[6][3] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D8
            else if (coords.indexOf("D8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][3] = "o";
                	gridCell[7][3] = "o"; 

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                  

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][3] = "o";
                	gridCell[8][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][2] = "o";
                	gridCell[7][3] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D9
            else if (coords.indexOf("D9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][3] = "o";
                	gridCell[8][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[8][3] = "o";
                	gridCell[9][3] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][2] = "o";
                	gridCell[8][3] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell D10
            else if (coords.indexOf("D10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[8][3] = "o";
                	gridCell[9][3] = "o";                    

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][2] = "o";
                	gridCell[9][3] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E1
            else if (coords.indexOf("E1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][4] = "o";
                	gridCell[1][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][3] = "o";
                	gridCell[0][4] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][4] = "o";
                	gridCell[0][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell E2
            else if (coords.indexOf("E2") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][4] = "o";
                	gridCell[1][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][4] = "o";
                	gridCell[2][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][3] = "o";
                	gridCell[1][4] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E3
            else if (coords.indexOf("E3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][4] = "o";
                	gridCell[2][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][4] = "o";
                	gridCell[3][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][3] = "o";
                	gridCell[2][4] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E4
            else if (coords.indexOf("E4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][4] = "o";
                	gridCell[3][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o"; 

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][3] = "o";
                	gridCell[3][4] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell E5
            else if (coords.indexOf("E5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][4] = "o";
                	gridCell[4][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][3] = "o";
                	gridCell[4][4] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E6
            else if (coords.indexOf("E6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][4] = "o";
                	gridCell[5][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][3] = "o";
                	gridCell[5][4] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E7
            else if (coords.indexOf("E7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][4] = "o";
                	gridCell[6][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][4] = "o";
                	gridCell[7][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][3] = "o";
                	gridCell[6][4] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][4] = "o";
                	gridCell[6][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E8
            else if (coords.indexOf("E8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][4] = "o";
                	gridCell[7][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][4] = "o";
                	gridCell[8][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][3] = "o";
                	gridCell[7][4] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E9
            else if (coords.indexOf("E9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][4] = "o";
                	gridCell[8][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[8][4] = "o";
                	gridCell[9][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][3] = "o";
                	gridCell[8][4] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell E10
            else if (coords.indexOf("E10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[8][4] = "o";
                	gridCell[9][4] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][3] = "o";
                	gridCell[9][4] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                  

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell F1 
            else if (coords.indexOf("F1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][5] = "o";
                	gridCell[1][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][4] = "o";
                	gridCell[0][5] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][5] = "o";
                	gridCell[0][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                  

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell F2
            else if (coords.indexOf("F2") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][5] = "o";
                	gridCell[1][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][5] = "o";
                	gridCell[2][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][4] = "o";
                	gridCell[1][5] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F3
            else if (coords.indexOf("F3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][5] = "o";
                	gridCell[2][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][5] = "o";
                	gridCell[3][5] = "o"; 

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][4] = "o";
                	gridCell[2][5] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F4
            else if (coords.indexOf("F4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][5] = "o";
                	gridCell[3][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][4] = "o";
                	gridCell[3][5] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell F5
            else if (coords.indexOf("F5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][5] = "o";
                	gridCell[4][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][4] = "o";
                	gridCell[4][5] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                  

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F6
            else if (coords.indexOf("F6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][5] = "o";
                	gridCell[5][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][4] = "o";
                	gridCell[5][5] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F7
            else if (coords.indexOf("F7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][5] = "o";
                	gridCell[6][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][5] = "o";
                	gridCell[7][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][4] = "o";
                	gridCell[6][5] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F8
            else if (coords.indexOf("F8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][5] = "o";
                	gridCell[7][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][5] = "o";
                	gridCell[8][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][4] = "o";
                	gridCell[7][5] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F9
            else if (coords.indexOf("F9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][5] = "o";
                	gridCell[8][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[8][5] = "o";
                	gridCell[9][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                  

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][4] = "o";
                	gridCell[8][5] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell F10
            else if (coords.indexOf("F10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[8][5] = "o";
                	gridCell[9][5] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][4] = "o";
                	gridCell[9][5] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G1
            else if (coords.indexOf("G1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][6] = "o";
                	gridCell[1][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][5] = "o";
                	gridCell[0][6] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][6] = "o";
                	gridCell[0][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell G2
            else if (coords.indexOf("G2") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][6] = "o";
                	gridCell[1][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][6] = "o";
                	gridCell[2][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][5] = "o";
                	gridCell[1][6] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G3
            else if (coords.indexOf("G3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][6] = "o";
                	gridCell[2][6] = "o"; 

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][6] = "o";
                	gridCell[3][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][5] = "o";
                	gridCell[2][6] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][6] = "o";
                	gridCell[2][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G4
            else if (coords.indexOf("G4") != -1)
            {
                // or including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][6] = "o";
                	gridCell[3][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][5] = "o";
                	gridCell[3][6] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][6] = "o";
                	gridCell[3][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell G5
            else if (coords.indexOf("G5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][6] = "o";
                	gridCell[4][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][5] = "o";
                	gridCell[4][6] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][6] = "o";
                	gridCell[4][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G6
            else if (coords.indexOf("G6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][6] = "o";
                	gridCell[5][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                  

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][5] = "o";
                	gridCell[5][6] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][6] = "o";
                	gridCell[5][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G7
            else if (coords.indexOf("G7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][6] = "o";
                	gridCell[6][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells up
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][6] = "o";
                	gridCell[7][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][5] = "o";
                	gridCell[6][6] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][6] = "o";
                	gridCell[6][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G8
            else if (coords.indexOf("G8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][6] = "o";
                	gridCell[7][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][6] = "o";
                	gridCell[8][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][5] = "o";
                	gridCell[7][6] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][6] = "o";
                	gridCell[7][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G9
            else if (coords.indexOf("G9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][6] = "o";
                	gridCell[8][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[8][6] = "o";
                	gridCell[9][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][5] = "o";
                	gridCell[8][6] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][6] = "o";
                	gridCell[8][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell G10
            else if (coords.indexOf("G10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[8][6] = "o";
                	gridCell[9][6] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][5] = "o";
                	gridCell[9][6] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][6] = "o";
                	gridCell[9][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H1
            else if (coords.indexOf("H1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][7] = "o";
                	gridCell[1][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][6] = "o";
                	gridCell[0][7] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][7] = "o";
                	gridCell[0][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell H2
            else if (coords.indexOf("H2") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][7] = "o";
                	gridCell[1][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][7] = "o";
                	gridCell[2][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][6] = "o";
                	gridCell[1][7] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[1][7] = "o";
                	gridCell[1][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H3
            else if (coords.indexOf("H3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][7] = "o";
                	gridCell[2][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                  
                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][7] = "o";
                	gridCell[3][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// debug print-string tests
                	System.out.println("Whoopee, got in here three....");
                	
                	// initialize cells
                	gridCell[2][6] = "o";
                	gridCell[2][7] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                    System.out.println("Whoopee, got in here three....");
                    
                    // initialize cells
                	gridCell[2][7] = "o";
                	gridCell[2][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H4
            else if (coords.indexOf("H4") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][7] = "o";
                	gridCell[3][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                
                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][6] = "o";
                	gridCell[3][7] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][7] = "o";
                	gridCell[3][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell H5
            else if (coords.indexOf("H5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][7] = "o";
                	gridCell[4][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][6] = "o";
                	gridCell[4][7] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][7] = "o";
                	gridCell[4][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H6
            else if (coords.indexOf("H6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][7] = "o";
                	gridCell[5][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                  

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][6] = "o";
                	gridCell[5][7] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][7] = "o";
                	gridCell[5][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H7
            else if (coords.indexOf("H7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][7] = "o";
                	gridCell[6][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells up
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][7] = "o";
                	gridCell[7][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][6] = "o";
                	gridCell[6][7] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][7] = "o";
                	gridCell[6][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H8
            else if (coords.indexOf("H8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][7] = "o";
                	gridCell[7][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][7] = "o";
                	gridCell[8][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][6] = "o";
                	gridCell[7][7] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][7] = "o";
                	gridCell[7][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H9
            else if (coords.indexOf("H9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][7] = "o";
                	gridCell[8][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[8][7] = "o";
                	gridCell[9][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][6] = "o";
                	gridCell[8][7] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][7] = "o";
                	gridCell[8][8] = "o"; 

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell H10
            else if (coords.indexOf("H10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[8][7] = "o";
                	gridCell[9][7] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][6] = "o";
                	gridCell[9][7] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][7] = "o";
                	gridCell[9][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I1
            else if (coords.indexOf("I1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][8] = "o";
                	gridCell[1][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][7] = "o";
                	gridCell[0][8] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[0][8] = "o";
                	gridCell[0][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell I2
            else if (coords.indexOf("I2") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][8] = "o";
                	gridCell[1][8] = "o"; 

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][8] = "o";
                	gridCell[2][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][7] = "o";
                	gridCell[2][8] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][8] = "o";
                	gridCell[2][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I3
            else if (coords.indexOf("I3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[1][8] = "o";
                	gridCell[2][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }                

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][8] = "o";
                	gridCell[3][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][7] = "o";
                	gridCell[2][8] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[2][8] = "o";
                	gridCell[2][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I4
            else if (coords.indexOf("I4") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][8] = "o";
                	gridCell[3][8] = "o"; 

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }
                 
                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][7] = "o";
                	gridCell[3][8] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[3][8] = "o";
                	gridCell[3][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell I5
            else if (coords.indexOf("I5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][8] = "o";
                	gridCell[4][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][7] = "o";
                	gridCell[4][8] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[4][8] = "o";
                	gridCell[4][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I6
            else if (coords.indexOf("I6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][8] = "o";
                	gridCell[5][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][7] = "o";
                	gridCell[5][8] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[5][8] = "o";
                	gridCell[5][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I7
            else if (coords.indexOf("I7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][8] = "o";
                	gridCell[6][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells up
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][8] = "o";
                	gridCell[7][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][7] = "o";
                	gridCell[6][8] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[6][8] = "o";
                	gridCell[6][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I8
            else if (coords.indexOf("I8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][8] = "o";
                	gridCell[7][8] = "o"; 

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][8] = "o";
                	gridCell[8][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][7] = "o";
                	gridCell[7][8] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[7][8] = "o";
                	gridCell[7][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I9
            else if (coords.indexOf("I9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][8] = "o";
                	gridCell[8][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                 

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[8][8] = "o";
                	gridCell[9][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][7] = "o";
                	gridCell[8][8] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[8][8] = "o";
                	gridCell[8][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell I10
            else if (coords.indexOf("I10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[8][8] = "o";
                	gridCell[9][8] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][7] = "o";
                	gridCell[9][8] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells to the right
                else if (coords.indexOf("RIGHT") != -1)
                {
                	// initialize cells
                	gridCell[9][8] = "o";
                	gridCell[9][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J1
            else if (coords.indexOf("J1") != -1)
            {
                // including the next 4 cells down
                if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[0][9] = "o";
                	gridCell[1][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[0][8] = "o";
                	gridCell[0][9] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }

            }

            // in cell J2
            else if (coords.indexOf("J2") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[0][9] = "o";
                	gridCell[1][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[1][9] = "o";
                	gridCell[2][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[1][8] = "o";
                	gridCell[1][9] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J3
            else if (coords.indexOf("J3") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[2][8] = "o";
                	gridCell[2][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[2][9] = "o";
                	gridCell[3][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[2][8] = "o";
                	gridCell[2][9] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J4
            else if (coords.indexOf("J4") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][8] = "o";
                	gridCell[3][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[3][8] = "o";
                	gridCell[3][9] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
           
            // in cell J5
            else if (coords.indexOf("J5") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[3][9] = "o";
                	gridCell[4][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[4][8] = "o";
                	gridCell[4][9] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J6
            else if (coords.indexOf("J6") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[4][9] = "o";
                	gridCell[5][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[5][8] = "o";
                	gridCell[5][9] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J7
            else if (coords.indexOf("J7") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[5][9] = "o";
                	gridCell[6][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells up
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[6][8] = "o";
                	gridCell[6][9] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J8
            else if (coords.indexOf("J8") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[6][9] = "o";
                	gridCell[7][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[7][9] = "o";
                	gridCell[8][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[7][8] = "o";
                	gridCell[7][9] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J9
            else if (coords.indexOf("J9") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[7][9] = "o";
                	gridCell[8][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // including the next 4 cells down
                else if (coords.indexOf("DOWN") != -1)
                {
                	// initialize cells
                	gridCell[8][9] = "o";
                	gridCell[9][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[8][8] = "o";
                	gridCell[8][9] = "o";

                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }

            // in cell J10
            else if (coords.indexOf("J10") != -1)
            {
                // including the next 4 cells up
                if (coords.indexOf("UP") != -1)
                {
                	// initialize cells
                	gridCell[8][9] = "o";
                	gridCell[9][9] = "o";

                    // set submarinePositioned flag to true
                    submarinePositioned = true;                   

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // or including the next 4 cells to the left
                else if (coords.indexOf("LEFT") != -1)
                {
                	// initialize cells
                	gridCell[9][8] = "o";
                	gridCell[9][9] = "o";


                	// set submarinePositioned flag to true
                    submarinePositioned = true;                    

                    // record number of ships positioned
                    numberOfShipsPositioned++;
                }

                // otherwise, wrong entry
                else 
                {
                    System.out.println("Invalid input! Try again.");
                }
            }
        }




        // method that places a Torpedo Boat
        public static void placeTorpedoBoat(String coords)
        {
            // in cell A1 
            if (coords.indexOf("A1") != -1)
            {
            	// debug print-string tests
                System.out.println("Has come here too...");
                
                // initialize cell
            	gridCell[0][0] = "o";

                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell A2
            else if (coords.indexOf("A2") != -1)
            {
            	// initialize cell
            	gridCell[0][1] = "o";

                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell A3
            else if (coords.indexOf("A3") != -1)
            {
            	// initialize cell
            	gridCell[0][2] = "o";

                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell A4
            else if (coords.indexOf("A4") != -1)
            {
            	// initialize cell
            	gridCell[0][3] = "o";

                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }
           
            // in cell A5
            else if (coords.indexOf("A5") != -1)
            {
            	// initialize cell
            	System.out.println("Yessssss! Got here too!");
            	gridCell[0][4] = "o";

                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell A6
            else if (coords.indexOf("A6") != -1)
            {
            	// initialize cell
            	gridCell[0][5] = "o";
            	

                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell A7
            else if (coords.indexOf("A7") != -1)
            {
            	// initialize cell
            	gridCell[0][6] = "o";
            	
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell A8
            else if (coords.indexOf("A8") != -1)
            {
            	// initialize cell
            	gridCell[0][7] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell A9
            else if (coords.indexOf("A9") != -1)
            {
            	// initialize cell
            	gridCell[0][8] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell A10
            else if (coords.indexOf("A10") != -1)
            {
            	// initialize cell
            	gridCell[0][9] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell B1
            else if (coords.indexOf("B1") != -1)
            {
            	// initialize cell
            	gridCell[1][0] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell B2
            else if (coords.indexOf("B2") != -1)
            {
            	// initialize cell
            	gridCell[1][1] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell B3
            else if (coords.indexOf("B3") != -1)
            {
            	// initialize cell
            	gridCell[1][2] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell B4
            else if (coords.indexOf("B4") != -1)
            {
            	// initialize cell
            	gridCell[1][3] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }
           
            // in cell B5
            else if (coords.indexOf("B5") != -1)
            {
            	// initialize cell
            	gridCell[1][4] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell B6
            else if (coords.indexOf("B6") != -1)
            {
            	// initialize cell
            	gridCell[1][5] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell B7
            else if (coords.indexOf("B7") != -1)
            {
            	// initialize cell
            	gridCell[1][6] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell B8
            else if (coords.indexOf("B8") != -1)
            {
            	// initialize cell
            	gridCell[1][7] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell B9
            else if (coords.indexOf("B9") != -1)
            {
            	// initialize cell
            	gridCell[1][8] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell B10
            else if (coords.indexOf("B10") != -1)
            {
            	// initialize cell
            	System.out.println("Whow, has truly got this far.");
            	gridCell[1][9] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }
            
            // in cell C1 
            else if (coords.indexOf("C1") != -1)
            {
            	// initialize cell
            	gridCell[2][0] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell C2
            else if (coords.indexOf("C2") != -1)
            {
            	// initialize cell
            	gridCell[2][1] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell C3
            else if (coords.indexOf("C3") != -1)
            {
            	// initialize cell
            	gridCell[2][2] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell C4
            else if (coords.indexOf("C4") != -1)
            {
            	// initialize cell
            	gridCell[2][3] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }
           
            // in cell C5
            else if (coords.indexOf("C5") != -1)
            {
            	// initialize cell
            	gridCell[2][4] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell C6
            else if (coords.indexOf("C6") != -1)
            {
            	// initialize cell
            	gridCell[2][5] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell C7
            else if (coords.indexOf("C7") != -1)
            {
            	// initialize cell
            	gridCell[2][6] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell C8
            else if (coords.indexOf("C8") != -1)
            {
            	// initialize cell
            	gridCell[2][7] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell C9
            else if (coords.indexOf("C9") != -1)
            {
            	// initialize cell
            	gridCell[2][8] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell C10
            else if (coords.indexOf("C10") != -1)
            {
            	// initialize cell
            	gridCell[2][9] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell D1
            else if (coords.indexOf("D1") != -1)
            {
            	// initialize cell
            	gridCell[3][0] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell D2
            else if (coords.indexOf("D2") != -1)
            {
            	// initialize cell
            	gridCell[3][1] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell D3
            else if (coords.indexOf("D3") != -1)
            {
            	// initialize cell
            	gridCell[3][2] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell D4
            else if (coords.indexOf("D4") != -1)
            {
            	// initialize cell
            	gridCell[3][3] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }
           
            // in cell D5
            else if (coords.indexOf("D5") != -1)
            {
            	// initialize cell
            	gridCell[3][4] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell D6
            else if (coords.indexOf("D6") != -1)
            {
            	// initialize cell
            	gridCell[3][5] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell D7
            else if (coords.indexOf("D7") != -1)
            {
            	// initialize cell
            	gridCell[3][6] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell D8
            else if (coords.indexOf("D8") != -1)
            {
            	// initialize cell
            	gridCell[3][7] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell D9
            else if (coords.indexOf("D9") != -1)
            {
            	// initialize cell
            	gridCell[3][8] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell D10
            else if (coords.indexOf("D10") != -1)
            {
            	// initialize cell
            	gridCell[3][9] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell E1
            else if (coords.indexOf("E1") != -1)
            {
            	// initialize cell
            	gridCell[4][0] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell E2
            else if (coords.indexOf("E2") != -1)
            {
            	// initialize cell
            	gridCell[4][1] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell E3
            else if (coords.indexOf("E3") != -1)
            {
            	// initialize cell
            	gridCell[4][2] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell E4
            else if (coords.indexOf("E4") != -1)
            {
            	// initialize cell
            	gridCell[4][3] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }
           
            // in cell E5
            else if (coords.indexOf("E5") != -1)
            {
            	// initialize cell
            	gridCell[4][4] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell E6
            else if (coords.indexOf("E6") != -1)
            {
            	// initialize cell
            	gridCell[4][5] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell E7
            else if (coords.indexOf("E7") != -1)
            {
            	// initialize cell
            	gridCell[4][6] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell E8
            else if (coords.indexOf("E8") != -1)
            {
            	// initialize cell
            	gridCell[4][7] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell E9
            else if (coords.indexOf("E9") != -1)
            {
            	// initialize cell
            	gridCell[4][8] = "o";
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell E10
            else if (coords.indexOf("E10") != -1)
            {
            	// initialize cell
            	gridCell[4][9] = "o"; 
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }
           
            // in cell F1 
            else if (coords.indexOf("F1") != -1)
            {
            	// initialize cell
            	gridCell[5][0] = "o"; 
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell F2
            else if (coords.indexOf("F2") != -1)
            {
            	// initialize cell
            	gridCell[5][1] = "o"; 
            	
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell F3
            else if (coords.indexOf("F3") != -1)
            {
            	// initialize cell
            	gridCell[5][2] = "o";  
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell F4
            else if (coords.indexOf("F4") != -1)
            {
            	// initialize cell
            	gridCell[5][3] = "o";  
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }
           
            // in cell F5
            else if (coords.indexOf("F5") != -1)
            {
            	// initialize cell
            	gridCell[5][4] = "o";  
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell F6
            else if (coords.indexOf("F6") != -1)
            {
            	// initialize cell
            	gridCell[5][5] = "o";  
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell F7
            else if (coords.indexOf("F7") != -1)
            {
            	// initialize cell
            	gridCell[5][6] = "o";  
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell F8
            else if (coords.indexOf("F8") != -1)
            {
            	// initialize cell
            	gridCell[5][7] = "o";  
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell F9
            else if (coords.indexOf("F9") != -1)
            {
            	// initialize cell
            	gridCell[5][8] = "o";  
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell F10
            else if (coords.indexOf("F10") != -1)
            {
            	// initialize cell
            	gridCell[5][9] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell G1
            else if (coords.indexOf("G1") != -1)
            {
            	// initialize cell
            	gridCell[6][0] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell G2
            else if (coords.indexOf("G2") != -1)
            {
            	// initialize cell
            	gridCell[6][1] = "o";  
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell G3
            else if (coords.indexOf("G3") != -1)
            {
            	// initialize cell
            	gridCell[6][2] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell G4
            else if (coords.indexOf("G4") != -1)
            {
            	// initialize cell
            	gridCell[6][3] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }
           
            // in cell G5
            else if (coords.indexOf("G5") != -1)
            {
            	// initialize cell
            	gridCell[6][4] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell G6
            else if (coords.indexOf("G6") != -1)
            {
            	// initialize cell
            	gridCell[6][5] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell G7
            else if (coords.indexOf("G7") != -1)
            {
            	// initialize cell
            	gridCell[6][6] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell G8
            else if (coords.indexOf("G8") != -1)
            {
            	// initialize cell
            	gridCell[6][7] = "o";  
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell G9
            else if (coords.indexOf("G9") != -1)
            {
            	// initialize cell
            	gridCell[6][8] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell G10
            else if (coords.indexOf("G10") != -1)
            {
            	// initialize cell
            	gridCell[6][9] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell H1
            else if (coords.indexOf("H1") != -1)
            {
            	// initialize cell
            	gridCell[7][0] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell H2
            else if (coords.indexOf("H2") != -1)
            {
            	// initialize cell
            	gridCell[7][1] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell H3
            else if (coords.indexOf("H3") != -1)
            {
            	// initialize cell
            	gridCell[7][2] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell H4
            else if (coords.indexOf("H4") != -1)
            {
            	// initialize cell
            	gridCell[7][3] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }
           
            // in cell H5
            else if (coords.indexOf("H5") != -1)
            {
            	// initialize cell
            	gridCell[7][4] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell H6
            else if (coords.indexOf("H6") != -1)
            {
            	// initialize cell
            	gridCell[7][5] = "o";  
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell H7
            else if (coords.indexOf("H7") != -1)
            {
            	// initialize cell
            	gridCell[7][6] = "o";  
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell H8
            else if (coords.indexOf("H8") != -1)
            {
            	// initialize cell
            	gridCell[7][7] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell H9
            else if (coords.indexOf("H9") != -1)
            {
            	// initialize cell
            	gridCell[7][8] = "o";  
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell H10
            else if (coords.indexOf("H10") != -1)
            {
            	// initialize cell
            	gridCell[7][9] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell I1
            else if (coords.indexOf("I1") != -1)
            {
            	// initialize cell
            	gridCell[8][0] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell I2
            else if (coords.indexOf("I2") != -1)
            {
            	// initialize cell
            	gridCell[8][1] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell I3
            else if (coords.indexOf("I3") != -1)
            {
            	// initialize cell
            	gridCell[8][2] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell I4
            else if (coords.indexOf("I4") != -1)
            {
            	// initialize cell
            	gridCell[8][3] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }
           
            // in cell I5
            else if (coords.indexOf("I5") != -1)
            {
            	// initialize cell
            	gridCell[8][4] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell I6
            else if (coords.indexOf("I6") != -1)
            {
            	// initialize cell
            	gridCell[8][5] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell I7
            else if (coords.indexOf("I7") != -1)
            {
            	// initialize cell
            	gridCell[8][6] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell I8
            else if (coords.indexOf("I8") != -1)
            {
            	// initialize cell
            	gridCell[8][7] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell I9
            else if (coords.indexOf("I9") != -1)
            {
            	// initialize cell
            	gridCell[8][8] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell I10
            else if (coords.indexOf("I10") != -1)
            {
            	// initialize cell
            	gridCell[8][9] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell J1
            else if (coords.indexOf("J1") != -1)
            {
            	// initialize cell
            	gridCell[9][0] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell J2
            else if (coords.indexOf("J2") != -1)
            {
            	// initialize cell
            	gridCell[9][1] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell J3
            else if (coords.indexOf("J3") != -1)
            {
            	// initialize cell
            	gridCell[9][2] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell J4
            else if (coords.indexOf("J4") != -1)
            {
            	// initialize cell
            	gridCell[9][3] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }
           
            // in cell J5
            else if (coords.indexOf("J5") != -1)
            {
            	// initialize cell
            	gridCell[9][4] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell J6
            else if (coords.indexOf("J6") != -1)
            {
            	// initialize cell
            	gridCell[9][5] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell J7
            else if (coords.indexOf("J7") != -1)
            {
            	// initialize cell
            	gridCell[9][6] = "o"; 
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell J8
            else if (coords.indexOf("J8") != -1)
            {
            	// initialize cell
            	gridCell[9][7] = "o";
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell J9
            else if (coords.indexOf("J9") != -1)
            {
            	// initialize cell
            	gridCell[9][8] = "o";
                
                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned
                numberOfShipsPositioned++;
            }

            // in cell J10
            else
            {
            	// initialize cell
            	gridCell[9][9] = "o";  

                // set torpedoBoatPositioned flag to true
                torpedoBoatPositioned = true;                    

                // record number of ships positioned		 
                numberOfShipsPositioned++;
            }
        }
}


public class PlaceScrDemo 
{
	public static void main(String[] args)
	{
		PlaceScr scr = new PlaceScr();
		scr.placeShips();
	}
    
}
