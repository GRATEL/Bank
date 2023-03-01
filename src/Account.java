public class Account {

        private String Number;
        private String Name;
        private String gmail;

        private String PhoneNumber;
        private double Balance;


        public Account (String number, String name, String email, String phoneNumber, double balance){
                this.Number = number;
                this.Name = name;
                this.gmail = email;
                this.PhoneNumber = phoneNumber;
                this.Balance = balance;

        }
        public void Deposit(double MoneyInserted){
                this.Balance=+MoneyInserted;
                System.out.println("Money deposited is" + MoneyInserted );
                System.out.println("Your Balance is" + this.Balance);
        }
        public void Withdraw(int withdrawal){
                if (this.Balance>withdrawal){
                        this.Balance=-withdrawal;
                        System.out.println("Withdrawal Successful");

                }else {
                        System.out.println("Withdrawal Unsuccessful" + this.Balance +"is remaining");
                }

        }
        public String getNumber() {
                return Number;
        }

        public void setNumber(String number) {
                Number = number;
        }

        public String getName() {
                return Name;
        }

        public void setName(String name) {
                Name = name;
        }

        public String getGmail() {
                return gmail;
        }

        public void setGmail(String gmail) {
                this.gmail = gmail;
        }

        public String getPhoneNumber() {
                return PhoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
                PhoneNumber = PhoneNumber;
        }

        public double getBalance() {
                return Balance;
        }

        public void setBalance(double balance) {
                Balance = balance;
        }
}
