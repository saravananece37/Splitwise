
S
Expense sharing application

Saravanan
Question Description

Create an expense-sharing application.

An expense sharing application is where you can add your expenses and split them among different people. The app keeps balances between people as in who owes how much to whom.

Example:

You live with 3 other friends.

You: User1 (id: u1)

Flatmates: User2 (u2), User3 (u3), User4 (u4)

 

This month's electricity bill was Rs. 1000.

Now you can just go to the app and add that you paid 1000,

select all 4 people and then select split equally.

Input: u1 1000 4 u1 u2 u3 u4 EQUAL

 

For this transaction, everyone owes 250 to User1.

The app should update the balances in each of the profiles accordingly.

 

User2 owes User1: 250 (0+250)

User3 owes User1: 250 (0+250)

User4 owes User1: 250 (0+250)

 

---

 

Now, It is the Meesho sale and there is an offer on your card.

You buy a few things for User2 and User3 as they asked you to.

The total amount for each person is different.

Input: u1 1250 2 u2 u3 EXACT 370 880

 

For this transaction, User2 owes 370 to User1 and User3 owes 880 to User1.

 

The app should update the balances in each of the profiles accordingly.

User2 owes User1: 620 (250+370)

User3 owes User1: 1130 (250+880)

User4 owes User1: 250 (250+0)

 

---

 

Now, you go out with your flatmates and take your brother/sister along with you.

User4 pays and everyone splits equally. You owe for 2 people.

Input: u4 1200 4 u1 u2 u3 u4 PERCENT 40 20 20 20

 

For this transaction, User1 owes 480 to User4, User2 owes 240 to User4 and User3 owes 240 to User4.

 

The app should update the balances in each of the profiles accordingly.

User1 owes User4: 230 (250-480)

User2 owes User1: 620 (620+0)

User2 owes User4: 240 (0+240)

User3 owes User1: 1130 (1130+0)

User3 owes User4: 240 (0+240)

 

Requirements:

Add users

Add expenses and be able to split them among users.

The expense could either be EQUAL, PERCENT, or EXACT AMOUNT.

 

Methods to be implemented:

addUser()

addExpense()

showBalances()

showBalancesForUser()

1234567891011121314151617202118192223242526
}





/// user -> UserId, Username, OweBalance < User, Balance>




Line: 14 Col: 1
Java 8
Input
Output

Run Code
Chat Window


