package mycode;

public class EnumDemo {

	
	public enum Food {
		HAMBURGER(7), FRIES(2), HOTDOG(3), ARTICHOKE(4);

		// private constructor that can be used to initialize instance fields
		Food(int price) {
			this.price = price;
		}

		private final int price;

		public int getPrice() {
			return price;
		}
	}

	public static void main(String[] args) {
		for (Food f : Food.values()) {
			System.out.print("Food: " + f + ", ");

			if (f.getPrice() >= 4) {
				System.out.print("Expensive, ");
			} else {
				System.out.print("Affordable, ");
			}

			switch (f) {
			case HAMBURGER:
				System.out.println("Tasty");
				continue;
			case ARTICHOKE:
				System.out.println("Delicious");
				continue;
			default:
				System.out.println("OK");
			}
		}

	}

}
