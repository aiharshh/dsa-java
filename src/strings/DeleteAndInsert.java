package strings;
public class DeleteAndInsert {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdef");
		System.out.println(sb); //abcdef
		sb.deleteCharAt(3);
		System.out.println(sb); // d is deleted
		System.out.println(sb.charAt(3)); // e
		sb.append("xyz");
		System.out.println(sb); //abcefxyz
		sb.delete(2, 6); // 5 ke badle 6 dena hota hai ek extra
		System.out.println(sb);
//		sb.setCharAt(2, 'g');
//		System.out.println(sb); // abgz -> 
		//but mai chahta hu ki g 2nd index pe aajaye and y shift hojana chahiye
		sb.insert(2,'g'); 
		// WE can even Insert Integer, String and Boolean values!!
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
