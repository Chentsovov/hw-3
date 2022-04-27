public class ATM {
    public int countBanknotes(int sum){


    int res = 0;
    int count = 0;
                while ((sum ) >= 500) { res++; sum = sum - 500;}
                while ((sum ) >= 200) { res++; sum = sum - 200; }
                while ((sum ) >= 100) { res++; sum = sum - 100;}
                while ((sum ) >= 50) { res++; sum = sum - 50; }
                while ((sum ) >= 20) { res++; sum = sum - 20; }
                while ((sum ) >= 10) { res++; sum = sum - 10; }
                while ((sum ) >= 5) { res++; sum = sum - 5; }
                while ((sum ) >= 2) { res++; sum = sum - 2; }
                while ((sum ) >= 1) { res++; sum = sum - 1; }
                return res;
}


    public static void main(String[] args) {
        ATM sum = new ATM();
        System.out.println(sum.countBanknotes(547));
    }
}
