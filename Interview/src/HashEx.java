import java.util.HashSet;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;


public class HashEx {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
hashSet.add("1");
System.out.println(hashSet.add("1"));
hashSet.add(1);
hashSet.add(2);
System.out.println(hashSet);
}

}
