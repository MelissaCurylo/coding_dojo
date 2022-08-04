# ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Assignment: User
# For this assignment, we'll add some functionality to the User class: 
# make_withdrawal(self, amount) - have this method decrease the user's balance by the amount specified 
# display_user_balance(self) - have this method print the user's name and account balance to the terminal
    # eg. "User: Guido van Rossum, Balance: $150
# BONUS: transfer_money(self, other_user, amount) - have this method decrease the user's balance by the amount and add that amount to other other_user's balance
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


    def make_withdrawal(self, amount):
        self.balance -= amount
        print(f"Withdrawn from account ${amount}. Current balance is now ${self.balance}")  



    def make_transfer(self, transfer_amount, first_name, last_name ):
        self.balance -= transfer_amount
        print(f"Transferring ${transfer_amount} to {first_name} {last_name}. Current balance is now ${self.balance}.")



melissa = User( "Flying Circus Bank", "Melissa", "Curylo", 200 ) 
melissa.display_user_balance()
melissa.make_deposit(300)
melissa.make_deposit(42)
melissa.make_deposit(42)
melissa.make_withdrawal(42)
melissa.make_transfer(42, "John", "Cleesey")
print("\n")



john = User( "Gumby Paradigm Bank", "John", "Cleesey", 400)
john.display_user_balance()
john.make_deposit(342)
john.make_deposit(42)
john.make_deposit(42)
john.make_withdrawal(42)
john.make_withdrawal(42)
john.make_transfer(42, "Melissa", "Curylo")
print("\n")


eric = User( "Queens Bank", "Eric", "Idol", 700)
eric.display_user_balance()
eric.make_deposit(42)
eric.make_withdrawal(42)
eric.make_withdrawal(42)
eric.make_withdrawal(42)
eric.make_transfer(42, "John", "Cleesey")
print("\n")


