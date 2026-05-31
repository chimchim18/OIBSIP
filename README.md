# Online Reservation System ✨

This is a simple, command-line Java program that simulates how a train booking and cancellation system works. It uses core Java concepts to manage user logins, ticket bookings, and ticket cancellations.

## -What This Project Does

The application has three main sections:

1. **Login Screen**: Protects the system. Users must enter a valid username and password to get into the main menu.
2. **Booking Form (Reservation)**: Lets you book a ticket:
   - When you type in a train number, the system automatically finds and displays the name of the train for you.
   - You type `INSERT` to save the ticket to the system.
   - The system automatically creates a unique 5-digit PNR number for your ticket.
3. **Cancellation Form**: Lets you cancel a ticket:
   -You type in your PNR number, and the system shows you all the details of that ticket.
   -You type `OK` to confirm, and the system deletes the ticket.

## Valid Login Details for Testing

To log in and test the system, you can use either of these accounts:

| Authorized Login ID | System Password | Clearance Level |
| :--- | :--- | :--- |
| `admin` | `infobyte` | Root Administrator |
| `Chimnaz` | `trainpass` | Desk Operator |

## Java Concepts Used

- **Classes and Objects**: Separate models are made for a `User`, a `Train`, and a `Ticket`.
- **HashMaps (Simulated Database)**: Instead of a real database, the program uses Java HashMaps to temporarily store and look up users, trains, and booked tickets.
- **Input Error Handling**: If you accidentally type letters when the program asks for a number, the program will not crash. It will just ask you to try again.

## Step-by-Step Local Execution Guide

### 1. Environment Clone
Clone the repository containing the source files to your local terminal environment:

### 2. Compilation



📊 Sample Interactive Output Stream
Plaintext

=== WELCOME TO THE ONLINE RESERVATION SYSTEM ===

--- LOGIN FORM ---
Enter Login ID: admin
Enter Password: password123
Login Successful! Welcome, admin.

--- MAIN MENU ---
1. Book a Ticket (Reservation Form)
2. Cancel a Ticket (Cancellation Form)
3. Exit
Choose an option (1-3): 1

--- RESERVATION FORM ---
Enter Passenger Full Name: Jane Doe
Enter Train Number: 12345
[Auto-Fill] Train Name found: Express Bullet
Enter Class Type (e.g., Economy, First): First Class
Enter Date of Journey (DD/MM/YYYY): 25/08/2026
Enter From (Departure Place): New York
Enter Destination Place: Boston

Press 'INSERT' to save your details to the database.
Type 'INSERT' to confirm: INSERT

Reservation Successful! Your PNR is: PNR54921
