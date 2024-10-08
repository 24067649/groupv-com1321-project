import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// Abstract class representing  generic expenses
abstract class Expense{ 
    double amount ; String description;

    
    public Expense(double amount, String description) {
        this.amount = amount; this.description = description;
        
    }  
    public double getAmount(){ 
        return amount;
    }
    public String getDescription(){
        return description;
    }
}

class FinancialPlanner {

    public static double calculateTax(double grossIncome, double taxRate) {
        return grossIncome * (taxRate / 100);
    }

    public static double calculateExpenses(List<Expense>expenses) {
        double totalExpenses = 0;
        for (Expense expense :expenses) {
            totalExpenses += expense.getAmount();
        }
        return totalExpenses;
    }

    public static double calculateHomeLoan( double purchasePrice, double downpayment, double loanInterest, int loanTerm) {
        double loanAmount = purchasePrice - downpayment;
        double monthlyInterestRate = loanInterest / 100 / 12;
        return (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -loanTerm));
    }

    public static double calculateVehicleLoan( String vehiclemodel ,double vehiclePrice, double vehicleDeposit, double vehicleInterest, int vehicleLoanTerm) {
        double loanAmount = vehiclePrice - vehicleDeposit;
        double monthlyInterestRate = vehicleInterest / 100 / 12;
        return (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -vehicleLoanTerm));
    
    }
    
    public static void main (String[]args){
        Scanner zee = new Scanner (System.in);
        
        System.out.println("Personal financial planning and financial advisory services");
        
        //Input of the Gross Monthly Income (GMI)
        System.out.print("Enter your gross monthly income:R");
        double grossIncome = zee.nextDouble();
        
        //Input of the income after tax deduction
        System.out.print("Enter your tax rate(in %):");
        double taxRate=zee.nextDouble();
        
        double tax=calculateTax (grossIncome,taxRate);
        double netIncome = grossIncome-tax;
         
    
// List to store various expenses
        List<Expense> expenses;
        expenses = new   ArrayList<>();

        // Input for various categories of expenses
        System.out.println("Enter your monthly recurring expenses");
        
        System.out.print("Enter cost of Groceries (R):");
        expenses.add(new Expense(zee.nextDouble(), "Groceries") {});

        System.out.print("Enter cost of Water and Lights (R):");
        expenses.add(new Expense(zee.nextDouble(), "Water and Lights") {});

        System.out.print("Enter cost of Travel (including petrol) (R):");
        expenses.add(new Expense(zee.nextDouble(), "Travel(including petrol)") {});

        System.out.print("Enter Cell Phone and Telephone cost (R):");
        expenses.add(new Expense(zee.nextDouble(), "Cell Phone and telephone") {});

        System.out.print("Enter the cost of other expenditures(R):");
        expenses.add(new Expense(zee.nextDouble(),"Other Expenditures") {});

double totalExpenses =calculateExpenses(expenses);

 
        //Rent or purchase property option 
        System.out.println("Do you plan to rent accomodation or purchase a property?(rent/purchase)");
        
       
        String accommodationChoice = zee.next();
        double accommodationExpense=0;
        
        if (accommodationChoice.equalsIgnoreCase("rent")) {
            System.out.print("Enter the monthly rent amount:(R)");
        accommodationExpense=zee.nextDouble();
        }  
            else if (accommodationChoice.equalsIgnoreCase("purchase")) {

                
                System.out.print("Enter the purchase price of the property(R):");
                double purchasePrice=zee.nextDouble();
                
                System.out.print ("Enter the down payment amount(R):");
                double downPayment=zee.nextDouble();
                
                System.out.print("Enter the interest rate (%) on the loan amount:");
                double loanInterest=zee.nextDouble();
                
                System.out.print("Enter term of loan(240-360 months):");
                int loanTerm=zee.nextInt();
                
            accommodationExpense = calculateHomeLoan(purchasePrice,downPayment,loanInterest,loanTerm);}
            
            else{
                    System.out.print("Enter either'rent' or 'purchase'");
                    }
               
                
            
        
        //Input of transportation
        System.out.println("Will you acquire a vehicle?(Yes/No)");
        
        String vehicleChoice=zee.next();
        double vehicleExpense = 0;
        
               
        if (vehicleChoice.equalsIgnoreCase("Yes")) {
            
            System.out.print("Enter vehicle model and make:");
            
            String vehiclemodel = zee.next();
            
        
        
            System.out.print("Enter the purchase price of the vehicle(R):");
            double vehiclePrice= zee.nextInt();
      
        System.out.print("Enter down payment for the vehicle(R):");
        double vehicleDeposit =zee.nextInt();
        
        System.out.print("Enter the interest rate (%) for the vehicle loan:");
        double vehicleInterest =zee.nextInt();
        
        System.out.print("Enter vehicle loan term (months):");
        int vehicleLoanterm=zee.nextInt();
        
        vehicleExpense = calculateVehicleLoan(vehiclemodel,vehiclePrice, vehicleDeposit, vehicleInterest, vehicleLoanterm);
        
                
        }
        
      totalExpenses += accommodationExpense + vehicleExpense;
       double remainingIncome = netIncome - totalExpenses;
       
       if (totalExpenses>0.75*netIncome)   {
           System.out.println("Please be advised, you are exceeding 75% of your income.Kindly examine your financial plan");
       
          //Sort and display expenses in descending order by value
          
          expenses.sort(Comparator.comparingDouble(Expense::getAmount).reversed());
          
          System.out.println("------Monthly reccuring expenses------");
          
          for (Expense expense : expenses) {
              System.out.printf("%s:R%.2f\n",expense.getDescription(),expense.getAmount());
          }
        
           System.out.printf("Review:\n-Total Income after tax (R):%.2f\n",netIncome);
               System.out.printf("Total monthly expenses(R): %.2f\n", totalExpenses);
        System.out.printf("Remaining monthly income(R): %.2f\n", remainingIncome);
        
        if (accommodationChoice.equalsIgnoreCase("purchase") && accommodationExpense>(grossIncome/3)); {
        System.out.println("Please be advised:Your home loan is more than one-third of your income.");
       }
        if(vehicleChoice.equalsIgnoreCase("yes") && vehicleExpense > (grossIncome /5)); {
        System.out.println("Please be advised:Your vehicle loan is more than one-fifth of your gross income.");
       }
        
        System.out.println("\nThank you for choosing us to manage your finances.We appreciate your trust in our program and hope it has helped you achieve your financial goals.");
        zee.close();
       }
        }
    }