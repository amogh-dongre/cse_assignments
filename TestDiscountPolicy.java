abstract class DiscountPolicy{
	abstract int calculateDiscount(int count , int cost);
}
class BulkDiscount extends DiscountPolicy{
	int min;
	int percent;
	BulkDiscount(int min , int percent){
		this.min = min;
		this.percent = percent;
	}
	int calculateDiscount(int count , int cost){
		int price = count * cost;
		if(count > min){
			price = price - (price * percent)/100;
			return price;
		}
		else{
			price = price;
			return price;
		}
	}
}
class BulkNItemsGetOneFree extends DiscountPolicy{
	int n;
	BulkNItemsGetOneFree(int n){
		this.n = n;
	}
	int calculateDiscount(int count , int cost){
		count = n;
		int price = (n-1) * cost;
		return price;
	}
}
class CombinedDiscount extends DiscountPolicy{
	BulkDiscount bd1;
	BulkNItemsGetOneFree bn1;
	CombinedDiscount(BulkDiscount bd1 , BulkNItemsGetOneFree bn1){
		this.bd1 = bd1;
		this.bn1 = bn1;
	}
	int calculateDiscount(int count , int cost){
		int x = bd1.calculateDiscount(20,1000);//(count,cost)
		int y = bn1.calculateDiscount(10,400);//(count,cost)
		if(x > y)
			return x;
		else
			return y;
	}
}
class DiscountPolicyTester{
	public static void main(String args[]){
		BulkDiscount bd1 = new BulkDiscount(10,20);//(min,percent)
		BulkNItemsGetOneFree bn1 = new BulkNItemsGetOneFree(10);//(n)
		CombinedDiscount cb1 = new CombinedDiscount(bd1,bn1);
		System.out.println(cb1.calculateDiscount(2,5));
	}
}
		
	
