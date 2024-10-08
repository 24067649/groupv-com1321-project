ReadMe file

Program Start:

The application starts in the main method of the Financial class.
The first step is to create a Scanner object to handle user input from the console.

User Input for Gross Monthly Income(GMI):
The user is prompted to enter their gross monthly income. This value is stored in the grossIncome variable.

Tax Input:
Next, the user is asked to enter the monthly tax rate, which will be the money deducted from the gross monthly income this is therefore the income after tax deduction.This value is stored for calculations at a later stage.

Monthly Expenditures Input:
The user is prompted to enter their estimated monthly expenditures across various categories:

Groceries
Water and lights
Travel (including petrol)
Cell phone and telephone
Other expenses

Each input is stored in separate variables in an array list and can be added together later to determine total amount of the expenditures.


Accommodation Choice :
The user is asked whether they would like to rent accommodation or purchase a property.
If the user chooses to rent accommodation, they are therefore prompted to enter the monthly rent amount. This is added to the list of expenses.
If they choose to purchase a property, they are prompted to enter:
Purchase price of the property(R)
Total down payment
Interest rate (percentage)
Number of months to repay the loan (between 240 and 360 months)
A HomeLoan object is created using the entered data, which calculates the monthly repayment amount using a method inside the HomeLoan class.


Loan Approval:
If the calculated monthly repayment for the home loan exceeds one-third of the user's gross income, a warning message is displayed, indicating that loan approval is unlikely and that they should reconsider their accommodation choice.

Vehicle Choice:
The user is then asked if they wish to buy a vehicle. If they respond with "yes", they are prompted to enter:
Vehicle purchase price
Total down payment
Interest rate (percentage)
The time it will take to repay the loan (from 60 months)
A VehicleLoan object is created, the loan repayment costs are added to the expenses list.


Calculate the monthly that is left over after expenses have been deducted:
The program calculates the available monthly money by subtracting total expenses (including tax and loan repayments) from the gross monthly income.
This value is displayed to the user.


Warning for expenses if they exceed the limit:
If the total expenses (including loan repayments) exceed 75% of the gross income, the user receives a warning about their spending and they are asked to review their expenses.
Display Expenses:

The program sorts all recorded expenses in descending order based on their amount and prints them to the console, allowing the user to see how their money is deducted.


Steps of how the program is executed:
This is the step by step example of how the program is executed

Initialization: The program initializes necessary variables and collections to hold user input data.
Input Handling: It uses an if else loop that prompts the storing of user input, incorrect data is validated.
Calculations: It calculates loan repayments and available money based on user inputs.
Conditional Logic: It uses conditions to provide warnings based on the user's financial data (e.g., loan approval and expenditure limit).
Output: After analyses, it displays results and the arranged expenses to the user.

Example in words:

User inputs a gross monthly income of 15000
The tax rate (percentage) is 4.5%
Monthly expenditures:
Groceries: 2500
Water and lights: 850
Travel costs: 1200
Cell phone and telephone: 650
Other expenses: 2000
User chooses to rent and inputs a rental amount of 1200.
User is asked about buying a vehicle and inputs vehicle details, this leads to a vehicle loan being added to the expenses.
The application calculates total expenses, leftover money, and checks for conditions like home loan approval and total expenses exceeding 75% of the income.
All expenses are displayed in descending order, allowing the user to review their financial situation effectively.
Conclusion
This application provides a clear structure for managing personal finances, allowing users to review their income and expenses. It encourages better financial advisory and it displays the insights of the budget strains, such as loan repayments.

Example the format of the same input as Example 1 :

Enter the gross monthly income(R): 15000
Enter the tax rate(%): 4.5
Enter the cost of Groceries(R): 2500
Enter the cost of Water and lights(R): 850
Enter cost of Travel(including petrol)(R): 1200
Enter Cell phone and telephone cost(R): 650
Enter the cost of other expenditures(R): 2000
Do you plan to rent accommodation or purchase a property?(rent/purchase): rent
Enter monthly rent amount(R): 1200
Do you want to buy a vehicle? (yes/no): yes
Enter the vehicle make and model :Polo Vivo 1.4
Enter the vehicle purchase price(R): 55000
Enter the total deposit for vehicle(R): 18000
Enter the vehicle interest rate (%): 5
Enter the loan term (months): 60

----Monthly Expenses Breakdown-----
Groceries :R2500
Other expenditures:2000
Travel (including petrol):1200
Water and lights:850
Cell phone and telephone :650

-----Review-----
Total income after tax(R):14325
Total monthly expenses(R):7200
Remaining monthly income(R):7125

Thank you for choosing our financial advice.
