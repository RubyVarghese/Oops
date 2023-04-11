package reviewInterface2;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList2 {
	

	public class Arraylist2 {

		public static void main(String[] args) {
			ArrayList<Integer> ar=new ArrayList<Integer>();
			ar.add(1);
			ar.add(2);
			ar.add(3);
			ar.add(4);
			ar.add(5);
			Iterator itr= ar.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
					
				}
				
				
			}
			

		}

	}


