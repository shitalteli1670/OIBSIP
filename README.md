Online Reservation System
This is a simple Online Reservation System built using Java Swing for GUI, designed to handle basic operations like ticket booking, cancellation, and user login.

Features
Ticket Booking: Users can book train tickets by entering details like Train Number, Train Name, From, and To. Once booked, a PNR number is generated and displayed to the user.
Ticket Cancellation: Users can cancel booked tickets by entering the PNR number. If the ticket is found, it will be canceled.
Login: A basic login system with hardcoded credentials (admin / 12345) to access the booking and cancellation features.
PNR Generation: The system generates a random PNR for every ticket booked.
Code Overview
1. BookingPanel.java
This class is responsible for the ticket booking functionality. It provides a form where users can input train details and book a ticket. The booking information is stored in a list, and a unique PNR is generated for each booking.

2. CancellationPanel.java
This class handles ticket cancellations. Users can input a PNR number to cancel a previously booked ticket. If the PNR exists, the corresponding ticket is removed from the booking list.

3. LoginPanel.java
This class represents the login functionality. Users must log in with the credentials admin and 12345 to access the booking and cancellation features.

4. Ticket.java
This is the model class representing a ticket. It holds information about the PNR number, train number, train name, and source and destination locations.

How to Run
Clone the repository:
bash
Copy code
git clone https://github.com/your-username/online-reservation-system.git
Navigate to the project directory:
bash
Copy code
cd online-reservation-system
Compile the Java files:
bash
Copy code
javac *.java
Run the application:
For Booking Panel:
bash
Copy code
java BookingPanel
For Cancellation Panel:
bash
Copy code
java CancellationPanel
For Login Panel:
bash
Copy code
java LoginPanel
Requirements
Java 8 or higher is required to run this project.
Future Enhancements
Implement database integration for storing ticket information.
Add a user registration and login system with dynamic credentials.
Add more train details and validation for user input.
