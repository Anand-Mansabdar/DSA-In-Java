public class Account {

   int balance;
   public Account(int balance){
     this.balance=balance;


  }
  public void deposit(int balance){
    int currentbalance=1000;
    currentbalance+=balance;
    System.out.println("the balance is "+currentbalance);
    
  }
  // public void display(){
    //   System.out.println("the balance is "+balance);
    
    
    // }
    
    public static void main(String[] args) {
      // int balance=500;
      Account sc=new Account(500);
    sc.deposit(500);


    }

  }  

