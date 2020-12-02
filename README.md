# Master Repository for CS445 Group N
## Redhawk Ride Application Project
 - This project is about creating a usable CLI application
that will allow students on campus to participate either
as a passenger or rider.
 - There will be two main classes for the software: rider and
passenger.

## Detailed Description
Taking a Ride
Students can sign up for RedhawkRide by typing their student id and bank account details into the app. 
Only students can use the service, so their student id is verified to be valid by checking it against a list of all student ids, which is provided by a file. 
Once the student id is verified and determined to be not already in use, a new account is created. The bank info collected is a bank routing and account number.
A student can make themselves available to give rides by clicking a “start driving” button. Once they’re available, the app periodically sends their updated location (as a latitude/longitude pair) to the central system.
Rides are dispatched to the driver as they become available. 
The student can finish their driving shift by clicking a “stop driving” button.
To take a ride on RedhawkRide, a rider enters the beginning and final locations of their trip in the app.
The central system then calculates an estimated price for the trip and sends that back to the app. 
The rider then looks at the price in their app and if they decide that they’re willing to pay, they click “request ride”. 
The central system receives this request and assigns it to the nearest driver (if there are no drivers driving at that moment,
a message is shown to the rider that no drivers are available at this time). 
The assigned driver’s app shows them the name of their new rider and the start/end locations of the ride. 
The driver proceeds to drive to the rider to pick them up. The rider’s app displays the name of their
driver and their updated location as they drive. Once the driver arrives at the rider’s start location, the rider gets in their car. 
The driver clicks the “start ride” button and drives to the final location. When they arrive, the driver clicks the “finish ride” button.
The central system calculates the final cost of the ride and displays it in the passenger’s app. The passenger exits the car, happy to be at their destination.
Once the ride enters a terminal state (failed because no drivers were available or successfully completed), 
all of the details of the ride (that were available) will have been collected and saved:

### Ride request info

- User_id of requestor

- Request time

- Start location

- End location

- Estimated price

### Driver info

- ser_id of driver

### Ride info

- “Start ride” time and location

- “End ride” time and location

- Final cost

A user can access their ride history, which shows them all of the above info for each ride they’ve taken except for user_id numbers. 
In place of the user_id for a ride, the driver’s name is shown.

Ride pricing

The final price of a ride is calculated using the formula 𝑃=0.25×𝑡+0.50×𝑑

Where P is the price in dollars, t is the duration of the ride in minutes,
and d is the distance between start and end locations in miles (the actual path of the ride route is ignored – only the straight-line distance is used).

The price is estimated for the rider before they request a ride. 
Since the exact duration of the ride isn’t known yet, 
it is estimated by assuming that the ride will travel an average of 20 MPH and approximating the route as a straight line between start and end locations. 
These assumptions give the formula for price estimation: 𝑃𝑒𝑠𝑡𝑖𝑚𝑎𝑡𝑒=1.25×𝑑

Processing transactions
Each week, the transactions of that week are processed. For each user, their net bill is calculated by:
- Summing the cost of all rides taken
- Summing the prices of all rides provided (drivers are paid the full price of a ride)

The net amount is deposited to/withdrawn from the user’s bank account by writing the desired transaction to a text file. 
The file is in CSV format, with each line having the schema:
{bank routing number}, {bank account number}, {“deposit” or “withdraw”}, {amount}
## Some example entries in the CSV file might look like:
 - 123456,1212121,”deposit”,100.01
 - 123456,2323232,”withdraw”,97.98
In the first line, $100.01 is deposited into the account listed (that student made money by driving). 
In the second line, $97.98 is withdrawn from the account listed (that student took rides and owes money).

## Scope
Your team has been tasked with developing the central system of RedhawkRide as a proof of concept (PoC). 
Before the mobile app will be developed, your PoC will first be evaluated. 
As part of the PoC, your team will create a basic text and keyboard-based UI to interact with the system in place of the mobile app. The UI should allow you to:
- Register a new user

### (As a rider)
- Provide a start/end location and receive a price estimation for the ride
- Request a ride
- View ride history

### (As a driver)
- Start driving/stop driving

- Start ride/finish ride

- Update locatio
