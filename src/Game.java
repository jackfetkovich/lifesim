public class Game {
    private Person player;
    private boolean over;

    public Game(){
        this.player = new Person();
        this.over = false;
    }

    public Person getPlayer(){
        return this.player;
    }

    public boolean isOver(){
        return this.over;
    }

    public String getStartingInfo(){
        return new StringBuilder().append("Your name is ").append(this.player.getName()).append(" and you are a ").append(this.player.getGender() == Gender.MALE ? "boy" : "girl").toString();
    }

    public void displayState(){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.printf("Age: %d\n", this.player.getAge());
        System.out.printf("Balance: $%d\n", this.player.getAccountBalance());
        System.out.printf("Profession: %s\n", this.player.getJob());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
    }

    public void advance(){
        this.player.setAge(this.player.getAge() + 1);
        this.player.setAccountBalance(this.player.getAccountBalance() + this.player.getSalary());
        this.displayState();
    }

}
