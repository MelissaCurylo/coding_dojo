class BankAccount:

    def __init__( self, interest_rate, balance ):

        self.interest_rate = interest_rate
        self.balance = balance

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


class User():
    
    def __init__(self, first_name, last_name, checking_start_bal, savings_start_bal, certificate_start_bal):   
       
        self.account = {
            "checking account": BankAccount( 1.02, balance = checking_start_bal ),
            "saving account": BankAccount( 1.02, balance = savings_start_bal ),
            "certificate deposit": BankAccount( 1.25, balance = certificate_start_bal )
        }
        self.first_name = first_name
        self.last_name = last_name


    def display_account_info(self):
        print(f"First name: {self.first_name} Last Name: {self.last_name}")
        print( "Checking Balance: $", self.account["checking account"].balance)
        print( "Saving Balance: $", self.account["saving account"].balance)
        print( "Certificate Deposit Account: $",self.account["certificate deposit"].balance)
        return self
    
    def cody_adams(self):
        from time import sleep
        sleep(1)
        print(f"Cody, You are a genius!")
        sleep(1)
        print(f"Thank you for all YOUR help!")



# melissa = User( "Melissa", "Curylo", 100, 50, 2000) 
# melissa.account["checking account"].deposit(15)
# melissa.account["saving account"].deposit(25)
# melissa.account["certificate deposit"].deposit(5000)
# melissa.display_account_info()



cody = User( "Cody", "Adams", 0, 0, 0)
cody.account["checking account"].deposit(42)
cody.account["saving account"].deposit(42)
cody.account["certificate deposit"].deposit(4200000000)
cody.display_account_info()
print( f"\n" )
cody.cody_adams()