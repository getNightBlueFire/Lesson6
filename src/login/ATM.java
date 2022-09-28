package login;

public class ATM {
    int cash20;
    int cash50;
    int cash100;

    public ATM(int cash20, int cash50, int cash100) {
        this.cash20 = cash20;
        this.cash50 = cash50;
        this.cash100 = cash100;
    }

    public void addCash(int cash20, int cash50, int cash100) {
        this.cash20 = this.cash20 + cash20;
        this.cash50 = this.cash50 + cash50;
        this.cash100 = this.cash100 + cash100;
    }

    public void addCash(int denomination, int countOfCash) {
        switch (denomination) {
            case 20: {
                this.cash20 = this.cash20 + countOfCash;
                break;
            }
            case 50: {
                this.cash50 = this.cash50 + countOfCash;
                break;
            }
            case 100: {
                this.cash100 = this.cash100 + countOfCash;
                break;
            }
        }
    }

    public void withdrawCash(int cash20, int cash50, int cash100) {
        this.cash20 = this.cash20 - cash20;
        this.cash50 = this.cash50 - cash50;
        this.cash100 = this.cash100 - cash100;
    }

    public void withdrawCash(int denomination, int countOfCash) {
        switch (denomination) {
            case 20: {
                this.cash20 = this.cash20 - countOfCash;
                break;
            }
            case 50: {
                this.cash50 = this.cash50 - countOfCash;
                break;
            }
            case 100: {
                this.cash100 = this.cash100 - countOfCash;
                break;
            }
        }
    }

    public void withdrawCash(int sumOfMoney) {
        if (sumOfMoney % 100 == 0 && cash100 > (sumOfMoney / 100)) {
            this.cash100 = this.cash100 - (sumOfMoney / 100);
        } else if (sumOfMoney % 100 == 0 && cash100 < (sumOfMoney / 100) && cash50 > (sumOfMoney / 50)) {
            this.cash50 = this.cash50 - (sumOfMoney / 50);
        } else if (sumOfMoney % 100 == 0 && cash100 < (sumOfMoney / 100) && cash50 < (sumOfMoney / 50) && cash20 > (sumOfMoney / 20)) {
            this.cash20 = this.cash50 - (sumOfMoney / 20);
        }
        if (sumOfMoney % 100 != 0 && sumOfMoney % 50 == 0 && cash50 > (sumOfMoney / 50)) {
            this.cash50 = this.cash50 - (sumOfMoney / 50);
        } else if (sumOfMoney % 100 != 0 && sumOfMoney % 50 == 0 && cash50 < (sumOfMoney / 50)) {
            System.out.println("There is not enough cash in the ATM!");
        }
        if (sumOfMoney % 100 != 0 && sumOfMoney % 50 != 0 && sumOfMoney % 20 == 0 && cash20 > (sumOfMoney / 20)) {
            this.cash20 = this.cash20 - (sumOfMoney / 20);
        } else if (sumOfMoney % 100 != 0 && sumOfMoney % 50 != 0 && sumOfMoney % 20 == 0 && cash20 < (sumOfMoney / 20)) {
            System.out.println("There is not enough cash in the ATM!");
        }
        if (sumOfMoney % 100 != 0 && sumOfMoney % 50 != 0 && sumOfMoney % 20 != 0) {
            System.out.println("There are only 20, 50 and 100 in the ATM!");
        }
    }

    public int countAmountOfCash() {
        int amountOfCash = 20 * cash20 + 50 * cash50 + 100 * cash100;
        return amountOfCash;
    }

    public void showInfoAboutCash() {
        System.out.println("Count of cash20: " + cash20 + ";\nCount of cash50: " + cash50 + ";\nCount of cash100: " + cash100 + ";");
    }



}
