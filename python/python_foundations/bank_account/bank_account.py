class BankAccount:

    all_accounts = []

    def __init__( self, interest_rate, balance ):

        self.interest_rate = interest_rate
        self.balance = balance
        BankAccount.all_accounts.append(self)  #ninja bonus

        

    def yield_rate(self):
        yield_rate = self.interest_rate
        self.balance *= self.interest_rate
        return self

    def deposit(self, amount):
        self.balance += amount
        return self

    def withdraw(self, amount):
        fee = 5
        if self.balance < amount : 
            self.balance -= fee
            print("Insufficient funds: Charging a $5 fee.")

        else:
            self.balance -= amount
        return self


    def display_account_info(self):
        print( "Balance: $", self.balance)
        return self
    

account_one = BankAccount( 1.02 , 50 )
account_one.deposit(25).deposit(25).deposit(25).withdraw(126).yield_rate().display_account_info()

account_two = BankAccount( 1.02,  25 )
account_two.deposit(25).deposit(25).withdraw(18).withdraw(18).withdraw(18).withdraw(18).yield_rate().display_account_info()