package chapter13;

import java.util.Objects;

public class Cart {
	private String cartMember;
	private String cartNo;
	private String cartProd;
	private int cartQty;
	@Override
	public int hashCode() {
		return Objects.hash(cartNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Cart)) {
			return false;
		}
		Cart other = (Cart) obj;
		return Objects.equals(cartNo, other.cartNo);
	}
	
}
