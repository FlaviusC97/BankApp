Bank Application

Scenario: You are a backend developer and need to create an application to handle new customer bank account requests.

Your application should do the following:

-Read a .csv file of names, social security number, account type, and initial deposit.

-Use a proper data structure to hold all these accounts.

-Both savings and checking accounts share the following properties: deposit(), withdraw(), transfer(), showinfo()

-Savings Account holders are given Safety Deposit Box, identified by a 3-digit number and accessed with a 4-digit code

-Checking Account holders are assigned a Debit Card with a 12-digit number and 4-digit PIN.

-Both Accounts will use an interface that determines the base interest rate.

Savings accounts will use.25 points less than the base rate.
Checking accounts will use 15% of the base rate.

-The showinfo() method should reveal relevant account information as well as information specific to the Checking account or Savings account.
