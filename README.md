# Thread synchronization assignment

##How to run code?
To run the code you right click the main class an press run.

##What we observed
When we wrote the code as instructed all the users were told that there were the same amount of tickets even though some of them had been bought. 
The data was not updated as the threads were running simultaniously. To fix the problem the run method had to be changed from public to synchronized.
