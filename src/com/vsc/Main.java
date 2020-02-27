package com.vsc;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean MainMenu = true;
    public static boolean SubMenu = true;


    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Hotel.Room[] myHotel = new Hotel.Room[10];
        myHotel[0] = new Hotel.Room();
        myHotel[1] = new Hotel.Room();
        myHotel[2] = new Hotel.Room();
        myHotel[3] = new Hotel.Room();
        myHotel[4] = new Hotel.Room();
        myHotel[5] = new Hotel.Room();
        myHotel[6] = new Hotel.Room();
        myHotel[7] = new Hotel.Room();
        myHotel[8] = new Hotel.Room();
        myHotel[9] = new Hotel.Room();

        int roomNum = 0;
        initialise(myHotel);
        while (MainMenu) {
            while (SubMenu) {

                System.out.println("^^^^^^^^^^^^^╬ Marriott Hotel London ╬^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("Hello and Welcome to our Hotel Program\nThank you very much for choosing us!");
                System.out.println("☺☺☺☺☺☺☺☺☺ ☺☺☺☺☺☺☺☺☺ ☺☺☺☺☺☺☺☺ ☺☺☺☺☺☺☺ ☺☺☺☺☺☺☺☺☺ ☺☺☺☺☺☺ ☺☺☺☺☺☺☺☺☺☺☺");
                System.out.println("Please select one of the options:");
                System.out.println("A: Please Make Your Reservation!.");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("B: List of Available Rooms.");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("C: Information for all Rooms.");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("D: Deregistering a Client from a Room.");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("E: Find room from customer name.");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("F: View rooms Ordered alphabetically by name.");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("♥♠♣♥☺♠♥☺♥♠♣♥☺♠♥☺♥♠♣♥☺♠♥☺♥♠♣♥☺♠♥☺♥♠♣♥☺♠♥☺♥♠♣♥☺♠♥☺");
                System.out.println("================================================");
                System.out.println("Please insert your option here:");
                String Selection = input.next();
                Selection = Selection.toUpperCase();
                switch (Selection) {
                    case "A":
                        BookARoom(myHotel, roomNum);
                        break;
                    case "B":
                        CheckIfEmpty(myHotel);
                        break;
                    case "C":
                        ViewAllRooms(myHotel);
                        break;
                    case "D":
                        DeleteCustomerFromRoom(myHotel, roomNum);
                        break;
                    case "E":
                        FindRoomFromCustomerName(myHotel);
                        break;
                    case "F":
                        ViewRoomsOrderedAlphabeticallyByName(myHotel);
                        break;
                    default:
                        System.out.println("Invalid Selection");
                        break;
                }
                System.out.println("================================================");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("Would you like to Select another Option\n1 ) Yes\n2 ) No");
                System.out.println("˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅˅");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("Please put your option below:");
                if (input.nextInt() == 1) {
                    SubMenu = true;
                } else {
                    SubMenu = false;
                }
            }
            SubMenu = true;
            System.out.println("ᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥ");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("Would You Like To Continue With The Program\n1 ) Yes\n2 ) No");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("ᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥᴥ");
            System.out.println("Please put your option below:");
            if (input.nextInt() == 1) {
                MainMenu = true;
            } else {
                System.out.println("Thanks for registration!");
                System.exit(0);

            }
        }

    }


    public static String getString() {
        return "wi-f";
    }

    public static String getS() {
        return "wi-fi";
    }

    public static void initialise(Room[] myHotel) {
        for (int x = 0; x < myHotel.length; x++) {
            myHotel[x].setName("Nobody");
        }
    }

    public static void CheckIfEmpty(Room[] myHotel) {
        for (int x = 0; x < myHotel.length; x++) {
            if (myHotel[x].getName().equals("Nobody")) {
                System.out.println("Room " + (x + 1) + " is Empty");
            }
        }
    }

    public static void BookARoom(Room[] myHotel, int roomNum) {
        String roomName;
        int days;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter room number (1-10):");
        roomNum = input.nextInt() - 1;
        System.out.println("Enter name for room " + (roomNum + 1) + " :");
        roomName = input.next();
        System.out.println("Amount persons?:");
        int persons = input.nextInt();
        System.out.println("How many days is the reservation?:");
        days = input.nextInt();
        System.out.println("Breakfast included or without?: ");
        int meals = input.nextInt();

        int twinRooms = persons / 2 + persons % 2;
        System.out.println("Double rooms: " + twinRooms);

        int priceForStay = days * (twinRooms * 9500);
        System.out.println("Price for staying: " + priceForStay / 100 + "€");
        myHotel[roomNum].setName(roomName);

    }

    public static void ViewAllRooms(Room[] myHotel) {
        for (int x = 0; x < myHotel.length; x++) {
            System.out.println("Room " + (x + 1) + " Occupied by " + myHotel[x].getName());

        }
    }

    public static void DeleteCustomerFromRoom(Room[] myHotel, int roomNum) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter room number to delete(1-10):");
        roomNum = input.nextInt() - 1;
        myHotel[roomNum].setName("Nobody");
        System.out.println("Entery Deleted :)");
    }

    private static void FindRoomFromCustomerName(Room[] myHotel) {
        Scanner input = new Scanner(System.in);
        String roomName;
        System.out.println("Enter name to Search for:");
        roomName = input.next();
        int x;
        boolean Checker = false;
        for (x = 0; x < myHotel.length; x++) {
            if (roomName.equals(myHotel[x].getName())) {
                System.out.println("The Account That Matches That name is Account number " + (x + 1));
                Checker = true;
            }
        }
        if (Checker == false) {
            System.out.println("There are no Rooms Booked with that name\n(make sure you've used the correct CAP's)");
        }
    }

    public static void ViewRoomsOrderedAlphabeticallyByName(Room[] myHotel) {
        String[] myStrArray = new String[myHotel.length];
        for (int i = 0; i < myHotel.length; i++) {
            myStrArray[i] = myHotel[1].getName();
        }

        Arrays.sort(myStrArray);
        for (int a = 0; a < myStrArray.length; a++) {
            System.out.println(myStrArray[a]);
        }



    }