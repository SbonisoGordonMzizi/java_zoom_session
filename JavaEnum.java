//learning enumaration

enum CoffeeSize{
    SMALL(5),BIG(8),HUGE(10);
    CoffeeSize(int size){
        this.size = size;
    }
    private int size;
    public int getSize(){
	    return size;
    }
};

class Coffee{
    CoffeeSize size;

    public static void main(String[] args){
        Coffee drink1 = new Coffee();
        Coffee drink2 = new Coffee();
        Coffee drink3 = new Coffee();
	drink1.size = CoffeeSize.SMALL;
	drink2.size = CoffeeSize.BIG;
	drink3.size = CoffeeSize.HUGE;
	System.out.println("SMALL : "+drink1.size.getSize());
        System.out.println("BIG : "+drink2.size.getSize());
	System.out.println("HUGE : "+drink3.size.getSize());
    }
}	
