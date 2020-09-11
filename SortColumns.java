import java.util.*;

public class SortColumns{


	public SortColumns(){};

	public List <Integer> minDeletionSize(String [] a){//finding incorrect columns
		
		List<Integer> indices = new ArrayList<Integer>();
		boolean cont = true;

		for(int ch = 0; ch < a[0].length(); ch++){	//for each character in a string
			
			if (cont){
				
				for(int col = 0; col<a.length - 1; col++){	//for each column of a string
					
					if(a[col].length() == a[col+1].length()){	//check to see if they are the same string length
						
						if(a[col].charAt(ch) > a[col+1].charAt(ch)){	//if the characters are in not sorted
							indices.add(ch);	//add the indices of the unsorted strings
							break;
						}
					}
					
					else
					{
						cont = false;
					}
				}
			}
			
			else{
				indices.add(-1);	//if they are not of equal string length, return -1
				break;
			}	
		}	
		return indices;
	}

	public static void main(String [] args){
		
		String [] a = new String[] {"cba", "daf", "ghi"};
		SortColumns s = new SortColumns();
		List<Integer> d = s.minDeletionSize(a);
		System.out.println(d.toString());
		
	}
}

/*
	Ex. {"cba", "daf", "ghi"}
	Output: {1}
	Each column: ["c" , "d", "g"] ["b" , "a", "h"] ["a" , "f", "i"]
	Deleted: ["b" , "a", "h"] (Index: 1) because it is not sorted
*/