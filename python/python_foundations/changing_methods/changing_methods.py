# ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Assignment: Changing Methods
# For this assignment, Update your previous assignment called "User" so that each instance's methods are chained.
# ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

class User:

    def __init__( self,bank_name, first_name, last_name, balance ):

        self.bank_name = bank_name
        self.first_name = first_name
        self.last_name = last_name
        self.balance = balance 
        
    def display_user_balance(self):
        print( self.bank_name )
        print( "First Name: ", self.first_name )
        print( "Last Name: ", self.last_name )
        print( "Balance: $", self.balance )
        print( "\n" "Account Updates Below: " )


    def make_deposit(self, deposit_amount):
        self.balance += deposit_amount
        print(f"Give the dog a bone! You've received a deposit of ${deposit_amount} and your balance is now ${self.balance}!")  
        return self


    def make_withdrawal(self, amount):
        self.balance -= amount
        print(f"Withdrawn from account ${amount}. Current balance is now ${self.balance}")  
        return self



    def make_transfer(self, transfer_amount, first_name, last_name ):
        self.balance -= transfer_amount
        print(f"Transferring ${transfer_amount} to {first_name} {last_name}. Current balance is now ${self.balance}.")
        return self



melissa = User( "Flying Circus Bank", "Melissa", "Curylo", 200 ) 
melissa.display_user_balance()
melissa.make_deposit(300).make_deposit(42).make_deposit(42).make_deposit(42).make_withdrawal(42).make_transfer(42, "John", "Cleesey")
print("\n")



john = User( "Gumby Paradigm Bank", "John", "Cleesey", 400)
john.display_user_balance()
john.make_deposit(342).make_deposit(42).make_deposit(42).make_withdrawal(42).make_withdrawal(42).make_transfer(42, "Melissa", "Curylo")
print("\n")


eric = User( "Queens Bank", "Eric", "Idol", 700)
eric.display_user_balance()
eric.make_deposit(42).make_withdrawal(42).make_withdrawal(42).make_withdrawal(42).make_transfer(42, "John", "Cleesey")
print("\n")


