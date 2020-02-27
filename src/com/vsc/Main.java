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